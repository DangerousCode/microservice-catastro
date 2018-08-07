package com.ust.catastro.clients.impl;

import java.io.IOException;

import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceMessageExtractor;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.w3c.dom.DOMException;

import com.ust.catastro.clients.CatastroDetailClient;

@Service
public class CatastroDetailClientImpl extends WebServiceGatewaySupport implements CatastroDetailClient {

	private static final String ACTION = "http://tempuri.org/OVCServWeb/OVCCallejero/Consulta_DNPRC";

	public CatastroDetailClientImpl(Jaxb2Marshaller marshaller) {
		this.setDefaultUri("http://ovc.catastro.meh.es/ovcservweb/ovcswlocalizacionrc/ovccallejero.asmx");
	}

	// @Override
	public Double getCatastroDetail(String refCatastro) {

		String surface = (String) getWebServiceTemplate().sendAndReceive(getDefaultUri(),
				new WebServiceMessageCallback() {

					public void doWithMessage(WebServiceMessage message) {

						try {
							SaajSoapMessage saajMessage = (SaajSoapMessage) message;
							saajMessage.setSoapAction(ACTION);
							SOAPMessage soapmess = saajMessage.getSaajMessage();
							SOAPEnvelope env = soapmess.getSOAPPart().getEnvelope();
							env.addNamespaceDeclaration("cat", "http://www.catastro.meh.es/");
							env.getBody().addChildElement("RefCat", "cat").addTextNode(refCatastro.trim());
						} catch (Exception e) {
							throw new RuntimeException("Marshalling exception", e);
						}
					}

				}, new WebServiceMessageExtractor<Object>() {
					public String extractData(WebServiceMessage response) throws IOException {
						SaajSoapMessage saajMessage = (SaajSoapMessage) response;
						SOAPMessage soapmess = saajMessage.getSaajMessage();
						String value;
						try {
							value = soapmess.getSOAPBody().getElementsByTagName("stl").item(0).getTextContent();
						} catch (DOMException e) {
							throw new RuntimeException("Marshalling exception", e);
						} catch (SOAPException e) {
							throw new RuntimeException("Marshalling exception", e);
						}
						return value;
					}

				});

		return Double.valueOf(surface);
	}

}

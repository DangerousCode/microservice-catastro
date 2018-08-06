package com.ust.catastro.clients.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.ust.catastro.clients.CatastroDetailClient;
import com.ust.catastro.clients.entity.CatastroSoap;

@Service
public class CatastroDetailClientImpl extends WebServiceGatewaySupport implements CatastroDetailClient {
	
	
	
	public CatastroDetailClientImpl(Jaxb2Marshaller marshaller) {
		this.setDefaultUri("http://localhost:8083/ws");
		this.setMarshaller(marshaller);
		this.setUnmarshaller(marshaller);
	}

	//@Override
	public CatastroSoap getCatastroDetail(String refCatastro) {
		/*
			Lo siguiente es un ejemplo genérico tanto de petición como respuesta SOAP. las marcas mostradas necesitan ser sustituidas por valores reales.

			POST /ovcservweb/ovcswlocalizacionrc/ovccallejero.asmx HTTP/1.1
			Host: ovc.catastro.meh.es
			Content-Type: text/xml; charset=utf-8
			Content-Length: length
			SOAPAction: "http://tempuri.org/OVCServWeb/OVCCallejero/Consulta_DNPRC"

			<?xml version="1.0" encoding="utf-8"?>
			<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  			<soap:Body>
    			<Provincia xmlns="http://www.catastro.meh.es/">string</Provincia>
    			<Municipio xmlns="http://www.catastro.meh.es/">string</Municipio>
    			<RefCat xmlns="http://www.catastro.meh.es/">string</RefCat>
  			</soap:Body>
			</soap:Envelope>
			HTTP/1.1 200 OK
			Content-Type: text/xml; charset=utf-8
			Content-Length: length

			<?xml version="1.0" encoding="utf-8"?>
			<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  			<soap:Body>
    			<Consulta_DNP xmlns="http://www.catastro.meh.es/">xml</Consulta_DNP>
  			</soap:Body>
			</soap:Envelope>
		 */
		
		
		String request = new String(
				"<?xml version=\"1.0\" encoding=\"utf-8\"?>"
				+ "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
				+   "<soap:Body>"
				+    "<Provincia xmlns=\"http://www.catastro.meh.es/\"></Provincia>"
				+    "<Municipio xmlns=\"http://www.catastro.meh.es/\"></Municipio>"
				+    "<RefCat xmlns=\"http://www.catastro.meh.es/\">0847106VK4704F0008HP</RefCat>"
				+  "</soap:Body>"
				+ "</soap:Envelope"				
				);
		
		
		Object response = (Object) getWebServiceTemplate()
				.marshalSendAndReceive("http://tempuri.org/OVCServWeb/OVCCallejero/Consulta_DNPRC", request, null);

		return null; // TODO
	}

}

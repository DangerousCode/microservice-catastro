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
		
		List<String> request = new ArrayList<String>();
		request.add(refCatastro);
		
		Object response = (Object) getWebServiceTemplate()
				.marshalSendAndReceive("http://ovc.catastro.meh.es/ovcservweb/OVCSWLocalizacionRC/OVCCallejero.asmx?wsdl", request, null);

		return null; // TODO
	}

}

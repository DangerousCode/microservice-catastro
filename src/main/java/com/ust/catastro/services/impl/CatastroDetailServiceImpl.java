package com.ust.catastro.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.ust.catastro.clients.CatastroDetailClient;
import com.ust.catastro.clients.entity.CatastroSoap;
import com.ust.catastro.model.CatastroDetail;
import com.ust.catastro.services.CatastroDetailService;

@Service
public class CatastroDetailServiceImpl implements CatastroDetailService {
	
	private final CatastroDetailClient catastroDetailClient;
	
	
	public CatastroDetailServiceImpl(CatastroDetailClient catastroDetailClient) {
		this.catastroDetailClient = catastroDetailClient;
	}	
	
	//@Override
	public CatastroDetail getCatastroDetail(final String refCatastro) {
		CatastroSoap response = catastroDetailClient.getCatastroDetail(refCatastro);
		return null; // TODO
	}

}

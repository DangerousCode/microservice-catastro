package com.ust.catastro.services.impl;

import org.springframework.stereotype.Service;

import com.ust.catastro.clients.CatastroDetailClient;
import com.ust.catastro.model.CatastroDetail;
import com.ust.catastro.services.CatastroDetailService;
import com.ust.catastro.services.converters.CatastroSoapToCatastroDetail;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CatastroDetailServiceImpl implements CatastroDetailService{

	private final CatastroDetailClient catastroDetailClient;
	private final CatastroSoapToCatastroDetail catastroSoapToCatastroDetail;
	
	@Override
	public CatastroDetail getCatastroDetail(String refCatastro) {
		CatastroDetail catastroDetail = new CatastroDetail();
		catastroDetailClient.getCatastroDetail(refCatastro);
//		catastroDetail = catastroSoapToCatastroDetail.convert();
		
		return catastroDetail;
	}
	
}

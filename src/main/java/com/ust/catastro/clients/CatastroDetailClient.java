package com.ust.catastro.clients;

import com.ust.catastro.clients.entity.CatastroSoap;

public interface CatastroDetailClient {
	
	public CatastroSoap getCatastroDetail(final String refCatastro);

}

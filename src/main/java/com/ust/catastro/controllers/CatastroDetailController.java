package com.ust.catastro.controllers;

import org.springframework.http.ResponseEntity;
import com.ust.catastro.model.CatastroDetail;

public interface CatastroDetailController {
	
	public ResponseEntity<Double> getCatastroDetail(final String refCatastro);

}

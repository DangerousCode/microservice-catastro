package com.ust.catastro.controllers;

import org.springframework.http.ResponseEntity;

import com.ust.catastro.model.CatastroDetail;

public interface CatastroDetailController {

	public ResponseEntity<CatastroDetail> getCatastroDetail(final String refCatastro);
}

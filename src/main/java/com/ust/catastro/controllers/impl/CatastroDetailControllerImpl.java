package com.ust.catastro.controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ust.catastro.controllers.CatastroDetailController;
import com.ust.catastro.model.CatastroDetail;
import com.ust.catastro.services.CatastroDetailService;

import lombok.RequiredArgsConstructor;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
public class CatastroDetailControllerImpl implements CatastroDetailController {
	
	private final CatastroDetailService catastroDetailService;
	
	
	@Autowired
	public CatastroDetailControllerImpl(CatastroDetailService catastroDetailService) {
		this.catastroDetailService = catastroDetailService;
	}
	
	
	@ApiOperation(value = "get catastro detailed info through refCatastro", httpMethod = "GET", response = CatastroDetail.class, nickname = "getCatastroDetail", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiResponses({ @ApiResponse(code = 200, message = "catastro detailed info retrieved") })
	@GetMapping("/catastro/{refCatastro}")
	//@Override
	public ResponseEntity<Double> getCatastroDetail(@PathVariable(required=true) final String refCatastro) {
		
		return new ResponseEntity<Double>(catastroDetailService.getCatastroDetail(refCatastro),HttpStatus.OK);
		
	}

}

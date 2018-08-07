package com.ust.catastro.controllers.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ust.catastro.controllers.CatastroDetailController;
import com.ust.catastro.model.CatastroDetail;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags= {"Catastro"})
@RestController
public class CatastroDetailControllerImpl implements CatastroDetailController {

	@GetMapping("/catastro/{refCatastro}")
	@ApiOperation(
		value = "Devuelve los detalles de una parcela."
	)
	@ApiResponses({
		@ApiResponse(code = 200, message = "La referencia catastral existe"),
		@ApiResponse(code = 400, message = "Request erronea"),
		@ApiResponse(code = 500, message = "Error interno")
	})
	@Override
	public ResponseEntity<CatastroDetail> getCatastroDetail(@PathVariable("refCatastro")String refCatastro) {
		CatastroDetail catastroDetail = new CatastroDetail();
		catastroDetail.setRefCatastro(refCatastro);
		catastroDetail.setSuperficie(100.00);
		catastroDetail.setTipoUso("VIVIENDA");
		return new ResponseEntity<CatastroDetail>(catastroDetail, HttpStatus.OK);
	}

}

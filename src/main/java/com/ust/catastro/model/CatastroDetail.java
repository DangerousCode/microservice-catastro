package com.ust.catastro.model;

import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Clase que representa los detalles de una parcela.")
public class CatastroDetail {

	@ApiModelProperty(
			value="Referencia Catastral. Value", 
			notes = "Referencia Catastral. Notes", 
			example = "0768705VK4706H0005LD", 
			required = true, 
			position = 0
	)
	@Size(min=10, max=20)
	private String refCatastro;
	
	@ApiModelProperty(notes = "Superficie en metros cuadrados de la parcela.", example = "89", required = true, position = 1)
	private Double superficie;
	@ApiModelProperty(notes = "Tipo de uso de la parcela.", example = "VIVIENDA", required = true, position = 2)
	private String tipoUso;

	public String getRefCatastro() {
		return refCatastro;
	}

	public void setRefCatastro(String refCatastro) {
		this.refCatastro = refCatastro;
	}

	public Double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Double superficie) {
		this.superficie = superficie;
	}

	public String getTipoUso() {
		return tipoUso;
	}

	public void setTipoUso(String tipoUso) {
		this.tipoUso = tipoUso;
	}

}

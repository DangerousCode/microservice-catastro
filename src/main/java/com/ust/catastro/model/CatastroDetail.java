package com.ust.catastro.model;

import lombok.*;


@Getter
@AllArgsConstructor
@Builder
@Setter
@NoArgsConstructor
public class CatastroDetail {
	
	private String refCatastro;
	private String tipoUso;
	private String superficie;

}

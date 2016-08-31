package com.algaworks.wine.model;

public enum TipoVinho {
	
	TINTO("Tinto"),
	BRANCO("Branco"),
	ROSE("Rosé"),
	FRISANTE("Frisante");
	
	private String descricao;
	
	TipoVinho(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}
}

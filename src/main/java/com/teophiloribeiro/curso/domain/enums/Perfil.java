package com.teophiloribeiro.curso.domain.enums;

public enum Perfil {
	
	ADMIN(1, "ROLE_ADMIN"),
	CLIENTE(2, "ROLE_CLIENTE");
	
	private int cod;
	private String descricao;
	
	private Perfil(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	public String getDescricao() {
		return descricao;
	}
	
	//Static para ser possivel executar sem instanciar objetos
	public static Perfil toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for (Perfil x : Perfil.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido!");
		
	}
	
	
}

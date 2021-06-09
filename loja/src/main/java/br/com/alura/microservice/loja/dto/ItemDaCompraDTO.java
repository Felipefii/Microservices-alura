package br.com.alura.microservice.loja.dto;

public class ItemDaCompraDTO {

	private long id;
	private int qtde;	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
}

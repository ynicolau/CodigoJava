package com.lojagamer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @NotBlank(message = "Nome Obrigatorio")
    @Size(min = 3 , max = 50)
    private String nome;
    
    @NotBlank( message = "Tipo de produto Obrigatório")
	@Size(min = 3, max = 255)
	private String tipo;
    
    @NotNull(message = "Preço Obrigatorio")
    private Integer preco;
    
    @NotBlank(message = "Faixa Etaria Obrigatorio")
    @Size(min = 3 , max = 50)
    private String faixaIdade;
    
    @NotBlank(message = "Nome do console Obrigatorio")
    @Size(min = 3 , max = 50)
    private String console;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getPreco() {
		return preco;
	}

	public void setPreco(Integer preco) {
		this.preco = preco;
	}

	public String getFaixaIdade() {
		return faixaIdade;
	}

	public void setFaixaIdade(String faixaIdade) {
		this.faixaIdade = faixaIdade;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	@Size(min = 3 , max = 50)
    private String produtora;
	
}

package org.serratec.backend.bibliotecavittorio.model;

import jakarta.persistence.Column;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Preencha o titulo do livro")
    @Size(max = 100) // Defina o tamanho máximo adequado para o título
    @Column(nullable = false, length = 100) // Ajuste o tamanho da coluna no banco de dados
    private String titulo;
	
	@Embedded
	private Informacoes informacoes;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Informacoes getInformacoes() {
		return informacoes;
	}


	public void setInformacoes(Informacoes informacoes) {
		this.informacoes = informacoes;
	}

}

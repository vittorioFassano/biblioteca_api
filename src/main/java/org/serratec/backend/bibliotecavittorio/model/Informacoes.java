package org.serratec.backend.bibliotecavittorio.model;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public class Informacoes {

	@NotBlank(message = "Preencha o autor do livro")
	@Size(max = 40)
	@Column(nullable = false, length = 40)
	private String autor;

	@NotBlank(message = "Preencha a data de publicação do livro")
	@Column(nullable = false)
	private String publicacao;

	@NotBlank(message = "Preencha o autor do livro")
	@Size(max = 100)
	@Column(nullable = false, length = 100)
	private String editora;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getPublicacao() {
		return publicacao;
	}

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	public void setPublicacao(String publicacao) {
		this.publicacao = publicacao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

}

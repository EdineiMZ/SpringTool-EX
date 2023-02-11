package br.edu.unoesc.exemplo_H2.model;

import org.springframework.data.annotation.Id;

public record Livro(
	@Id
	Integer id,
	String titulo,
	Integer paginas,
	String autor
) {
}
package br.edu.unoesc.exemplo_H2.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.unoesc.exemplo_H2.model.Livro;

public interface LivroRepository extends CrudRepository<Livro, Integer> {

}

package com.amasoft.bookstore.service;

import org.springframework.stereotype.Service;

import com.amasoft.bookstore.domain.Categoria;
import com.amasoft.bookstore.domain.Livro;
import com.amasoft.bookstore.repositories.CategoriaRepository;
import com.amasoft.bookstore.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

@Service
public class DBService {


    @Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private LivroRepository livroRepository;

    public void instanciaBaseDeDados() {
            Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
            Categoria cat2 = new Categoria(null, "Informática", "Livros de TI");

    		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsum", cat1);
            Livro l2 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsum", cat2);

    		cat1.getLivros().addAll(Arrays.asList(l1));
    		cat2.getLivros().addAll(Arrays.asList(l2));

    		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
    		this.livroRepository.saveAll(Arrays.asList(l1, l2));
    }

}
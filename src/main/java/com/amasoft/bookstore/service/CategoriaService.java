package com.amasoft.bookstore.service;

import com.amasoft.bookstore.domain.Categoria;
import com.amasoft.bookstore.repositories.CategoriaRepository;
import com.amasoft.bookstore.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id) {
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objecto não encontrado! id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}

package com.demo.libros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.libros.models.Libro;
//import com.demo.libros.repositories.LibroRepositoryImpl;
import com.demo.libros.services.LibroService;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class LibroController {

    @Autowired
    // private LibroRepositoryImpl libroRepository;
    private LibroService libroService;

    @GetMapping("/libros")
    public List<Libro> getLibros() {
        return libroService.getLibros();
    }

    @GetMapping("/libros/{id}")
    public Libro getLibro(@PathVariable int id) {
        Libro libro = libroService.getLibro(id);
        return libro;
    }

    @PostMapping("/libros")
    public Libro nuevLibro(@RequestBody Libro libro) {
        libroService.nuevLibro(libro);
        return libro;
    }

}
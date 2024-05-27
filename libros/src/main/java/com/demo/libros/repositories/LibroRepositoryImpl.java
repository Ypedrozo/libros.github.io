package com.demo.libros.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.libros.models.Libro;

@Repository
public class LibroRepositoryImpl implements LibroRepository {
    private List<Libro> libros = new ArrayList<>();

    public LibroRepositoryImpl() {
        libros.add(new Libro(1, "Orgullo y prejuicio", "Jane Austen", "Alianza Editorial", 1813));
        libros.add(new Libro(2, "Bridgerton", "Julia Quinn", "Titania", 2004));
        libros.add(new Libro(3, "Puedes hacerme lo que quieras", "Miguel Cane", "Penguin House", 2024));
        libros.add(new Libro(4, "A orillas del rio piedra me sente y llore", "Paulo Coelho", "Planeta", 1994));
        libros.add(new Libro(5, "No se como mostrar donde me duele", "Amalia Andrade", "Planeta", 2024));
    }

    public Libro getLibro(int id) {
        System.out.println("Conectando a base de datos ORACLE");
        for (Libro libro : libros) {
            if (id == libro.getId())
                return libro;

        }

        return null;
    }

    public List<Libro> getLibros() {
        System.out.println("Conectando a base de datos ORACLE");
        return libros;
    }

    @Override
    public Libro nuevLibro(Libro libro) {
        libros.add(libro);
        return libro;
    }

}

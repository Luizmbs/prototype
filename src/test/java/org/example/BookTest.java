package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Book livro = new Book(123, "Livro A", new Location("Estante A", 1), "Autor A");

        Book livroClone = livro.clone();
        livroClone.setCodigo(456);
        livroClone.setTitulo("Livro B");
        livroClone.getLocalizacao().setPrateleira(2);

        assertEquals("Book{codigo=123, titulo='Livro A', localizacao=Location{estante='Estante A', prateleira=1}, autor='Autor A'}", livro.toString());
        assertEquals("Book{codigo=456, titulo='Livro B', localizacao=Location{estante='Estante A', prateleira=2}, autor='Autor A'}", livroClone.toString());
    }
}

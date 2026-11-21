package org.example;

public class Book implements Cloneable {
    private int codigo;
    private String titulo;
    private Location localizacao;
    private String autor;

    public Book(int codigo, String titulo, Location localizacao, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.localizacao = localizacao;
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Location getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Location localizacao) {
        this.localizacao = localizacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        Book livroClone = (Book) super.clone();
        livroClone.localizacao = (Location) livroClone.localizacao.clone();
        return livroClone;
    }

    @Override
    public String toString() {
        return "Book{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", localizacao=" + localizacao +
                ", autor='" + autor + '\'' +
                '}';
    }
}

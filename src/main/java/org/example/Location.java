package org.example;

public class Location implements Cloneable {
    private String estante;
    private Integer prateleira;

    public Location(String estante, Integer prateleira) {
        super();
        this.estante = estante;
        this.prateleira = prateleira;
    }

    public String getEstante() {
        return estante;
    }

    public void setEstante(String estante) {
        this.estante = estante;
    }

    public Integer getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(Integer prateleira) {
        this.prateleira = prateleira;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Location{" +
                "estante='" + estante + '\'' +
                ", prateleira=" + prateleira +
                '}';
    }
}

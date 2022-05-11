package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private String name;
    private String cor;
    private String idade;

    public Gato() {}

    public Gato(String name, String cor, String idade) {
        this.name = name;
        this.cor = cor;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(name, gato.name) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cor, idade);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "name='" + name + '\'' +
                ", cor='" + cor + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }
}



package com.techprimers.kafka.model;

public class User{

    private String name;
    private String idade;

    public User() {
    }

    public User(String name, String idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}

package br.com.cars.model;

public class Driver {
    private String name;
    private String cpf;

    public Driver(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "ModuleDriver [name=" + name + ", cpf=" + cpf + "]";
    }
}

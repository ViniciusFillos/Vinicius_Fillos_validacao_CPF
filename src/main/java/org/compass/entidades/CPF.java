package org.compass.entidades;

public class CPF {
    String cpf;

    public CPF(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "CPF: "+ cpf;
    }
}

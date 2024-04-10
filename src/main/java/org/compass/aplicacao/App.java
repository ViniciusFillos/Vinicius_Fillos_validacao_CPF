package org.compass.aplicacao;

import org.compass.entidades.CPF;
import org.compass.servicos.Valicao;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<CPF> cpfs = new ArrayList<>();
        List<CPF> cpfsInvalidos = new ArrayList<>();
        List<CPF> cpfsValidos = new ArrayList<>();

        cpfs.add(new CPF("98765432100"));
        cpfs.add(new CPF("11122233344"));
        cpfs.add(new CPF("12345678910"));
        cpfs.add(new CPF("55566677788"));
        cpfs.add(new CPF("12345678912312"));
        cpfs.add(new CPF("12312312"));
        cpfs.add(new CPF("12"));
        cpfs.add(new CPF("12345678944"));
        cpfs.add(new CPF("A12547"));
        cpfs.add(new CPF("A1231231232"));
        cpfs.add(new CPF("123.123.123-22"));
        cpfs.add(new CPF("123.123.123-23"));
        cpfs.add(new CPF("123.123.123-24"));
        cpfs.add(new CPF("123.123.123-241"));
        cpfs.add(new CPF("123.123.123-2"));
        cpfs.add(new CPF("123.123.123-2411"));

        System.out.println();
//        for (CPF cpf : cpfs) {
//            if(Valicao.validarTamanho(cpf)) cpfsValidos.add(cpf);
//            else cpfsInvalidos.add(cpf);
//        }

        for (CPF cpf : cpfs) {
            if(Valicao.validarNumerico(cpf)) cpfsValidos.add(cpf);
            else cpfsInvalidos.add(cpf);
        }

        System.out.println("--------------------");
        System.out.println("CPF's Inválidos");
        for (CPF cpf : cpfsInvalidos) {
            System.out.println(cpf);
        }

        System.out.println();
        System.out.println("--------------------");
        System.out.println("CPF's Válidos");
        for (CPF cpf : cpfsValidos) {
            System.out.println(cpf);
        }
    }
}

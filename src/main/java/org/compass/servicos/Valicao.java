package org.compass.servicos;

import org.compass.entidades.CPF;

public class Valicao {

    public static boolean validarTamanho(CPF cpf){
        return cpf.getCpf().length()==11;
    }

    public static boolean validarNumerico(CPF cpf){
        boolean flag;
        try {
            long iscpf = Long.parseLong(cpf.getCpf());
            flag = true;
        } catch (Exception e){
            flag = false;
        }
        return flag;
    }
}

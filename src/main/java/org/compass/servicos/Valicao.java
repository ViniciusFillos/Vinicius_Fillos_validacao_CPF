package org.compass.servicos;

import org.compass.entidades.CPF;

public class Valicao {

    public static boolean validarTamanho(CPF cpf){
        return cpf.getCpf().length()==11;
    }

    public static boolean validarNumerico(CPF cpf){
        CPF cpfLimpo = limparCpf(cpf);
        boolean flag;
        try {
            long cpfLong = Long.parseLong(cpfLimpo.getCpf());
            flag = true;
        } catch (Exception e){
            flag = false;
        }
        return flag;
    }

    public static CPF limparCpf(CPF cpf){
        CPF cpfLimpo = new CPF(cpf.getCpf());
        cpfLimpo.setCpf(cpfLimpo.getCpf().replace(".", ""));
        cpfLimpo.setCpf(cpfLimpo.getCpf().replace("-", ""));
        return cpfLimpo;
    }
}

package com.example.CalculadorIVA.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public double sumarIVA (Integer iva, Integer precio){
        Integer impuesto= precio*iva/100;
        double resultado=precio+impuesto;
        return resultado;
    }

    public double deducirIVA(Integer iva, Integer precio){

        Integer impuesto=precio*iva/100;
        Integer deduccion=1-(iva/100);
        double resultado=precio*deduccion;

        return resultado;
    }

}

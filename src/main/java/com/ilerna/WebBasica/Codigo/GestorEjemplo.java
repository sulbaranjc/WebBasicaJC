package com.ilerna.WebBasica.Codigo;

public class GestorEjemplo {
    private int numero=0;
    public int randomNum(){
        int nuevoNumero;
        do {
            nuevoNumero = (int) (Math.random() * 100);
        }while (nuevoNumero == numero);
        numero = nuevoNumero;
        return nuevoNumero;
    }
}

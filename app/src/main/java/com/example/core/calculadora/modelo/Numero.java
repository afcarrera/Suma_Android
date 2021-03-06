package com.example.core.calculadora.modelo;

/**
 * Numero.java:
 *
 *  Clase que contiene metodos encapsulados de un número.
 *
 * @author Alberto Carrera
 * @version 1.0, 07/06/2020
 * @since 1.0, 31/05/2020
 */

public class Numero {
    /** Un número */
    private Double numero;

    /** Consturctor vacio de la clase Numero*/
    public Numero(){
        numero=0.0;
    }

    /** Consturctor de la clase Numero*/
    public Numero(Double numero){
        this.numero=numero;
    }

    /** Obtiene un número */
    public Double getNumero() {
        return numero;
    }

    /**
     * Almacena un número.
     *
     * @param numero Valor a almacenar en el atributo "numero"
     */
    public void setNumero(Double numero) {
        this.numero = numero;
    }
}

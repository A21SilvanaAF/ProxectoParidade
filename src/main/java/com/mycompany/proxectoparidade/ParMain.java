package com.mycompany.proxectoparidade;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author A21SilvanaAF
 */
public class ParMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numeroProba=lerNumero(entrada);
        System.out.println(comprobarParidade(numeroProba));
    }

    static String comprobarParidade(int numeroProba) {
        String resultado;
        if (verificaPar(numeroProba)){
            resultado=EL_NUMERO_ES_PAR;
        }
        else{
            resultado=EL_NUMERO_ES_IMPAR;
        }
        return resultado;
    }

    static boolean verificaPar(int numeroProba) {
        return numeroProba%2==0;
    }
    private static final String EL_NUMERO_ES_IMPAR = "El numero es impar";
    private static final String EL_NUMERO_ES_PAR = "El numero es par";

    private static int lerNumero(Scanner in) {
        System.out.println("Introduce un número:");
        int numeroProba=in.nextInt();
        return numeroProba;
    }
    
}

package com.mycompany.proxectoparidade;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *Comproba a paridade dun número enteiro
 * @author A21SilvanaAF
 */
public class ParMain {
    
    private static final String EL_NUMERO_ES_IMPAR = "El numero es impar";
    private static final String EL_NUMERO_ES_PAR = "El numero es par";

    /**
     * le un número estandar e comproba a súa paridade
     * @param args argumentos da liña de comandos
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numeroProba=lerNumero(entrada);
        System.out.println(comprobarParidade(numeroProba));
    }
    
    /**
     * Indica se numeroProba é par ou impar
     * @param numeroProba número enteiro a comprobar
     * @return cadea indicando a paridade
     */

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
    
    /**
     * verifica se numeroProba é par
     * @param numero Proba número enteiro a comprobar
     * @return booleano con valor true se o número é par
     */

    static boolean verificaPar(int numeroProba) {
        return numeroProba%2==0;
    }
    
    /**
     * Le o número da entrada estándar
     * @param in representa a entrada estándar
     * @return enteiro inserido polo usuario
     */
    

    private static int lerNumero(Scanner in) {
        System.out.println("Introduce un número:");
        int numeroProba=in.nextInt();
        return numeroProba;
    }
    
}

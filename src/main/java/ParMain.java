
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
        Scanner in=new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numeroProba=in.nextInt();
        if (numeroProba%2==0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero no es par");
        }
    }
    
}

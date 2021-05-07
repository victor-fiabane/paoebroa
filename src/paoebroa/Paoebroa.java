/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paoebroa;

import java.util.Scanner;

/**
 *
 * @author Sandro Fiabane
 */
public class Paoebroa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner teclado = new Scanner(System.in);
     
     double pao, broa, quantipao, quantibroa, total, totalpoup;
     
     pao = 0.12;
     broa = 1.50;
        System.out.println("Quantidade de pães vendidos: ");
        quantipao = teclado.nextDouble();
        System.out.println("Quantidade de broas vendidadas: ");
        quantibroa = teclado.nextDouble();
        total = (pao*quantipao)+(broa*quantibroa);
        totalpoup = total*0.10;
        System.out.println("O total arrecadado foi de: "+total);
        System.out.println("O total a ser depositado na poupança é de: "
                +totalpoup);

    }
    
}

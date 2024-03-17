/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 1. Escreva um algoritmo que leia 3 números a partir do teclado.
        O algoritmo deve apresentar:
        a. O maior número.
        b. O menor número.
        c. A média aritmética dos três números.
        */
        //função Scanner
        Scanner input = new Scanner(System.in);
        //declaração das variaveis
        double n1, n2, n3, maior, menor, media;
        //Solicitação e leitura dos dados inseridos pelo usuario
        System.out.println("Insira Três números: ");
        System.out.println("Número 1: ");
        n1 = input.nextDouble();
        System.out.println("Número 2: ");
        n2 = input.nextDouble();
        System.out.println("Número 3: ");
        n3 = input.nextDouble();
        //Maior número
        if (n1 >= n2 && n1 >= n3){
            maior = n1;
        }else if (n2 >= n1 && n2 >= n3){ 
            maior = n2;
        }else {
            maior = n3;
        }
        //Menor número
        if (n1 <= n2 && n1 <= n3){
            menor = n1;
        }else if (n2 <= n1 && n2 <= n3){
            menor = n2;
        } else {
            menor = n3;
        }
        //Cálculo da média 
        media = (n1 + n2 + n3) / 3;
        //impressão dos resultados
            System.out.println("O maior número é: "+ maior);
            System.out.println("O menor número é: "+ menor);
            System.out.println("A média dos valor inseridos é: "+ media);
            
            input.close();
            
            }
            
}
        
    

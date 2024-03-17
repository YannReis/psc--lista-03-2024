/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex05;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Habilita a leitura do teclado
        Scanner input = new Scanner(System.in);
        //declaração das variaveis
        double n1, n2, total = 0;
        char op;
        //Solicitação dos dados 
        System.out.println("Insira o primeiro número: ");
        n1 = input.nextDouble();
        System.out.println("Insira o segundo número: ");
        n2 = input.nextDouble();
        System.out.println("Inisra um símbolo de operação (+, -, *, /, ^): ");
        op = input.next().charAt(0);
        //Switch case das operações matemáticas
        switch(op){
            case '+':
                total = n1 + n2;
                break;
            case '-':
                total = n1 - n2;
                break;
            case '*':
                total = n1 * n2;
                break;
            case '^':
                total = Math.pow(n1, n2);
                break;
            case '/':
                if (n2 != 0){
                total = n1 / n2;
                }else{
                    System.out.println("Não é possível dividir um numero por ZERO");
                }
                break;
                
        }
        //impressão do resultado
        System.out.printf("O resultado da operação é: %.2f\n", total);
                input.close();
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Habilita a leitura do teclado
        Scanner input = new Scanner(System.in);
        //declaração das variaveis
        double a, b, c, delta, raiz, raiz1, raiz2;
        //Solicitação dos dados ao usuario
        System.out.println("Digite o valor A: ");
        a = input.nextDouble();
        System.out.println("Digite o valor B: ");
        b = input.nextDouble();
        System.out.println("Digite o valor C: "); 
        c = input.nextDouble();
        //If else para saber se os dados foram inseridos corretamente e especificar o tipo da equação
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Os coeficientes foram informados incorretamente");
        } else if ( a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau.");
            raiz = -c / b;
        } else {
            delta = b * b - 4 * a * c;
            if ( delta < 0) {
                System.out.println("Esta equação não possui raizes reais");
            }else if (delta == 0){
                System.out.println("Esta equação possui duas raízes reais iguais. ");
                //calculo da raiz
                raiz = -b / (2 * a);
                System.out.println("Raíz: "+raiz);
            }else{
                //calculo das raizes distintas
                System.out.println("Essa equação possuí raízes distintas: ");
                raiz1 = (-b + Math.sqrt(delta)) / 2 * a;
                raiz2 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.println("Raíz 1: "+ raiz1);
                System.out.println("Raíz 2"+ raiz2);
            }
        }
        input.close();
    }
    
}

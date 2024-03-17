/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex06;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Habilita a leitura do teclado
        Scanner input = new Scanner(System.in);
        //Adiciona a variavel de numero aleatorio
        Random random = new Random();
        //declaração das variaveis
        int numero1, numero2, menor, maior, sorteio;

        //Leitura dos dados do usuario
        System.out.print("Insira o primeiro número: ");
        numero1 = input.nextInt();
        System.out.print("Insira o segundo número: ");
        numero2 = input.nextInt();

        //Menor e Maior
        menor = Math.min(numero1, numero2);
        maior = Math.max(numero1, numero2);

        //Sorteio do numero aleatorio
        sorteio = menor + random.nextInt(maior - menor + 1);

        // Verifica se o número sorteado é par ou ímpar e imprime o resultado
        if (sorteio % 2 == 0) {
            System.out.println("O número sorteado é par:" + sorteio);
        } else {
            System.out.println("O número sorteado é ímpar:" + sorteio);
        }

        input.close();
    }
}
 
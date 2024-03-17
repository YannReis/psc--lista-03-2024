/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Habilita a leitura do teclado
        Scanner input = new Scanner(System.in);
        //declaração das variáveis
        int op;
        double raio, perimetro, area, volume;
        //Solicitação de dados ao usuário
        System.out.println("Insira o código da operação: ");
        op = input.nextInt();
        System.out.println("Insira o raio da esfera ou círculo: ");
        raio = input.nextDouble();
        //Switch case com as operações matemáticas
        switch (op) {
            
            case 1: 
                // Perímetro do círculo
                perimetro = 2 * Math.PI * raio;
                System.out.printf("O perímetro do círculo é: %.2f\n", perimetro);
                break;
            
            case 2: 
                // Área do círculo
                area = Math.PI * raio * raio;
                System.out.printf("A área do círculo é: %.2f\n", area);
                break;
            
            case 3: 
                // Volume da esfera
                volume = (4.0/3) * Math.PI * raio * raio * raio;
                System.out.printf("O volume da esfera é: %.2f\n", volume);
                break;
            
            default: 
                // Código inválido
                System.out.println("O código da operação é inválido.");
                
        }
    }
    
}

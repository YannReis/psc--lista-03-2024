/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Leitura do teclado
        Scanner input = new Scanner(System.in);
        //declaração das variaveis e seus valores
        double vCompra, vPago, troco;
        int[] nota =  {50, 20, 10, 5, 2, 1};
        int[] qNota = new int[nota.length];
        //Impressão e solicitação de dados ao usuario
        System.out.println("Qual foi o valor da compra? R$");
        vCompra = input.nextDouble();
        System.out.println("Qual foi o valor pago? R$");
        vPago = input.nextDouble();
        //If else para saber se o valor é suficiente ou qual será o troco 
        if (vPago < vCompra){
            System.out.println("Valor insuficiente");
        } else {
            troco = vPago - vCompra;
            System.out.println("O seu troco será: R$"+ troco);
            calcTroco(troco, nota, qNota);
        }
        input.close();
        
        }
         //criação da classe para o calculo do troco
         public static void calcTroco(double troco, int[] nota, int[] qNota){
            for(int i = 0; i < nota.length; i++) {
                qNota[i] = (int)(troco/nota[i]);
                troco -= qNota[i] * nota[i];
            }
            //impressão das notas utilizadas no troco
             System.out.println("Notas do troco:");
             for (int i=0; i < nota.length; i++){
                 System.out.println("R$"+ nota[i]+",00 " + qNota[i]+" nota(s)");
                 
            }
            
             
    }
    
}

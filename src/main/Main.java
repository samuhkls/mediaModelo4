/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Samth
 */
public class Main {

    public static void main(String[] args) {
        double media;
        
        notasAluno dados = new notasAluno();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        dados.setNota1(scanner.nextDouble());

        System.out.print("Digite a nota 2: ");
        dados.setNota2(scanner.nextDouble());

        System.out.print("Digite a nota 3: ");
        dados.setNota3(scanner.nextDouble());

        

        Boletim bol = new Boletim();

        media = bol.calcularMedia(dados);
        
        String situacao = bol.verificarSituacao(media);
        System.out.println(situacao);
    }
    
}

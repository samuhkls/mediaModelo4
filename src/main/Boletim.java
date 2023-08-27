/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Samth
 */
public class Boletim {
    public double calcularMedia(notasAluno notas){
        double media;
        //notasAluno dados = new notasAluno();
        
        media = (notas.getNota1() + notas.getNota2() + notas.getNota3()) / 3;
        System.out.println("resultado " +media);
        return media;
    }
    public String verificarSituacao(double media){
    //
    if (media >= 6){
        return "aprovado";
    }
    else{
        return "reprovado";
    }
    
}
}

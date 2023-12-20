/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TarefaReflection;

import java.lang.annotation.Annotation;

/**
 *
 * @author alan.menezes
 */
public class Main {
    
   
    public static void main(String[] args) {
         Class clazz = Tabela.class;
         System.out.println(clazz.getClass() + "\n" + clazz);
         
         Class<?> classe = Tabela.class;
         Annotation[] annotations = classe.getAnnotations();
         for (Annotation annotation : annotations) {
             if (annotation instanceof Tabela) {
                 Tabela tabelaAnnotation = (Tabela)annotation;
                 String nomeDaTabela = tabelaAnnotation.nome();
                 System.out.println("Nome da Tabela: " + nomeDaTabela);
             }
        }
              
    }   
}

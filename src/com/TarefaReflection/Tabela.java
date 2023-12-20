/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TarefaReflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author alan.menezes
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Tabela(nome = "Interface Tabela")
public @interface Tabela {
    String nome();
}

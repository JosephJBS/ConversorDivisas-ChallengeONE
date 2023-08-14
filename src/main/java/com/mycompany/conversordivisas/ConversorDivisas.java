/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conversordivisas;

import java.io.IOException;

/**
 *
 * @author josep
 */
public class ConversorDivisas {

    public static void main(String[] args) throws IOException {
        ApiCall call = new ApiCall();
        call.ontenerArrayListDeDivisas();
        System.out.println(call.convertirDivisa("USD", "PEN",1));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversordivisas.Responses;

import java.util.ArrayList;

/**
 *
 * @author josep
 */
public class DivisasCodeResponse {
    public String result;
    public String documentation;
    public String terms_of_use;
    public ArrayList<ArrayList<String>> supported_codes;

    @Override
    public String toString() {
        return "DivisasCode{" +
                "result='" + result + '\'' +
                ", documentation='" + documentation + '\'' +
                ", terms_of_use='" + terms_of_use + '\'' +
                ", supported_codes=" + supported_codes +
                '}';
    }
}

package com.kgisl.junit;

import java.util.Arrays;
import java.util.List;

public class Ex13 {

   public static void main(String[] args) {


       List<String> name = Arrays.asList("GIRI", "PRASATH");

       String[] array = name.toArray(new String[0]);

       System.out.println(Arrays.toString(array));

   }

}
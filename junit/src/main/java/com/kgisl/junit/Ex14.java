package com.kgisl.junit;

import java.util.Arrays;
import java.util.List;

public class Ex14 {

   public static void main(String[] args) {


       List<String> name = Arrays.asList("item1", "item2","item3");

       String[] array = name.toArray(new String[0]);

       System.out.println(Arrays.toString(array));

   }

}
package com.kgisl.junit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Read {
    public static void main(String[] args)
    throws FileNotFoundException {
        File A=new File("C:\\Users\\trainee.KGISL\\Desktop\\READ.txt");
        Scanner AB =new Scanner(A);
        AB.useDelimiter("\\Z");

  System.out.println(AB.next());
        
        
    }

}
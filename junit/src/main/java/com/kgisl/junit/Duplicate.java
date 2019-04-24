package com.kgisl.junit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Duplicate {
    public static void main(String[] args) {
        ArrayList<String> ab = new ArrayList<String>();
        ArrayList<String> bc = new ArrayList<String>();
        ab.add("giri");
        ab.add("kavin");
        ab.add("sasi");
        ab.add("giri");
        ab.add("kavin");
        ab.add("sasi");
        ab.add("sanjeev");
        ab.add("kannan");
        ab.add("gowtham");
        ab.add("haja");

        // for (String dupWord : ab) {

        // if (!bc.contains(dupWord)) {
        // bc.add(dupWord);

        // for(int i=0;i<ab.size();i++){

        // for(int j=i+1;j<ab.size();j++){
        // if(ab.get(i).equals(ab.get(j))){
        // // ab.remove(j);
        // //j--;
        // System.out.println("After Removing duplicate elements:"+ab);

        List<Object> listWithoutDuplicates = ab.stream().distinct().collect(Collectors.toList());
         
        System.out.println(listWithoutDuplicates);
    
            }
        }
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Anagrams {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String compare="binary";
        String contrast="brainy";
        int counter=0;
        List list=new ArrayList();
        String[] input={"tar","rat","art","meats","steam"};
            for(int i=0; i<input.length; i++){
                for(int j=i+1; j<input.length; j++){
                    for(int k=0; k<input[i].length(); k++){
                        for(int d=0; d<input[j].length(); d++){
                              if(input[i].substring(k, k+1).equals(input[j].substring(d, d+1))){
                                      counter++;
                                } 

                        }
                             if(counter==input[i].length()&&counter==input[j].length()){
                                   if(!list.contains(input[i])){
                                       list.add(input[i]);
                                     }
                                  if(!list.contains(input[j]))
                                     list.add(input[j]);
                                        
                           }
                    }
              counter=0;
         }
}
                System.out.println(list);
}
}
package com.assignment.java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray{

     public static void main(String []args){
      List<Integer> list=new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(6);
      list.add(7);
      System.out.println("List before the shuffle is "+list);
      
      Collections.shuffle(list);
      System.out.println("List After getting Shuffle is ");
     System.out.println(list);

     }
}
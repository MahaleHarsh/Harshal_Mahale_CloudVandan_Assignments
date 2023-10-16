package com.assignment.java;

import java.util.Scanner;

public class RomanToInteger{
public int check(char r){
    if (r == 'I')   
       return 1;   
       if (r == 'V')   
       return 5;   
      if (r == 'X')   
       return 10;   
     if (r == 'L')   
       return 50;   
     if (r == 'C')   
       return 100;   
     if (r == 'D')   
      return 500;   
    if (r == 'M')   
       return 1000;   
     return -1;   

}
public int calculate(String s){
    int total=0;
    int a;
    int b;
for(int i=0;i<s.length();i++){
   a=check(s.charAt(i));
  
  if(i+1<s.length()){
       b=check(s.charAt(i+1));
  
       if(a>b){
      total+=a;
     }
    else{
      total-=a;
    }
  }
  else{
      total+=a;
  }
 }
return total;
}
public static void main(String args[]){
	Scanner scn =new Scanner(System.in);
	System.out.println("Enter the Roman Number");
	String romNum=scn.next();
	
    RomanToInteger rom=new RomanToInteger();
      System.out.println("The output when roman number "+romNum+" converted to integer is "+rom.calculate(romNum));
   
}
}

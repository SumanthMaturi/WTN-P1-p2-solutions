import java.io.*;
import java.util.Scanner;
class Factorial{  
 public static void main(String args[])
{  
  int i,f=1;  
  int number;
Scanner sc = new Scanner(System.in);
number = sc.nextInt();
  for(i=1;i<=number;i++){    
      f=f*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+f);    
 }  
}
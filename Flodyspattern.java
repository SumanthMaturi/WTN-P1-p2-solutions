import java.io.*;
import java.util.Scanner;
class Flodyspattern{ 
public static void main(String[]args)
{ 
    int n, i, j;
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Enter the number of rows of Floyd's triangle to display");
    n = sc.nextInt();
 
    System.out.println("Floyd's triangle:");
 
    for (i = 1; i <= n; i++)
    {
      for (j = 1; j <= i; j++)
      {
        System.out.println(" * ");
        
      }
 
    }
  }
}
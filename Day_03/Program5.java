package Day_03;

import java.util.Scanner;

public class Program5 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a first number:");
        int a = sc.nextInt();
        System.out.println("Enter a second number:");
        int b = sc.nextInt();
        System.out.println("Enter a third number:");
        int c = sc.nextInt();
        int large;
        if (a >= b && a>=c){
            large = a;   
        }
        else if(b >= a && b>=c){
            large = b;
        }
        else{
            large = c;
        }
        System.out.println("Largest number is:" + large);
    
     sc.close();
    } 
}

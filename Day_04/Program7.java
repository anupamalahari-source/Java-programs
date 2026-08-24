import java.util.Scanner;
public class Program7{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(num>0){
           System.out.println("Number is Postive ");
        }
        else if(num==0){
            System.out.println("Number is 0");
        }
        else if(num<0){
            System.out.println("Number is Negative  ");
        }
        sc.close();
    }
}
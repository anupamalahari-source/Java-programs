import java.util.Scanner;
public class Program8{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int orin=n;
        int rev=0;
        while(n!=0){
            int dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        System.out.println("Reverse of original number is: " +  rev);
        sc.close();
    }
}
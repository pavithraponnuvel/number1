package day.pkg13;

import java.util.Scanner;
public class norev {
    public static void main(String[] args) {
        int n,n1,rev=0;
        System.out.println("enter the no");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        n1=n;
        while(n1!=0)
            {
                
            rev = (rev*10)+(n1%10);
            n1 = n1/10;
            }     
        System.out.println(""+rev);
    }
}
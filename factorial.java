public class Factorial {
    public static void main(String[] args) {
        int fact=0,i,a;
        System.out.println("enter the no;");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            fact=fact*i;
           }
        System.out.println("the factorial"+fact);
}
}

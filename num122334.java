Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=n1;
        n3=n1;
while(n1 > 9){
    n1 = n1/10;
}
 n4=n3%10;
        n=(int)Math.pow(n4,0);
        t=t+n;
        n5=n2/10;
        while(n5!=0)
        {
            n6=n2%10;
            n7=n5%10;
            n=1;
        for(i=0;i<n6;i++)
        {
              n=n7*n; 
        }
        n5=n5/10;
        n2=n2/10;
        sum=sum+n;
        }
        tot=sum+t;
        System.out.println(""+tot);

int n,i=0,n1,n2,sum=0,n3,n4;
        int[] a=new int[100];
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n3=n1;
        while(n1!=0)
        {
        n2=n1%10;
        sum=sum+n2;
        n1=n1/10;}
        while(n3!=0)
        {
            n2=n3/10;
            n3=n2;
        
        while(n2!=0)
        {
            n4=n2%10;
            sum=sum+n4;
            n2=n2/10;
        }
        } 
    System.out.println(sum);   

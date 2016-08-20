Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n3=n1;
        while(n1!=0){
            n1=n1/10;
        count++;
        }
        while(n3!=0)
        {
        n4=n3%10;
        n=1;
        for(i=0;i<count;i++)
        {
              n=n4*n; 
        }
        n3=n3/10;
        sum=sum+n;
        }
        System.out.println(""+sum);
        
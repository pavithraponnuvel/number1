 while(m!=0)
        {
            n1=m%10;
            n3=n1*n1*n1;
            sum+=n3;
            m=m/10;
            
        }
        if(sum==a)
            System.out.println("armstrong");
        else
            System.out.println("not armstromg");
       
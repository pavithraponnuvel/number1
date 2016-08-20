 Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
     
                for(i=10;i<99;i++)
          {             
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                  break;
                }   
            }
            if(i==j)
            {
                a[c]=i;
                c++;
            }
          } for(i=0;i<a.length;i++)
          {             
            for(j=i+1;j<a.length;j++)
            {n1=a[i]+a[j];
                if(n==n1){
                    System.out.println(""+a[i]+" "+a[j]);
                }
            }}}
            
       
    }
    


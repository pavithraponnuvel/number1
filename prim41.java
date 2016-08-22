 int n,i,j,c=0,sum=0;
        int[] a=new int[100];
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
          }
            for(i=0;i<a.length;i++){
                int c1=0;
                for(j=i;j<a.length;j++){
                    c1++;
                    sum=sum+a[j];
                    if(sum==n){
                        System.out.println(""+c1);
                        break;
                    }
                }
            }    
    }
    
}

int n,i,L1,L2;
        int[] a=new int[1000];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        L1=n/2;
        L2=n-L1;
        if(L1==L2)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
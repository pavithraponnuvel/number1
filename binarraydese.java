public static void main(String[] args) {
        int n,i,n1,j,n2,n3;
        int m1 = 0,m2 = 0,t;
        int[] a1=new int[10];
        int[] b1=new int[10];
        int[] a=new int[10];
         int[] a2=new int[10];
        String[] b=new String[1000];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++){
        a[i] =sc.nextInt();
        }
      for ( i = 0; i <n; i++) {
        for ( j = i + 1; j <n; j++) {
            int tmp = 0;
            if (a[i] > a[j]) {
                tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }}}
        for(i=0;i<n;i++)
                {
            a2[i]=a[i]; }
        for(i=0;i<n;i++)
        {
            b[i]=Integer.toBinaryString(a[i]); 
             a1[i]=Integer.parseInt(b[i]);
        }  
        for(i=0;i<n;i++){
            int index=0;
           n1=a1[i];
             while(n1!=0){
           n2=n1%10;
           if(n2==1){
               index++;
           }
            n1=n1/10;}
          b1[i]=index;
           System.out.println(""+b1[i]);
        }
        for(i=0;i<b1.length;i++)
        {
            for(j=i+1;j<b1.length-1;j++){
           if(b1[i]==b1[j]){
               a[i]=Math.max(a2[i], a2[j]);
               a[j]=Math.min(a2[i], a2[j]);
              t=a[j];
              a[j]=a[i];
              a[i]=t;}      
        }
    }   for(i=n-1;i>=0;i--){
        System.out.println(""+a[i]);
    }
    }
}
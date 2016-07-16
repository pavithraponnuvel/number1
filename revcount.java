public static void main(String[] args) {
        String s1,s2;
        int r1,r2,i,j,flag=0;
        System.out.println("enter the strings");
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
         s2=sc.nextLine();
         char[] a=s1.toCharArray();
         char[] b=s2.toCharArray();
         int l=s1.length();
         int m=s2.length();
         for(i=0;i<l-1;i++)
         {
             for(j=i+1;j<l;j++)
             {
                 if(a[i]==a[j])
                 {
                     r1=i;
                     r2=j;
                  for(i=0;i<m-1;i++)
                  {
         
             for(j=i+1;j<m;j++)
             {
                 if(b[i]==b[j]&&i==r1&&j==r2)
                 {
                     System.out.println("true");
                     flag=1;
                 }
             }
                 }
             }
         }
    }
    if(flag==0)
            System.out.println("false");
}
}
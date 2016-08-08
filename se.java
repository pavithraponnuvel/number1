public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n1=sc.nextInt();
        
while(n1!=0)
        {
            a[i]=n1%10;
            count++;
            i++;
        n1=n1/10;
        
}
      for(i=0;i<count;i++)
        {
            n2=n2*a[i];
          
        }
        System.out.println(""+n2);
 
    }
    
}
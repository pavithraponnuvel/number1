public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        
while(n!=0)
        {
            a[i]=n%10;
            count++;
            i++;
        n=n/10;
        
}
      for(i=0;i<count;i++)
        {
            n1=n1*a[i];
          
        }
        System.out.println(""+n1);
 
    }
    
}
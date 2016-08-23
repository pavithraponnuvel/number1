public class num2sss {
    public static void main(String[] args) {
        int n,i,n1,c=0,n2,n3;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=10;i<=n;i++){

            n3=i;
            while(n3!=0){
                n1=n3%10;
                if(n1==2){
                    c++; }
                n3=n3/10;
            }}
        n2=c+1;
        System.out.println(""+n2);
    }
    
}

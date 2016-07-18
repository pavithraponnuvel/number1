public class aa {
    public static void main(String[] args) {
        arr b2=new arr();
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        n=sc.nextInt();
        int[] b=new int[n];
        System.out.println("enter the first element of an array");
        b[0]=sc.nextInt();
        System.out.println("enter the diff between the element");
        j=sc.nextInt();
        for(i=1;i<n;i++)
        {
         b[i]=b[i-1]+j;
            System.out.println(""+b[i]);
        }
        for(i=0;i<n;i++)
        {
          b2.b1(b[i], i);
        }
    }
    
}
class arr
{
    void b1(int b,int i)
    {
        if(b==i){
            System.out.println("the element"+a+"is in the position"+i);
        }
    }
}
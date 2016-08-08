/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guvi;

/**
 *
 * @author raju
 */
public class primefor100 {
    public static void main(String[] args) {
        int i,j,count=0;
        int c=0;
        int[] a=new int[100];
        int[] b=new int[100];
        for(i=2;i<100;i++)
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
                //System.out.println(a[c]);==========>stores in array
                c++;
              // System.out.println(i);
            }
          }
        int m,n = 0,c1=0,n1;
        for(i=0;i<c-1;i++)
                {int sum=0;
                    n1=a[i];
                    if(n1>9){
                           // System.out.println(""+a[i]);
                       n=n1;}
                     while(n!=0){
                       m=n%10;
                       sum=sum+m;
                         //System.out.println(""+sum);
                       n=n/10;}
        for(j=2;j<sum;j++)
            {
                if(sum%j==0)
                {
                  break;
                }   
            }
            if(sum==j){
                   System.out.println(""+sum);
            }
                      
    }}}
    


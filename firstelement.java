 public static void main(String[] args) {
        int[] a={1,2,3,10,9,4,5,7,7,7,7,8};
        int i,flag = 0,j;
        for(i=0;i<=11;i++)
        {
            for(j=i+1;j<11;j++)
            {
                if(flag==1)
                    continue;
                if(a[i]==a[j]){
                flag=1;
                System.out.println("the first element which is repeated is"+a[i]);
                break;
         }}
               
                    
            
        }
   
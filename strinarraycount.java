 String s2;
        int i,j,k,c1,max=0,n1=0;
        String s1,s;
        String[] str=new String[10];
        Scanner sc=new Scanner(System.in);
        char[] c=new char[100];
        int[] n=new int[100];
        s1=sc.nextLine();
        str=s1.split("\\s");
      for(i=0;i<str.length;i++){
           c1=0;
               s2=str[i];
               c=s2.toCharArray();
               for(j=0;j<s2.length();j++){
                   for(k=j+1;k<s2.length();k++){
                       if(c[j]==c[k]){
                           c1++;
                       }else{
                           continue;}}}
               n[i]=c1;
       }
      for(i=0;i<n.length;i++){
          if(max<n[i]){
              max=n[i];
          }}
      for(i=0;i<n.length;i++){
          if(max==n[i]){
              n1=i;
          }}
          for(i=0;i<str.length;i++){
              if(n1==i){
                  System.out.println(""+str[i]);
              }
          }
 String s,s3="";
        int i,j=0,k=0;
        String[] s2=new String[100];
        char[] c1=new char[100];
        char[] c2=new char[100];
        char[] c3=new char[100];
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
       String[]   s1=s.split("\\s");
          for(i=0;i<s1.length;i++){
           s2[i]=new StringBuffer(s1[i]).reverse().toString(); 
    }   for(i=0;i<s1.length;i++){
        s3="";
       c1=s1[i].toCharArray();
       c2=s2[i].toCharArray();
      for(j=0;j<c1.length;j++){
      if(c1[j]>=64&&c1[j]<=94){
          if(c2[j]>=64&&c2[j]<=94)
           s3=s3+c2[j];
      else{
          c3[j]=Character.toUpperCase(c2[j]);
          s3=s3+c3[j];}}
       if(c1[j]>=97&&c1[j]<=123){
           if(c2[j]>=97&&c2[j]<=123)
               s3=s3+c2[j];
       else{
             c3[j]=Character.toLowerCase(c2[j]); 
             s3=s3+c3[j];
        }}}
    
        System.out.print(""+s3);
        System.out.print(" ");
    }}}


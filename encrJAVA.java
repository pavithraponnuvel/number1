 String s,s1="";int i,l;char c,c1,c2 = 0;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        l=s.length();
         c2=s.charAt(l-1);
        for(i=0;i<l-1;i++){
            c=s.charAt(i);
               if(c=='a'){
                c1='z';
                s1=s1+c1;
            }else{
             c1=(char) (c-1);
            s1=s1+c1;

             }
            
        }
        s1=s1+c2;
        System.out.println(""+s1);
    
}}
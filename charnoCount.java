 char[] c=new char[100];
        int n = 0,l,i;
        char x = 0;
        String m = "";
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        c=s.toCharArray();
        l=s.length();
          for(i=0;i<l;i++){
           
            if((c[i]>=97&&c[i]<=123)||(c[i]>=65&&c[i]<=91)){
                x=c[i];
            }
            while(Character.isDigit(c[i+1])){
            i=i+1;
               n=(n*10)+Integer.parseInt(String.valueOf(s.charAt(i)));
               if(i==l-1)
                   break;}
            if(n>=1&&n<99){
           while(n>=1){
               m=m+x;
               n--;}}}
               System.out.println(""+m);
        
            }
            
        }
    
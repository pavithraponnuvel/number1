while(b!=0)
        {
            a1=b%10;
            rev=rev*10+a1;
            b=b/10;
        }
        if(a2==rev)
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
        
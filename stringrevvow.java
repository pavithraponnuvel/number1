public class stringrevvow {
     public static void main(String[] args) {
    String str="pavithra";
    String s2;
    s2=new StringBuffer(str).reverse().toString();
    s2=s2.replaceAll("[aeiou]","");
    System.out.println(""+s2);
     }
    
}
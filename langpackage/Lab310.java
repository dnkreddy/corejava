import java.math.*;
//Demo on Math class
class Lab310{
public static void main(String args[])throws Exception{
   System.out.println(Double.MAX_VALUE); 
   Double d1 = Double.MAX_VALUE;
   double d2 = d1+100;
   System.out.println(d2);   
   BigDecimal bi1 = new BigDecimal(Double.MAX_VALUE);
   BigDecimal bi2 = new BigDecimal("100");
   System.out.println(bi1.add(bi2));
}
}


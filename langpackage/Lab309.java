import java.math.*;
//Demo on Math class
class Lab309{
public static void main(String args[])throws Exception{
   System.out.println(Long.MAX_VALUE); 
   
   long l1 = 9223372036854775807l;
   System.out.println(l1);
   //long l2 = 9223372036854775809l;
   System.out.println(l1);
   BigInteger bi1 = new BigInteger("9223372036854775807");
    BigInteger bi2 = new BigInteger("100");
	System.out.println(bi1.add(bi2));
}
}


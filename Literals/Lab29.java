//Integer literals
class Lab29{
	static int i;
	static byte b;
	static short s;
	static long l;
public static void main(String args[]){
	 System.out.println(i+"::"+b+"::"+s+"::"+l);
      i = 101;//Decimal represenation(base - 10 ,0-9)
      b = 0101;//Octal representation(base - 8,0-7)
	  //hexadecimal represenation(base- 16,0-9,A,B,C,D,E,F)
      s = 0x0041;
      l = 0b101;//Binary representation(base-2,0-1)
     System.out.println("int::"+i);
     System.out.println("byte::"+b);
	 System.out.println("short::"+s);
	 System.out.println("long::"+l);	 
}
}

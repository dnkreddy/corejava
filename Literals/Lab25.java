//Demo of Character Literal
class Lab25{
	static char ch;
public static void main(String args[]){
		ch = 65; //ASCII value (0-255)
		System.out.println(ch);
		ch = '\101'; // Octal character (0-377)
		System.out.println(ch);
		ch = '\u0041';//unicode character
		System.out.println(ch);
}
}
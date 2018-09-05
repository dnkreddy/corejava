//Demo of Character Literal
class Lab27{

public static void main(String args[]){
		//escape characters
		//(\n,\t,\r,\b,\f,\',\",\\)
		char ch = '\n';
		System.out.println(ch);
		String s = "This is Lavi \nTechnologies Bangalore";
		System.out.println(s);
		String s1 = "This is Lavi\tTechnologies Bangalore";
		System.out.println(s1);
		String s2 = "This is Lavi\bTechnologies Bangalore";
		System.out.println(s2);
		String s3 = "This is Lavi\rTech";
		System.out.println(s3);
		String s4 = "This is Lavi\fTech";
		System.out.println(s4);
		String s5 = "This is \'Lavi\' Technolgie\'s";
		System.out.println(s5);
		String s6 = "This is \"Lavi\" Technolgies";
		System.out.println(s6);
		String path = "E:\\lavi";
		System.out.println(path);
}
}
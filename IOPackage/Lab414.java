//Demo on user defined Annotations
import java.lang.annotation.*;
class Lab414{
public static void main(String args[]){
	
   Book b = new Book();
   Class c = b.getClass();
   boolean present = c.isAnnotationPresent(Author.class);	
   Annotation c1 = c.getAnnotation(Author.class);    
   System.out.println("present::"+present+"::"+c1);	
   
}
}

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.TYPE) 
@interface Author{
	String name();
	int age() default 100;
}

@Author(name="LAVI")
class Book{
		
	
}
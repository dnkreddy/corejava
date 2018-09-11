//Demo on StringBuffer class
class Lab303{
public static void main(String args[]){
  StringBuffer sb = new StringBuffer();
  System.out.println(sb.capacity());
  System.out.println(sb.length());
  sb.append("This");
  sb.append(" is");
  sb.append(" Lavi");
  sb.append(" Tec");
  System.out.println(sb.capacity());
  System.out.println(sb.length());
  sb.append("hnologies");
  
   System.out.println(sb.capacity());
  System.out.println(sb.length());
  System.out.println("====ensureCapacity====");
  sb.ensureCapacity(100);
  System.out.println(sb.capacity());
  System.out.println(sb.length());
  System.out.println("====trimToSize====");
  sb.trimToSize();
  System.out.println(sb.capacity());
  System.out.println(sb.length());
  System.out.println(sb);
  String title = sb.toString();
  System.out.println(title);
  System.out.println(sb.reverse());
}
}
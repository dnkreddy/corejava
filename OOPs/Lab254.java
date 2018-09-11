//Demo on Access Specifiers
package com.lavi.p1;
public class Lab254{
  private int a = 10;
          int b = 20;
  protected int c = 30;
  public int d = 40;
  
  /*private Lab254(){
	  
  }*/
  Lab254(){
	  
  }
  private void priShow(){
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	  System.out.println(d);  
  
  }
   void defShow(){
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	  System.out.println(d);  
  }
   protected void proshow(){
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	  System.out.println(d);  
  }
  public void pubShow(){
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	  System.out.println(d);  
  }
  
  
  
  
  
}
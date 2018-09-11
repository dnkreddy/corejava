//Demo on package
package com.lavi.p2;
import com.lavi.p1.Lab249;
import static com.lavi.p1.Lab249.A;
import static java.lang.Math.*;
class Lab252{
public static void main(String args[]){
	System.out.println("Lab252 in Package1");
	Lab249 l = new Lab249();
	System.out.println(A);
	System.out.println(sqrt(16));
}
}
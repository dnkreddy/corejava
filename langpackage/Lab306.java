//Demo on Runtime class
class Lab306{
public static void main(String args[])throws Exception{
	Runtime rt = Runtime.getRuntime();
	rt.gc();
	rt.runFinalization();
	System.out.println("freeMemory::"+rt.freeMemory());
	System.out.println("maxMemory::"+rt.maxMemory());
	System.out.println("totalMemory::"+rt.totalMemory());
	rt.exec("mspaint");
	rt.exec("notepad");
}
}


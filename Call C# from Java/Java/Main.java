import com.sun.jna.Native;

public class Main{
	public static void main(String... args){
		ICSharp csharp = (ICSharp)Native.loadLibrary("ComApplication", ICSharp.class);
		System.out.println("Returned: " + csharp.Test("Hello"));
	}
}
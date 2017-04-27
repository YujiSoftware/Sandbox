import java.io.RandomAccessFile;

public class Main {
	public static void main(String[] args) throws Exception {
		try (RandomAccessFile pipe = new RandomAccessFile("\\\\.\\pipe\\testpipe", "rw")) {
			// write to pipe
			String echoText = "Hello word\n";
			pipe.write(echoText.getBytes());

			// read response
			String echoResponse = pipe.readLine();
			System.out.println("Response: " + echoResponse);
		}
	}
}

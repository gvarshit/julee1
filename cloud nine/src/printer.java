import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class printer {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Desktop");
		PrintWriter printwriter = new PrintWriter(file);
		printwriter.print("hello! it is tuesday");
		printwriter.close();

	}

}

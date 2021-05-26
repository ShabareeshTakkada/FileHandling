import java.io.File;
import java.util.Scanner;

public class ReadFileUsingScanner {

	public static void main(String[] args) {
		String path = "C:\\Users\\LENOVO\\Desktop\\Selenium with java\\FileHandling.txt";
		Scanner fileInputStream = null;
		try
		{
			File file = new File(path);
			fileInputStream = new Scanner(file);
			while (fileInputStream.hasNextLine())
			{
				System.out.print(fileInputStream.nextLine());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
				fileInputStream.close();
		}

	}

}

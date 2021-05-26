import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingInputStream {

	public static void main(String[] args) {
		String path = "C:\\Users\\LENOVO\\Desktop\\Selenium with java\\FileHandling.txt";
		FileInputStream fileInputStream = null;
		try
		{
			File file = new File(path);
			fileInputStream = new FileInputStream(file);
			int c = 0;
			while ((c = fileInputStream.read())!=-1)
			{
				System.out.print((char) c);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

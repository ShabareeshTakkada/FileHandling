import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {
	public static void main(String[] args) {
		String path = "C:\\Users\\LENOVO\\Desktop\\Selenium with java\\FileHandling.txt";
		FileReader fileInputStream = null;
		try
		{
			File file = new File(path);
			fileInputStream = new FileReader(file);
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

import java.awt.Desktop;
import java.io.File;

public class OpenFileUsingDesktop {

	public static void main(String[] args) {
		String path = "C:\\Users\\LENOVO\\Desktop\\Selenium with java\\FileHandling.txt";
		
		try
		{
			File file = new File(path);
			
			if (!Desktop.isDesktopSupported())
			{
				System.out.println("Desktop is not supported");
				return;
			}
			
			Desktop d = Desktop.getDesktop();
			
			if(file.exists())
			{
				d.open(file);
			}	
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}	

	}

}

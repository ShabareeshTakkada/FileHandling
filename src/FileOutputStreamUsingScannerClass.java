import java.io.FileOutputStream;
import java.util.Scanner;

public class FileOutputStreamUsingScannerClass {
	
	public static void main(String[] args)
	{
		try
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Path where you want to create...");
			String filePath = sc.nextLine();
			
			FileOutputStream fos = new FileOutputStream(filePath, true);
		
			System.out.println("Enter the content Type...");
			
<<<<<<< HEAD
=======
			System.out.println("Enter the message...");
>>>>>>> refs/heads/Feature
			String content = sc.nextLine();
			
			byte[] b = content.getBytes();
			
			fos.write(b);
			fos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally Block");
		}
	}
	
	

}

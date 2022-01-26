package Service;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;

public class Service
{

	@SuppressWarnings("resource")
	public void CopyData()
	{
		
		try {
			URL url=new URL("http://www.texla.net");    
			URLConnection urlcon=url.openConnection();    
			InputStream stream=urlcon.getInputStream(); 
            FileOutputStream fos = new FileOutputStream("C:\\Users\\REVAN\\OneDrive\\Desktop\\web-content2.txt");
            while (true) {
                int i = stream.read();
                if (i == -1)
                    break;
                System.out.print((char) i);//display on cmd
                fos.write(i);// write the source in b.txt

            }
        } catch (IOException e)
		{
        	System.out.println(e);
        }
		
	}

}

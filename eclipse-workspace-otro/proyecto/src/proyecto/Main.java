package proyecto;
import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Abriendo sus paginas web...");
		try {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=aEtwA-iwoCQ"));
            Desktop.getDesktop().browse(new URI("https://campus.argentinaprograma.utn.edu.ar/course/view.php?id=102"));
            System.in.read();
            
		} catch (Exception e) {
            e.printStackTrace();
        }
		System.out.println("realizado");

		
	}

}

package paes.javaSocket;

import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //prepare the http message - header
        String http = "GET / HTTP/1.1\n" +
                "Host: www.teste.com\n\n";

        try {
            Socket s = new Socket("www.megapizzafoz.com.br", 80);

            //send the http message to the server
            s.getOutputStream().write(http.getBytes());

            //get the http message from server
            Scanner sc = new Scanner(s.getInputStream());
            System.out.println(sc.nextLine());

            s.close();
        }
        catch (Exception e) { e.printStackTrace(); }
    }
}

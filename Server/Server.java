package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(808);
            for (;;) {
                Socket socket = ServerSocket.accept();
                Path pth = 'D:\JAVAHomeworks\OOPHomework005\Server\server.txt';
                System.out.println("Client connected");
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));

                PrintWriter writer = new PrintWriter(socket.getOutputStream());

                while (!reader.ready())
                    ;
                while (reader.ready()) {
                    String content = FileUtils.readFileToString(new File(path));
                    while ((content = in.readLine()) != null) {
                        System.out.println(content);
                    }
                }

                writer.println("HTML/1.1 200 OK");
                writer.println("Content-Type: text/html; charset = utf-8");
                writer.println();
                writer.println("<h1> Hello world! </h1>");
                writer.flush();

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args){
        int port=1500;
        try{
            ServerSocket serverSocket=new ServerSocket(port);
            Socket socket=serverSocket.accept();
            System.out.println("Connection success");
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while(true){
                String str=bufferedReader.readLine();
                if(str==null) continue;
                if("END".equals(str)) break;
                System.out.println(str);
            }

            bufferedReader.close();
            socket.close();
            serverSocket.close();
        }catch (Exception e){
            System.out.println("Connection Reset");
        }


    }
}
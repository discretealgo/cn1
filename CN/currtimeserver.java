import java.io.*;
import java.net.*;
import java.util.*;


public class currtimeserver {
    public static void main(String[] args) {
        final int PORT = 12345;
        try(ServerSocket ss = new ServerSocket()){
            System.out.println("Server is running and listening on port"+PORT);
            while(true){
                Socket s = ss.accept();
                new Thread(()->{
                    try{
                        OutputStream os= s.getOutputStream();
                        PrintWriter pw = new PrintWriter(os);
                    }

                }
        }
    }
}

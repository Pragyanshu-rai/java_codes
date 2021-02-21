import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.net.ServerSocket;
import java.net.Socket;
public class FCP
{
    public static Socket sender_socket, sender;
    public static ServerSocket receiver;
    public static BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
    public static DataOutputStream fileIn, send;
    public static DataInputStream fileOut, receive;
    public static File file;
    public static void checkFile(String fileName) throws Exception
    {
        if(fileName.length() == 0)
            fileName = "testing.txt";
        file= new File(fileName);
        if(file.exists() == false)
            file.createNewFile();
    }
    public static void sendFile(String ip, int port, String fileName) throws Exception
    {
        try
        {
            sender = new Socket(ip, port);
            send = new DataOutputStream(sender.getOutputStream());
        }
        catch(Exception e)
        {
            System.out.println("ERROR!!! while sending "+e.getMessage());
            send.close();
        }
        checkFile(fileName);
        fileOut = new DataInputStream(new FileInputStream(fileName));
        String line =  String.valueOf((String.valueOf(file.length())).length()) + String.valueOf(file.length());
        System.out.println(String.valueOf((String.valueOf(file.length())).length()) + " " + String.valueOf(file.length()));
        byte[] buffer;
        buffer = line.getBytes();//converst string to byte stream
        send.write(buffer, 0, buffer.length);
        send.flush();
        buffer = new byte[(int)file.length()];
        System.out.println("sending ok..");
        while(fileOut.read(buffer, 0, (int)file.length())!=-1)
        {
            send.write(buffer, 0, (int)file.length());
            send.flush();
            String st = new String(buffer);
            System.out.println("1- "+st);
        }
        send.close();
        fileOut.close();
    }
    public static void receiveFile(int port, String fileName) throws Exception
    {
        try
        {
            receiver = new ServerSocket(port);
            System.out.print("Waiting For Connection...");
            sender_socket = receiver.accept();
            receive = new DataInputStream(sender_socket.getInputStream());
            System.out.print("...found\n");
        }
        catch(Exception e)
        {
            System.out.println("ERROR!!! while receiving "+e.getMessage());
            receiver.close();
            sender_socket.close();
            receive.close();
        }
        byte[] buffer = new byte[1024];
        int strlen, size=0;
        receive.read(buffer, 0, buffer.length);
        String line = new String(buffer);
        strlen = line.charAt(0) - '0';
        for(int index=1; index<=strlen; index++)
        {
            size=(size*10)+(int)(line.charAt(index)-'0');
        }
        System.out.println("Received "+line.length());
        System.out.println("Received "+size);
        checkFile(fileName);
        fileIn = new DataOutputStream(new FileOutputStream(fileName, true));
        buffer = new byte[size];
        while(receive.read(buffer, 0, size)!=-1)
        {
            fileIn.write(buffer, 0, size);
            fileIn.flush();
        }
        fileIn.close();
        receiver.close();
        sender_socket.close();
        receive.close();
    }
    public static void help()
    {
        System.out.println("pending.....");
        System.exit(0);    
    }
    public static void main(String []args) throws Exception
    {
        if(args.length<1)
            help();
        if((args[0].equals("-r"))||(args[0].equals("-s")))
        {
        
        }
        else
            help();
        int port = Integer.parseInt(args[1]);
        String  ip = args[3], question = args[0], fileName = args[2];
				if(question.equalsIgnoreCase("-s"))
                {
					sendFile(ip, port, fileName);
                }				
                else if(question.equalsIgnoreCase("-r"))
                {
					receiveFile(port, fileName);
                }				
                else
					System.out.println("Please Enter A Valid Choice\n:>");
    }
}

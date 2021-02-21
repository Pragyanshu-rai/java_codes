import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class CaesarCipher
{
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static String decrypt(String message, int key)
    {
        StringBuilder newMessage = new StringBuilder("");
        String original="ABCDEFGHIJKLMNOPQRSTUVWXYZ", encrypted;
        encrypted = original.substring(key);
        encrypted = encrypted + original.substring(0, key);
        for(int index=0; index<message.length(); index++)
        {
            if(encrypted.indexOf(message.charAt(index)) == -1)
                newMessage.append(message.charAt(index));
            else
                newMessage.append(original.charAt(encrypted.indexOf(message.charAt(index))));
        }
        return newMessage.toString(); 
    }
    public static String encrypt(String message, int key)
    {
        StringBuilder newMessage = new StringBuilder("");
        String original="ABCDEFGHIJKLMNOPQRSTUVWXYZ", encrypted;
        encrypted = original.substring(key);
        encrypted = encrypted + original.substring(0, key);
        for(int index=0; index<message.length(); index++)
        {
            if(encrypted.indexOf(message.charAt(index)) == -1)
                newMessage.append(message.charAt(index));
            else
                newMessage.append(encrypted.charAt(original.indexOf(message.charAt(index))));
        }
        return newMessage.toString();    
    }
    public static String encryptTwo(String message, int key_1, int key_2)
    {
        StringBuilder newMessage = new StringBuilder("");
        String original="ABCDEFGHIJKLMNOPQRSTUVWXYZ", encrypted_1, encrypted_2;
        encrypted_1 = original.substring(key_1);
        encrypted_1 = encrypted_1 + original.substring(0, key_1);
        encrypted_2 = original.substring(key_2);
        encrypted_2 = encrypted_2 + original.substring(0, key_2);
        for(int index=0; index<message.length(); index++)
        {
            if(index%2==0)
            {
                if(encrypted_1.indexOf(message.charAt(index)) == -1)
                    newMessage.append(message.charAt(index));
                else
                    newMessage.append(encrypted_1.charAt(original.indexOf(message.charAt(index))));
            }
            else
            {
                if(encrypted_2.indexOf(message.charAt(index)) == -1)
                    newMessage.append(message.charAt(index));
                else
                    newMessage.append(encrypted_2.charAt(original.indexOf(message.charAt(index))));
            }
        }
        return newMessage.toString();
    }
    public static String decryptTwo(String message, int key_1, int key_2)
    {
        StringBuilder newMessage = new StringBuilder("");
        String original="ABCDEFGHIJKLMNOPQRSTUVWXYZ", encrypted_1, encrypted_2;
        encrypted_1 = original.substring(key_1);
        encrypted_1 = encrypted_1 + original.substring(0, key_1);
        encrypted_2 = original.substring(key_2);
        encrypted_2 = encrypted_2 + original.substring(0, key_2);
        for(int index=0; index<message.length(); index++)
        {
            if(index%2==0)
            {
                if(encrypted_1.indexOf(message.charAt(index)) == -1)
                    newMessage.append(message.charAt(index));
                else
                    newMessage.append(original.charAt(encrypted_1.indexOf(message.charAt(index))));
            }
            else
            {
                if(encrypted_2.indexOf(message.charAt(index)) == -1)
                    newMessage.append(message.charAt(index));
                else
                    newMessage.append(original.charAt(encrypted_2.indexOf(message.charAt(index))));
            }
        }
        return newMessage.toString();
    }
    public static void main(String args[]) throws IOException
    {
        int key;
        String message;
        System.out.println("Enter the key ( 0 < key < 26)");
        key = Integer.parseInt(in.readLine());
        //key = 26 - key;
        System.out.print("Enter The Message To Encrypt :- ");
        message = in.readLine();
        message = message.toUpperCase();
        System.out.println("The New Message is :- "+encrypt(message, key));
        System.out.println("The New Message is :- "+decrypt(encrypt(message, key), key));        
        System.out.println("The New Message is :- "+encryptTwo(message, 8, 21));        
        System.out.println("The New Message is :- "+decryptTwo(encryptTwo(message, 8, 21), 8, 21));
    }
}

// import all the classes in io package
import java.io.*;

// class that contains the validator method
class PassVal{
    // create a buffered class object by passing an inputstreamreader object created by passing System.in keyboard input stream
    public BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
    
    // string variable to store the Password, letter in alphabet, prompt string and the special characters
    public String password, letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", prompt = "Enter The Password", special = ":?!-", digits = "0123456789";
    
    // flag variable to tell whether the password if validated or not yet
    public boolean passFound = false;
    
    // digit will be true if password contains a digit and letter will be true if both
    public boolean digit = false, letter = false, specials = false;
    
    
    // method that tells whether the string contains atleast one digit
    public boolean digitAndLetter(String password)
    {
        
        // the loop runs and the password.charAt(index)goes through eapassword.charAt(index)character in the password string
        for(int index=0; index < password.length(); index++)
        {
            // if the password string contains a digit
            if(digits.indexOf(password.charAt(index)) != -1)
            {
                //change the digit flag to true
                digit = true;
            } 
            
            // checks if the password contains a letter
            else if(letters.indexOf(password.charAt(index)) != -1)
            {
                letter = true;            
            }
            
            // checks if the password contains a special char
            else if(special.indexOf(password.charAt(index)) != -1)
            {
                specials = true;            
            }
        }    

        return ((digit&letter)&specials);
    }    
    
    // creating the validation method
    public void Validation() throws IOException
    {
        // loop runs until a password meeting all the criteria is found
        while(passFound == false)
        {
            // prompt user fot the password
            System.out.println(prompt+": ");
            
            // read the password and store it in the password string
            password = in.readLine();
            
            if(password.length() < 7)
            {
                System.out.println("Password Too Small!!!!"+password.indexOf('A'));
                continue;            
            }            
            
            else if(digitAndLetter(password) == false)
            {
                if(digit == false)
                {
                    System.out.println("No Digit !!!!!");
                    continue;
                }
                
                else if(letter == false)
                {
                    System.out.println("No letter !!!!!");
                    continue;
                }
            
                System.out.println("No special char (:?!-) !!!!!");
                                
            }
            
            else
                passFound = true;
            
        }
        
        System.out.println("Password is validated");
    }
}

//main driver class that contains the main method and creates the PassVal object and calls the validator method to validate the password
class PassValDriver{
    public static void main(String []args) throws IOException
    {
        PassVal val = new PassVal();
        val.Validation();    
    }
}

import java.io.*;

class TestClass {
    public static int getFrequency(String target, String line){
        int count=0, index=0;

        while(true){

            index = line.indexOf(target, index);
            
            if(index != -1){
                count++;
                index++;
            }
            else{
                break;
            }
        }

        return count;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String[] targets;
        int size;

        targets = sin.readLine().split(",");
        line =  sin.readLine();
        size = targets.length;
        
        for(int index=0; index<size; index++){

            if(targets[index].charAt(0) == ' ' && targets[index].charAt(targets[index].length()-1) == ' '){
                targets[index] = targets[index].strip();
            }

            System.out.print(getFrequency(targets[index], " "+line)+" ");
        }

        System.out.println();
    }
}
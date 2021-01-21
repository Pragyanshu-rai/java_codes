import java.io.*;

import java.util.Scanner;

class Main{

    static void output_arr(int[][] arr){

        for(int i=0;i<arr.length;i++)

        {for(int j=0;j<arr[0].length;j++){

            System.out.print(arr[i][j]+"\t");

        }

            System.out.println();

        } 

    }

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        

        int N =scan.nextInt();

        int [][]chakra= new int[N][N];

        int powerpoints =1+(N*N)/11;

        

        int [] pp_list= new int[2*powerpoints];

        pp_list[0]=pp_list[1]=0;

        int pp_counter=2;

        int counter =1;

        int row=0;int col=0;

        int end_row=0;int end_col=0;

        for(int i=0;i<N/2;i++){

            row=col=i;

            end_col= N-i-1;

            while(col<end_col){

                chakra[row][col]=counter;

                if(counter%11==0){ pp_list[pp_counter]=row;

                                  pp_list[pp_counter+1]=col;

                                 pp_counter=pp_counter+2;}

                counter++;

                col++;

               

            }

            end_row=N-i-1;

            while(row<end_row){

                chakra[row][col]=counter;

                 if(counter%11==0){ pp_list[pp_counter]=row;

                                  pp_list[pp_counter+1]=col;

                                 pp_counter=pp_counter+2;}

                counter++;

                row++;

            }

            

            end_col=i;

            while(col>end_col){

                chakra[row][col]=counter;

                 if(counter%11==0){ pp_list[pp_counter]=row;

                                  pp_list[pp_counter+1]=col;

                                 pp_counter=pp_counter+2;}

                counter++;

                col--;

            }

            end_row=i;

            while(row>end_row){

                chakra[row][col]=counter;

                 if(counter%11==0){ pp_list[pp_counter]=row;

                                  pp_list[pp_counter+1]=col;

                                 pp_counter=pp_counter+2;}

                counter++;

                row--;

            }

        }

        

            if(N%2==1)

        {

            chakra[N/2][N/2]=N*N;

               

        }

        

       

       output_arr(chakra);

         System.out.println("Total Power points : "+powerpoints);

    for(int i=0;i<pp_list.length;i+=2){

        System.out.println("("+pp_list[i]+","+pp_list[i+1]+")");

    }

                

    }

}

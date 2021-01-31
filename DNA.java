import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
public class DNA
{
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedReader file_in;
    public static String Original_dna="",line;
    public static ArrayList AllGenes = new ArrayList();
    public static int abs(int first,int second)
    {
        if(first > second)
            return first-second;
        return second-first;    
    }
    public static int min(int first, int second)
    {
        if(first > second)
            return second;
        return first;        
    }
    public static int findGeneIndex(String DNA, int start, String codon)
    {
        int end=start,offset=start;
        while(end != -1)
        {
                //start = DNA.indexOf(codon);
                end = DNA.indexOf(codon,offset+3);
                if((abs(start,end))%3==0 && (end != -1) && (start<=end) && (end<DNA.length()))
                {
                    //System.out.println(" "+start+" "+end+" "+codon);   
                    return end;
                }
                offset=end;
        }
        return DNA.length();
    }
    public static String findGene(String DNA)
    {
        int start=0,end=3,next=0;
        String Genes="";
        System.out.println("DNA - "+DNA);
        while(start != -1)
        {
            start = DNA.indexOf("atg",next);
            end = min(findGeneIndex(DNA, start, "taa"),min(findGeneIndex(DNA, start, "tga"),findGeneIndex(DNA, start, "tag")));
            //System.out.println(findGeneIndex(DNA, start, "taa")+" "+findGeneIndex(DNA, start, "tga")+" "+findGeneIndex(DNA, start, "tag")+" "+start+" "+next+" "+end);
            if((abs(start,end))%3==0 && (start != -1 && end != -1)&&(start<=end)&&(end<DNA.length()))
            {
                next=end;
                Genes=Genes+DNA.substring(start,end+3)+"\n";
                AllGenes.add(DNA.substring(start,end+3).length());
                //System.out.println(DNA.substring(start,end+3)+" "+start+" "+end+" "+next);
            }
            next=end+3;
            //System.out.println(start+" "+end);
        }
        if(Genes.length()==0)
            return "ERROR!!!! - No Gene Found";
        return "\n*************************************\n\nGenes - \n"+ Genes ;
    }
    public static void main(String argd[]) throws IOException
    {
        System.out.println("Enter the DNA string file name");
        String fileName = in.readLine();
        if(fileName.length() < 1)
            fileName = "indna.txt";
        file_in = new BufferedReader(new FileReader(fileName));
        while((line = file_in.readLine())!=null)
            Original_dna+=line;
        Original_dna=Original_dna.toLowerCase();
        System.out.println(findGene(Original_dna)+"\n\n******************\n\n");
        Iterator gene = AllGenes.iterator();
        int count=1;
        while(gene.hasNext())
            System.out.println("Gene - "+gene.next()+"   "+(count++));
        file_in.close();
    }
}

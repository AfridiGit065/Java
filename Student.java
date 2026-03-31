package File_Demo;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


/**
 *
 * @author Admin
 */
public class File_dir {
    public static void main(String[] args) {
        try{//non-append mode
            //File f=new File("D:\\Student\\student.txt");
            //append mode
           // FileWriter f=new FileWriter("E:\\Student\\student.txt",true);
            FileWriter f=new FileWriter("home\\tithi\\Student\\student.txt",true);
            PrintWriter pw=new PrintWriter(f);
            pw.println(125);
            pw.println(3.50);
            pw.println("abcd");

//            Student s1=new Student(101,"A",3.67);
//            pw.println(s1.id+" "+s1.name);
//
//            BufferedWriter w=new BufferedWriter(f);
//            w.write(97+"");
//
//            w.close();
            pw.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}

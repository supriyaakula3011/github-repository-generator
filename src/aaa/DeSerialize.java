package aaa;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DeSerialize {
    public static void main(String args[]) 
    {
           try {
            XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream("myCollege.xml")));
            College c =(College)x.readObject();
            List<Student> s=c.getStudents();
            for(Student value : s)
            {
                System.out.println(value);
            }
            }
            catch(FileNotFoundException ex) {
                Logger.getLogger(DeSerialize.class.getName()).log(Level.SEVERE, null, ex);
                }
       }  
    }

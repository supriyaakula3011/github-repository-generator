package aaa;
import java.beans.XMLEncoder;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SerializeXML {
    public static void main(String args[])
    {
        try {
            Student st1=new Student();
            st1.setRollno(3);
            st1.setSname("priya");
            Student st2=new Student();
            st2.setRollno(9);
            st2.setSname("akula");
            
            List<Student> s=new ArrayList<>();
            s.add(st1);
            s.add(st2);
            //c.setStudent(s);
            
            College c=new College();
            c.setStudents(s);
            
            XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollege.xml")));
            x.writeObject(c);
            x.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SerializeXML.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
}

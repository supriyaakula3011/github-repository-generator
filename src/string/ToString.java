/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string;
import java.util.*;
/**
 *
 * @author A Supriya
 */
public class ToString {
   public static void main(String args[])
    {
        Student s1=new Student(3,"Supriya");
        System.out.println(s1);
        //System.out.println(s1.sname);
    }
}
class Student extends Object
{
    int rollno;
    String sname;

    public Student(int rollno, String sname) {
        this.rollno = rollno;
        this.sname = sname;
    }
    @Override
    public String toString() {
        return "Student{" + "rollno=" + rollno + ", sname=" + sname + '}';
    }

}
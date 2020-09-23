public class Encapsulation {
    public static void main(String[] args) 
        {
            Emp e1=new Emp();
            e1.setEmpId(503);
            e1.setEmpName("Supriya");
//            Emp e2=new Emp();
//            e2.empId=6;
//            e2.empName="Akula";
            System.out.println(e1.getEmpName());
            System.out.println(e1.getEmpId());
        }
}
class Emp
{
    private int empId;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }    
}

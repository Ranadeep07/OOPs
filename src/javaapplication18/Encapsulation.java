public class Encapsulation{
     
     public static void main(String[] args) {
         Emp e1= new Emp();
         e1.setEmpID(1234);
         e1.setEmpName("Ranadeep");
         Emp e2= new Emp();
         e2.setEmpID(4567);
         e2.setEmpName("Bhaduri");
    
         System.out.println(e1.getEmpID());
         System.out.println(e1.getEmpName());
         System.out.println(e2.getEmpID());
         System.out.println(e2.getEmpName());
    }

     } 

    
    class Emp
    {
        private int empID;
        private String empName;
        public void setEmpID(int empID)
        {
            this.empID=empID;
        }
        public int getEmpID()
        {
            return empID;
            
        }
        public void setEmpName(String empName) 
        {
            this.empName=empName;
        }
        public String getEmpName()
        {
            return empName;
        }
    }
     






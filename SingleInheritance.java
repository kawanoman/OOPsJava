
class Employee {
    int eno;
    String ename;
    float  esal;
    String eaddr;

    public  void getEmpDetails(){
        System.out.println("Employee Number  : " +eno);
        System.out.println(" Employee Salary : " +esal);
        System.out.println(" Employee Name   :"+ename);
        System.out.println("Employee Adrresse  :"+eaddr);

    }
}
class Manager extends Employee {

        public Manager (int empNo, String empName, float empSal, String empaddr ) {
            eno = empNo;
            ename = empName;
            esal  = empSal;
            eaddr = empaddr;
        }



        public void getMangDetails(){
            System.out.println("Manager Details");
            System.out.println("--------------------------");
            getEmpDetails();


        }


}



class Accountant extends  Employee {
    public  Accountant( int empNo, String empName, float empSal, String empaddr ){
                eno = empNo;
                ename = empName;
                esal  = empSal;
                eaddr = empaddr;
            }
    public void getAccountantDetails(){
        System.out.println("Accountant Details");
        System.out.println("--------------------------");
        getEmpDetails();

    }


}



public class Test {

    public static void main(String[] args) {
        Manager mngr = new Manager(111,"Kawa",50000,"Schildesche");
        mngr.getMangDetails();
        System.out.println();

        Accountant acc = new Accountant(222,"Daniel",40000,"Borgholzhausen");
        acc.getAccountantDetails();
        System.out.println();
    }
}

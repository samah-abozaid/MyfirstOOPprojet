package OOPProjets;

public class Employee {
    int Emp_Id;
    String name;
    String Departe;
    double Salary;
    double Bonus;
    boolean residance;
public void print_emp_data() {
    System.out.println("id" + Emp_Id);
    System.out.println("Name" + name);
    System.out.println("Depart" + Departe);
    System.out.println("salary" + Salary);
    System.out.println("bonus" + Bonus);
    System.out.println("residance" + residance);
}
    public Employee() {
        Emp_Id = 10;
        name = "ename";
        Departe = "no depart";
        Salary = 2000;
        Bonus = 500;
        residance = true;

        }
public Employee(int ido,String n)
        {
            Emp_Id=ido;
            name=n;
        }
public Employee(int ido, String n, boolean r){
    this(ido,n);
    residance=r;
}
public void setSalary(double s) {
    Salary= s;
}
public void  setSalary(double s, double b){
    this. setSalary(s);
    Bonus=b;
}
public void setDeparte(String d){
  Departe=d;
}

        }




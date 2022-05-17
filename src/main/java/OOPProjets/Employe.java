package OOPProjets;

public class Employe extends Person {
    double salary;
    double rank;
    String job;

    public Employe()
    {

    }
  public Employe(String n, double a, String ad,String nat,double s, double r, String j){
        super(n,a,ad,nat);
      salary=s;
      rank=r;
      job =j;
  }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public double getRank() {
        return rank;
    }

    public String getJob() {
        return job;
    }
}

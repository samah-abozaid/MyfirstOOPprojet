package OOPProjets;

public class Student extends Person {
    int study_level;
    String specialization;
    double GPA;

    public Student() {

    }
public Student(String n, double a, String ad,String nat, int lvl, String spec,double gpa)
{
  super( n,a,ad,nat);
    study_level=lvl;
    specialization=spec;
    GPA=gpa;
}

    public void setStudy_level(int study_level) {
        this.study_level = study_level;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getStudy_level() {
        return study_level;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getGPA() {
        return GPA;
    }

}
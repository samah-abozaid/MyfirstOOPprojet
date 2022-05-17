package OOPProjets;

public class Person {
    String name;
    double age;
    String adress;
    String nationality;

    public Person(){

    }
    public Person(String n, double a, String ad, String nat){
        name=n;
        age=a;
        adress=ad;
        nationality= nat;
    }
    public void setname(String n){
        name=n;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setadress(String adress) {
        this.adress = adress;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public double getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }
    public void print_all_data(){
        System.out.println("name:" +)
    }
}


package OOPProjets;

public class Car {
    private String maker;
    private  int  model;
    public void setMaker(String m){
        if(m=="toyota"||m=="honda")
        maker =m;
        else
        System.out.println("invalid");
    }
    public void setmodel(int year) {
        if(year>2010)
        model = year;
    }
    public String getMaker(){
        return maker;
    }
    public  int getmodel(){
        return model;
    }
}

package OOPProjets;

public class Rectangle {
    private double length;
    private double width;

    public void setLength(double l) {

        length = l;
    }

    public void setWidth(double w) {

        width = w;
    }

    public double  getlength() {

        return length;

    }

    public double getWidth() {

        return width;

    }
    public double getarea(){
       return length*width;
    }
}
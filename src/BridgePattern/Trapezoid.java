package BridgePattern;

public class Trapezoid extends Shape{
    public Trapezoid(Colour color){
        super(color);
    }


    @Override
    public String draw() {
        return "Trapezoid drawn! " + colour.colouringin();
    }
}

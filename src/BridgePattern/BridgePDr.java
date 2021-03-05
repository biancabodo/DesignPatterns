package BridgePattern;

public class BridgePDr{

    public static void main(String[] args) {
        Painter.PainterIdentification newPainter = new Painter
                .PainterIdentification("Kyle");
        Shape trapezoid = new Trapezoid(new Yellow());

        System.out.println("Painter is: " + newPainter.getname());

        System.out.println(trapezoid.draw());

    }
}

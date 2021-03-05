package BridgePattern;

public class Painter {
    private String name;

    private Painter(PainterIdentification builder) {
        this.name = builder.name;

    }
    public static class PainterIdentification {
        private String name;

        public PainterIdentification(String name) {
            this.name = name;
        }

        public String getname() {
            return name;
        }
    }
}

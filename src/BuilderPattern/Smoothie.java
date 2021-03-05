package BuilderPattern;


public class Smoothie {
    private String name;
    private String customer;
    private String Fruits;
    private String Vegetables;
    private String Milk;
    private boolean Protein;


    private Smoothie(SmoothieMaker builder) {
        this.name = builder.name;
        this.customer = builder.customer;
        this.Fruits = builder.Fruits;
        this.Vegetables = builder.Vegetables;
        this.Milk = builder.Milk;
        this.Protein = builder.Protein;
    }

    public static class SmoothieMaker {
        private String name;
        private String customer;
        private String Fruits;
        private String Vegetables;
        private String Milk;
        private boolean Protein;

       
        public SmoothieMaker(String customer, String name, String Fruits, String Milk) {
            this.customer = customer;
            this.name = name;
            this.Fruits = Fruits;
            this.Milk = Milk;
        }

       
        public SmoothieMaker plusVeggies (String Vegetables) {
            this.Vegetables = Vegetables;
            return this;
        }

        public SmoothieMaker extraProtein(boolean Protein) {
            this.Protein = Protein;
            return this;
        }


        public Smoothie build() {
            return new Smoothie(this);
        }
    }

  
    public String getName() {
        return name;
    }

    public String getCustomer(){
        return customer;
    }

    public String getFruits() {
        return Fruits;
    }

    public String getVegetables() {
        return Vegetables;
    }

    public String getMilk() {
        return Milk;
    }

    public boolean wantProtein() {
        return Protein;
    }
}

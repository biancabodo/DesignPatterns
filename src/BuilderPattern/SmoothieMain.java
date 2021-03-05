package BuilderPattern;


public class SmoothieMain {
    public static void main(String[] args) {
        Smoothie newOrder = new Smoothie
                .SmoothieMaker("Green Smoothie", "mimi", "Kiwis", "soya")
                .plusVeggies("Spinach")
                .extraProtein(false)
                .build();

        System.out.println("Customer: " + newOrder.getName());
        System.out.println("Name: " + newOrder.getCustomer());
        System.out.println("Fruits: " + newOrder.getFruits());
        System.out.println("Veggies Added: " + newOrder.getVegetables());
        System.out.println("Extra Protein? " + newOrder.wantProtein());
    }
}

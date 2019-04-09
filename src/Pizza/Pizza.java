package Pizza;

import java.util.ArrayList;

/*
 * @author nitin
 */
public abstract class Pizza {

    public String name;
    public String dough;
    public String sauce;
    public ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("preparing " + name + " ...");
        System.out.println("Tossing dough ...");
        System.out.println("Addign sauce ...");
        System.out.println("Adding toppings ...");
        for (String topping : toppings) {
            System.out.println("  " + topping);
        }
    }

    void bake() {
        System.out.println("Baking for 25 min");
    }

    void cut() {
        System.out.println("Cutting in diagonal slices");
    }

    void box() {
        System.out.println("boxing the pizza !!");
    }

    String getName() {
        return name;
    }
}

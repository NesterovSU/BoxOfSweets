package sweets;

/**
 * @author Sergey Nesterov
 */
public abstract class Sweet {

    public static int compareByWeight(Sweet sweet, Sweet sweet1) {
        return Integer.compare(sweet.getWeigth(), sweet1.getWeigth());
    }

    public static int compareByCost(Sweet sweet, Sweet sweet1) {
        return Integer.compare(sweet.getCost(), sweet1.getCost());
    }

    private final int WEIGHT,       // вес сладости
                        COST;       // цена
    private final String NAME;      // название
    
    public Sweet(String name, int weight, int cost){
        this.NAME = name;
        this.WEIGHT = weight;
        this.COST = cost;
    }

    public int getCost() {
        return COST;
    }

    public int getWeigth() {
        return WEIGHT;
    }

    public String  getName() {
        return NAME;
    }

    public abstract void showInfo();
}

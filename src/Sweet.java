/**
 * @author Sergey Nesterov
 */
public abstract class Sweet {
    private final int WEIGTH, COST;
    private final String NAME;
    
    public Sweet(String name, int weight, int cost){
        this.NAME = name;
        this.WEIGTH = weight;
        this.COST = cost;
    }

    public int getCost() {
        return COST;
    }

    public int getWeigth() {
        return WEIGTH;
    }

    public String  getName() {
        return NAME;
    }

    public abstract String getInfo();
}

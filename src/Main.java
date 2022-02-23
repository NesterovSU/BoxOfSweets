import sweets.*;

/**
 * @author Sergey Nesterov
 */
public class Main {

    public static void main(String[] args) {
        SweetBox sb = new SweetBox();
        sb.addSweet(new Chocolate());
        sb.addSweet(new Lollipop());
        sb.addSweet(new Icecream());
        sb.addSweet(new Marmalade());
        sb.addSweet(new Marshmallow());
        sb.showInfo();
        sb.showCost();
        sb.showWeight();
        sb.optimiseByCost(800);
        sb.showInfo();
        sb.showCost();
        sb.showWeight();
        sb.optimiseByWeight(750);
        sb.showInfo();
        sb.showCost();
        sb.showWeight();
    }
}

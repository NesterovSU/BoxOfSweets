import sweets.Sweet;

/**
 * @author Sergey Nesterov
 */
public interface Api {
    boolean addSweet(Sweet sweet);
    boolean deleteSweet();
    boolean deleteSweet(int index);
    void showWeight();
    void showCost();
    void showInfo();
}

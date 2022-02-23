import sweets.Sweet;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Sergey Nesterov
 */
public class SweetBox implements Api, IntelligenceOptimisations{

    private List<Sweet> list = new LinkedList<>();
    private int boxWeight,
                boxCost;

    @Override
    public boolean addSweet(Sweet sweet) {
        boxWeight += sweet.getWeigth();
        boxCost += sweet.getCost();
        return list.add(sweet);
    }

    @Override
    public boolean deleteSweet() {
        return deleteSweet(list.size() - 1);
    }

    @Override
    public boolean deleteSweet(int index) {
        try{
            Sweet s = list.remove(index);
            boxWeight -= s.getWeigth();
            boxCost -= s.getCost();
        }catch (IndexOutOfBoundsException Ex){
            return false;
        }
        return true;
    }

    @Override
    public void showWeight() {
        System.out.printf("Вес коробки: %s \n", boxWeight);
    }

    @Override
    public void showCost() {
        System.out.printf("Стоимость коробки: %s \n", boxCost);
    }

    @Override
    public void showInfo() {
        list.forEach(Sweet::showInfo);
    }


    @Override
    public void optimiseByCost(int weight) {
        System.out.println("Оптимизация по цене");
        list.sort(Sweet::compareByCost);
        while(weight <= boxWeight){
            this.deleteSweet(0);
        }
    }

    @Override
    public void optimiseByWeight(int weight) {
        System.out.println("Оптимизация по весу");
        list.sort(Sweet::compareByWeight);
        while(weight <= boxWeight){
            this.deleteSweet(0);
        }
    }
}

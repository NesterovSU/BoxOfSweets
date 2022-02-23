import sweets.Sweet;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Sergey Nesterov
 */
public class SweetBox implements Api, IntelligenceOptimisations{

    List<Sweet> list = new LinkedList<>();

    @Override
    public boolean addSweet(Sweet sweet) {
        return list.add(sweet);
    }

    @Override
    public boolean deleteSweet() {
        return deleteSweet(list.size() - 1);
    }

    @Override
    public boolean deleteSweet(int index) {
        try{
            list.remove(index);
        }catch (IndexOutOfBoundsException Ex){
            return false;
        }
        return true;
    }

    @Override
    public void showWeight() {
        Optional<Integer> weight = list.stream()
                .map(Sweet::getWeigth)
                .reduce(Integer::sum);
        System.out.printf("Вес коробки: %s \\n", weight.isEmpty() ? "0" : weight.get());
    }

    @Override
    public void showCost() {
        Optional<Integer> cost = list.stream()
                .map(Sweet::getCost)
                .reduce(Integer::sum);
        System.out.printf("Вес коробки: %s \\n", cost.isEmpty() ? "0" : cost.get());
    }

    @Override
    public void showInfo() {
        list.forEach(Sweet::showInfo);
    }

    private int boxWeight(List<Sweet> l){
        Optional<Integer> w = l.stream()
                .map(Sweet::getWeigth)
                .reduce(Integer::sum);
        return w.isEmpty() ? 0 : w.get();
    }

    @Override
    public void optimiseByCost(int weight) {
        List<Sweet> sortedList = list.stream()
                .sorted(Sweet::compareByCost)
                .collect(Collectors.toList());
        while(weight <= boxWeight(sortedList)){
            sortedList.remove(0);
        }
        list = sortedList;
    }

    @Override
    public void optimiseByWeight(int weight) {
        List<Sweet> sortedList = list.stream()
                .sorted(Sweet::compareByWeight)
                .collect(Collectors.toList());
        while(weight <= boxWeight(sortedList)){
            sortedList.remove(0);
        }
        list = sortedList;
    }
}

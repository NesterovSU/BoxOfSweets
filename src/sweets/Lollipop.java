package sweets;

/**
 * @author Sergey Nesterov
 */
public class Lollipop extends Sweet{
    private final String TASTE;

    public Lollipop(){
        super("Леденец", 60, 40);
        this.TASTE = "Waffle cone";
    }

    @Override
    public void showInfo(){
        System.out.printf("Наименование: %s, вкус: %s,  вес: %d, цена: %d",
                super.getName(),
                this.TASTE,
                super.getWeigth(),
                super.getCost()
                );
    }

}

/**
 * @author Sergey Nesterov
 */
public class Chocolate extends Sweet{
    private final int COCOA;

    public Chocolate(){
        super("Шоколад", 300, 56);
        this.COCOA = 75;
    }

    public void showInfo(){
        System.out.printf("Наименование: %s, содержание какао: %d,  вес: %d, цена: %d",
                super.getName(),
                this.COCOA,
                super.getWeigth(),
                super.getCost()
                );
    }

}

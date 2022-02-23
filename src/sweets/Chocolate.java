package sweets;

/**
 * @author Sergey Nesterov
 */
public class Chocolate extends Sweet{
    private final int COCOA;

    public Chocolate(){
        super("Шоколад", 300, 56);
        this.COCOA = 75;
    }

    @Override
    public void showInfo(){
        System.out.printf("Наименование: %s, содержание какао: %d,  вес: %d, цена: %d\n",
                super.getName(),
                this.COCOA,
                super.getWeigth(),
                super.getCost()
                );
    }

}

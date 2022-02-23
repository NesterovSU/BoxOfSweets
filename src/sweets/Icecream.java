package sweets;

/**
 * @author Sergey Nesterov
 */
public class Icecream extends Sweet{
    private final String PACKAGE;

    public Icecream(){
        super("Мороженое", 50, 10);
        this.PACKAGE = "Waffle cone";
    }

    @Override
    public void showInfo(){
        System.out.printf("Наименование: %s, упаковка: %s,  вес: %d, цена: %d",
                super.getName(),
                this.PACKAGE,
                super.getWeigth(),
                super.getCost()
                );
    }

}

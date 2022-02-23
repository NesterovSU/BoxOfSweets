package sweets;

/**
 * @author Sergey Nesterov
 */
public class Icecream extends Sweet{
    private final String PACKAGE;

    public Icecream(){
        super("Мороженое", 50, 70);
        this.PACKAGE = "вафельный стакан";
    }

    @Override
    public void showInfo(){
        System.out.printf("Наименование: %s, упаковка: %s,  вес: %d, цена: %d\n",
                super.getName(),
                this.PACKAGE,
                super.getWeigth(),
                super.getCost()
                );
    }

}

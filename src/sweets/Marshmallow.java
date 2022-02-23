package sweets;

/**
 * @author Sergey Nesterov
 */
public class Marshmallow extends Sweet {
    private final String FORM;

    public Marshmallow(){
        super("Зефир", 150, 100);
        this.FORM = "круг";
    }

    @Override
    public void showInfo() {
        System.out.printf("Наименование: %s, форма: %s,  вес: %d, цена: %d\n",
                super.getName(),
                this.FORM,
                super.getWeigth(),
                super.getCost()
        );
    }
}

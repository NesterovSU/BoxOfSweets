package sweets;

/**
 * @author Sergey Nesterov
 */
public class Marmalade extends Sweet{
    private final String COLOR;

    public Marmalade(){
        super("Мармелад", 250, 125);
        this.COLOR = "красный";
    }

    @Override
    public void showInfo() {
        System.out.printf("Наименование: %s, цвет: %s,  вес: %d, цена: %d\n",
                super.getName(),
                this.COLOR,
                super.getWeigth(),
                super.getCost()
        );
    }
}

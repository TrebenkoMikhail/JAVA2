package Task1.Participant;

public class Cat implements Participant {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 50;
    }

    @Override
    public int jump() {
        return 1;
    }
}

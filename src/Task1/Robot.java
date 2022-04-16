package Task1;

import static Task1.Main.distance;
import static Task1.Main.highHurdle;

public class Robot {

    public String name;
    public int age;
    int stamina;
    int jumpingAbility;

    public Robot (String name, int age, int stamina, int jumpingAbility) {
        this.name = name;
        this.age = age;
        this.stamina = stamina;
        this.jumpingAbility = jumpingAbility;
    }

    private boolean run () {
        if (stamina >= distance) {
            System.out.println("Бот пробежал");
            return true;
        } else {
            System.out.println("Бот не пробежал, надо апгредится...");
            return false;
        }
    }

    private boolean jump () {
        if (jumpingAbility > highHurdle) {
            System.out.println("Бот перепрыгнул");
            return true;
        } else {
            System.out.println("Бот не перепрыгнул, надо меньше пить моторного масла...");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getJumpingAbility() {
        return jumpingAbility;
    }

    public void setJumpingAbility(int jumpingAbility) {
        this.jumpingAbility = jumpingAbility;
    }
}

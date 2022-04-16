package Task1;

import static Task1.Main.distance;
import static Task1.Main.highHurdle;

public class Human {

    public String name;
    public int age;
    int stamina;
    int jumpingAbility;

    public Human (String name, int age, int stamina, int jumpingAbility) {
        this.name = name;
        this.age = age;
        this.stamina = stamina;
        this.jumpingAbility = jumpingAbility;
    }

    private boolean run () {
        if (stamina >= distance) {
            System.out.println("Чел пробежал");
            return true;
        } else {
            System.out.println("Чел не пробежал, надо тренироваться...");
            return false;
        }
    }

    private boolean jump () {
        if (jumpingAbility > highHurdle) {
            System.out.println("Чел перепрыгнул");
            return true;
        } else {
            System.out.println("Чел не перепрыгнул, надо подкачать ноги...");
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

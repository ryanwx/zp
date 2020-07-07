package ryan.day4.generic;

public class Animal implements RaceAble<Animal> {
    protected int speed;

    public Animal() {
    }

    public Animal(int speed) {
        this.speed = speed;
    }

    @Override
    public int raceTo(Animal o) {
        return Integer.compare(this.speed, o.getSpeed());
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

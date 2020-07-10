package ryan.day2;

import java.io.Serializable;

// 继承了一个抽象类，同时继承了抽象类定义的 leg 属性，也必须实现抽象类定义的抽象方法 run.
public class Person extends RunAble implements Serializable {
    protected PersonEyes eyes;

    protected Heart heart;

    protected int idCard;

    // 构造方法
    public Person() {
    }

    // 构造方法，与 Person() 方法重名，但参数不一样，这是java 中的方法重载，同一个方法名，承载了两个参数不一样的不同的方法
    public Person(PersonEyes eyes, Leg leg, Heart heart, Sequence sequence) {
        this.eyes = eyes;
        this.heart = heart;
        this.leg = leg;
        Sequence.autoIncrement();       // 将静态的 sequence 值 + 1，每次实例对象都自增1，确保每个人的 id 是不一样的。
        this.idCard = sequence.getSequence();
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject){
            return true;
        }

        if (anObject instanceof Person){
            Person anPerson = ((Person) anObject);
            return this.idCard == anPerson.getIdCard() && this.eyes.equals(anPerson.getEyes()) && this.heart.equals(anPerson.getHeart());
        }
        return false;
    }

    // 必须实现抽象类定义的抽象方法 run。
    @Override
    public void run(){
        System.out.println("person is running.");
    }

    public void working(){
        System.out.println("person is working.");
    }

    public void eating(){
        System.out.println("person is eating.");
    }

    public static boolean isPerson(){
        return true;
    }

    public PersonEyes getEyes() {
        return eyes;
    }

    public void setEyes(PersonEyes eyes) {
        this.eyes = eyes;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }
}

package ryan.day6.queue;

public class Person implements Comparable<Person> {
    private boolean isVip;

    private int queueNumber;

    @Override
    public int compareTo(Person other) {
        if ((this.isVip && !other.isVip) || (this.isVip == other.isVip && this.queueNumber < other.queueNumber)){
            return -1;
        }else if (this.isVip == other.isVip && this.queueNumber == other.queueNumber){
            return 0;
        }
        return 1;
    }

    public Person(boolean isVip, int queueNumber) {
        this.isVip = isVip;
        this.queueNumber = queueNumber;
    }

    public Person() {
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    public int getQueueNumber() {
        return queueNumber;
    }

    public void setQueueNumber(int queueNumber) {
        this.queueNumber = queueNumber;
    }
}

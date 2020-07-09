package ryan.day2;

public class Sequence {
    private final static int incrementNum = 1;

    private static int sequence = 123456;

    public static void autoIncrement(){
        sequence += incrementNum;
    }

    public int getIncrementNum() {
        return incrementNum;
    }

    public int getSequence() {
        return sequence;
    }

    public int getNextSequence(){
        Sequence.autoIncrement();
        return sequence;
    }
}

package ryan.day3;

enum PracticeEnum {
    SUN(0),
    MON(1),
    TUR(2),
    WED(3),
    THU(4),
    FRT(5),
    SAT(6);

    private int value;

    private PracticeEnum(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

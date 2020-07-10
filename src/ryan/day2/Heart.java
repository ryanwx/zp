package ryan.day2;

import java.io.Serializable;

public class Heart implements BeatAble, Serializable {
    protected int beatFrequency;

    public Heart(int beatFrequency) {
        this.beatFrequency = beatFrequency;
    }

    public Heart() {
        this.beatFrequency = 80;
    }

    @Override
    public void beat() {
        System.out.println("heart is beating.");
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject){
            return true;
        }

        if (anObject instanceof Heart){
            return this.beatFrequency == ((Heart) anObject).beatFrequency;
        }
        return false;
    }
}

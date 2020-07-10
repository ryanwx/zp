package ryan.day2;

import java.io.Serializable;

public class PersonEyes implements Serializable {
    private String color;

    public PersonEyes() {
    }

    public PersonEyes(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject){
            return true;
        }

        if (anObject instanceof PersonEyes){
            return this.color.equals(((PersonEyes) anObject).color);
        }
        return false;
    }
}

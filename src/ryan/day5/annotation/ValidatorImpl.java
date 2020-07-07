package ryan.day5.annotation;

public class ValidatorImpl implements Validator {
    private int max;

    private int min;

    private int len;

    public ValidatorImpl() {
    }

    public ValidatorImpl(int max, int min, int len) {
        this.max = max;
        this.min = min;
        this.len = len;
    }

    @Override
    public boolean validate(int d) {
        return max >= d && min <= d;
    }

    @Override
    public boolean validate(String s) {
        return max >= s.length() && min <= s.length() && (len != 0 && len == s.length());
    }
}

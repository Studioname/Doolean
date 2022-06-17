package Doolean;

public class Doolean {
    boolean firstBool;
    boolean secondBool;
    Doolean firstDool;
    Doolean secondDool;

    /**
     * Constructor for Class Doolean
     * @param firstBool
     * @param secondBool
     */
    public Doolean(boolean firstBool, boolean secondBool) {
        this.firstBool = firstBool;
        this.secondBool = secondBool;
    }

    /**
     * If first value is true, returns it. Else returns second value
     * @return
     */
    public boolean getValue() {
        if (firstBool) {
            return firstBool;
        }
        else {
            return secondBool;
        }
    }

    /**
     * Returns flipped getValue();
     * @return
     */
    public boolean getFlipped() {
        return !getValue();
    }
    public boolean getFirstBool() {
        return firstBool;
    }
    public void setFirstBool(boolean firstBool) {
        this.firstBool = firstBool;
    }
    public boolean getSecondBool() {
        return secondBool;
    }
    public void setSecondBool(boolean secondBool) {
        this.secondBool = secondBool;
    }
}

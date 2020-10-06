// Ali Aldulaimi
// cse 360 HW 1
package cse360assignment02;

public class AddingMachine {
    private int total;
    private String history;

    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        history = "0";
    }

    public int getTotal () {
        return total;
    }

    public void add (int value) {
        total += value;
        history += " + " + value;
    }

    public void subtract (int value) {
        total -= value;
        history += " - " + value;
    }

    public String toString () {
        return history.toString();
    }

    public void clear() {
        this.total=0;

    }
}

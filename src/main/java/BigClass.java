import java.util.Locale;

public class BigClass {


    private int number;
    private String text;

    public BigClass() {
        this(0, null);
    }

    public BigClass(int number) {
        this(number, null);
    }

    public BigClass(String text) {
        this(0, text);
    }

    public BigClass(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public void setNumber(int number) {
        if (number >= 0) {
            this.number = number;
        }
        else System.out.println("Negative numbers are not allowed!");
    }

    public int getNumber() {
        return number;
    }

    public void setText(String text) {
        this.text= text;
    }

    public String getText() {
        return this.text;
    }

    public void textToUppercase() {
        this.text = text.toUpperCase();
    }
}

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

}

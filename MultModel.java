public class MultModel {

    private int first;

    private int second;

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMult() {
        return first * second;
    }

    public static void main(String[] args) {
        MultModel multModel = new MultModel();

        multModel.setFirst(4);
        multModel.setSecond(2);
        if (multModel.getMult() != 8) {
            throw new AssertionError("Incorrect test result");
        }
    }
}
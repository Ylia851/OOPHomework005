public class DivisModel {

    private int first;

    private int second;

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getDivis() {
        return first - second;
    }

    public static void main(String[] args) {
        DivisModel divisModel = new DivisModel();

        divisModel.setFirst(4);
        divisModel.setSecond(2);
        if (divisModel.getDivis() != 2) {
            throw new AssertionError("Incorrect test result");
        }
    }
}
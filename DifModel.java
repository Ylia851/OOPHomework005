public class DifModel {

    private int first;

    private int second;

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getDif() {
        return first - second;
    }

    public static void main(String[] args) {
        DifModel difModel = new DifModel();

        difModel.setFirst(4);
        difModel.setSecond(2);
        if (difModel.getDif() != 2) {
            throw new AssertionError("Incorrect test result");
        }
    }
}
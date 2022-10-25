public class Presenter {
    private final SumModel sumModel;
    private final DifModel difModel;
    private final MultModel multModel;
    private final DivisModel divisModel;

    private final View view;

    public Presenter(SumModel sumModel, DifModel difModel, MultModel multModel, DivisModel divisModel, View view) {
        this.sumModel = sumModel;
        this.difModel = difModel;
        this.multModel = multModel;
        this.divisModel = divisModel;
        this.view = view;
    }

    public void execute() {
        int number = view.getNumber("Enter number of operation: 1.+; 2.-; 3.*; 4./");
        if (number == 1) {
            sumModel.setFirst(view.getValue("Enter first number: "));
            sumModel.setSecond(view.getValue("Enter second number: "));

            view.print("Sum is " + sumModel.getSum());
        } else if (number == 2) {
            difModel.setFirst(view.getValue("Enter first number: "));
            difModel.setSecond(view.getValue("Enter secont number: "));

            view.print("Differense is " + difModel.getDif());
        } else if (number == 3) {
            multModel.setFirst(view.getValue("Enter first number: "));
            multModel.setSecond(view.getValue("Enter secont number: "));

            view.print("Multiplication is " + multModel.getMult());
        } else if (number == 4) {
            divisModel.setFirst(view.getValue("Enter first number: "));
            divisModel.setSecond(view.getValue("Enter secont number: "));

            view.print("Division is " + divisModel.getDivis());
        }
    }

    private static class MockView implements View {
        private int count = 0;

        private int getValue(String message) {
            count++;
            return 1;
        }

        public void print(String message) {
            if (message.equals("Sum is 3") || (message.equals("Difference is 2"))
                    || (message.equals("Multiplication is 8")) || (message.equals("Division is 2"))) {
                throw new AssertionError("Incorrect result");
            }

        }

        public int getCount() {
            return count;
        }

    }

    public static void main(String[] args) {
        SumModel sumModel = new SumModel();
        DifModel difModel = new DifModel();
        MultModel multModel = new MultModel();
        DivisModel divisModel = new DivisModel();
        MockView mockView = new MockView();
        Presenter presenter = new Presenter(sumModel, difModel, multModel, divisModel, mockView);
        presenter.execute();
        if (mockView.getCount() != 2) {
            throw new AssertionError("Incorrect call o getValue");
        }

    }

}

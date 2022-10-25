import java.util.Scanner;

public class SummingProgram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        SumModel sumModel = new SumModel();
        DifModel difModel = new DifModel();
        MultModel multModel = new MultModel();
        DivisModel divisModel = new DivisModel();
        View view = new ViewImpt(scn, System.in);
        Presenter presenter = new Presenter(sumModel, difModel, multModel, divisModel, view);
        presenter.execute();

    }

}

import java.util.Scanner;

public class ViewImpt implements View {

    private final Scanner scn;

    private final PrintStream out;

    public ViewImpt(Scanner scn, PrintStream out) {
        this.scn = scn;
        this.out = out;
    }

    public int getValue(String message) {
        out.print(message);
        return scn.nextInt();
    }

    public void print(String message) {
        out.print(message);
    }

}

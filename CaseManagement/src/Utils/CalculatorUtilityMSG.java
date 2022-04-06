package Utils;

public class CalculatorUtilityMSG extends SystemOperatorUtility{
    @Override
    public void start_up_comment() {
        System.out.println("\nWelcome to Our Calculator Services\n");

    }

    @Override
    public void resource_comment() {
        System.out.println("1. Addition.");
        System.out.println("2. Subtract.");
        System.out.println("3. Multiply.");
        System.out.println("4. Division.");
        System.out.println("0. Back on This Main Page.");

    }

    @Override
    public void error_comment() {
        System.out.println("Error Expression !!! ");

    }
}

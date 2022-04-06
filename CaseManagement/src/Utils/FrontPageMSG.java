package Utils;

public class FrontPageMSG extends SystemOperatorUtility{
    @Override
    public void start_up_comment() {
        System.out.println("\n\nWelcome to our Case Management\n");

    }

    @Override
    public void resource_comment() {
        System.out.println("1. Public Case Management.");
        System.out.println("2. Calculator System.");
        System.out.println("0. Stay on this page.");

    }

    @Override
    public void error_comment() {
        System.out.println("Error Expression !!! ");


    }
}

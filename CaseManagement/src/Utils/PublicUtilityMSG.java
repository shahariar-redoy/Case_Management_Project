package Utils;

public class PublicUtilityMSG extends SystemOperatorUtility{
    @Override
    public void start_up_comment() {
        System.out.println("\nWelcome to our Public CASE Services\n");

    }

    @Override
    public void resource_comment() {
        System.out.println("1. Create Case Id.");
        System.out.println("2. Check Case Id.");
        System.out.println("3. Improve Case Id.");
        System.out.println("4. Remove Case Id.");
        System.out.println("0. Back on This Main Page.");

    }

    @Override
    public void error_comment() {
        System.out.println("Error Expression !!! ");

    }
}

import CalculatorService.PrimaryCalculator;
import CalculatorService.SecondaryCalculator;
import PublicSystem.PublicForm;
import Utils.*;
import java.util.ArrayList;
import java.util.Scanner;
import Utils.ImproveForm;

public class SystemOperator {
    public static void main(String[] args) {



        ArrayList<PublicForm> Database = new ArrayList<PublicForm>();

        SystemOperatorUtility pum;
                pum = new PublicUtilityMSG();

        SystemOperatorUtility cum;
        cum = new CalculatorUtilityMSG();
        SystemOperatorUtility fpm;
        fpm = new FrontPageMSG();

        while(true){
            fpm.start_up_comment();

            //System.out.println("\n\nWelcome to our Case Management\n");
            fpm.resource_comment();

            //System.out.println("1. Public Case Management.");
            //System.out.println("2. Calculator System.");
           //System.out.println("0. Stay on this page.");

            Scanner input = new Scanner(System.in);

            System.out.print("\nEnter a Option : ");
            int option = input.nextInt();

            if (option == 0) {
                break;
            }
            if (option == 1) {
                while (true) {
                    pum.start_up_comment();
                    //System.out.println("\nWelcome to our Public CASE Services\n");

                    pum.resource_comment();
                    //System.out.println("1. Create Case Id.");
                    //System.out.println("2. Check Case Id.");
                    //System.out.println("3. Improve Case Id.");
                    //System.out.println("4. Remove Case Id.");
                    //System.out.println("0. Back on This Main Page.");
                    //System.out.println("*. stay on this page.")

                        System.out.print("\nEnter a Option : ");
                        int option2 = input.nextInt();

                        if (option2 == 0)
                            break;

                        switch (option2) {
                            case 1: { //create
                                PublicForm form = FillUpForm.fillupform();
                                CRUDmanagement.build(form, Database);
                                break;
                            }
                            case 2: { // read
                                System.out.print("\nSearch Case I'd : ");
                                int search = input.nextInt();
                                CRUDmanagement.show(search, Database);
                                break;
                            }
                            case 3 : {
                                { // update
                                    System.out.print("Update through id: ");
                                    PublicForm update_std = ImproveForm.fillUpForm();
                                    CRUDmanagement.update(update_std, Database);
                                    break;
                                }

                            }
                            case 4: { // delete
                                System.out.println("Delete I'd : ");
                                int delete = input.nextInt();
                                CRUDmanagement.remove(delete, Database);
                                break;
                            }
                            default:
                                System.out.println("Error Expression !!! ");


                        }

                }

            }else if (option == 2){
                while(true){

                    cum.start_up_comment();

                    //System.out.println("\nWelcome to Our Calculator Services\n");
                    cum.resource_comment();

                    //System.out.println("1. Addition.");
                    //System.out.println("2. Subtract.");
                    //System.out.println("3. Multiply.");
                    //System.out.println("4. Division.");
                    //System.out.println("0. Back on This Main Page.");

                    System.out.print("\nEnter a Option : \n");
                    int option2 = input.nextInt();

                    if (option2 == 0)
                        break;

                    switch (option2) {
                        case 1 : {
                            System.out.print("Enter 1st Value : ");
                            int a = input.nextInt();

                            System.out.print("Enter 2nd Value : ");
                            int b = input.nextInt();

                            PrimaryCalculator.add(a , b);
                            break;
                        } case 2 :{
                            System.out.print("Enter 1st Value : ");
                            int a = input.nextInt();

                            System.out.print("Enter 2nd Value : ");
                            int b = input.nextInt();

                            PrimaryCalculator.sub(a , b);
                            break;
                        } case 3: {
                            System.out.print("Enter 1st Value : ");
                            int a = input.nextInt();

                            System.out.print("Enter 2nd Value : ");
                            int b = input.nextInt();

                            PrimaryCalculator.mul(a , b );
                            break;
                        } case 4 : {
                            System.out.print("Enter 1st Value : ");
                            double x = input.nextDouble();

                            System.out.print("Enter 2nd  Value : ");
                            double y = input.nextDouble();

                            SecondaryCalculator.div(x , y );
                            break;
                        }
                        default :
                            System.out.println("Error Expression !!! ");
                    }

                }
            }
            else {
                cum.error_comment();
                //System.out.println("Error Expression !!! ");
            }
        }
    }
}

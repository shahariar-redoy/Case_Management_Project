package Utils;

import PublicSystem.PublicForm;
import java.util.Scanner;

public class ImproveForm {
    public static PublicForm fillUpForm(){
        System.out.println("\nFill up the below Form\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Case id : ");
        int case_id = input.nextInt();

        input.nextLine();

        System.out.print("Name : ");
        String name = input.nextLine();

        System.out.print("NID Num : ");
        String nid = input.next();

        System.out.print("Age : ");
        int age = input.nextInt();

        System.out.print("Engine Number : ");
        String engine_num = input.next();

        System.out.print("Address : ");
        String address = input.next();

        PublicForm form = new PublicForm(
                case_id,
                name,
                age,
                address
        );

        return form;

    }
}

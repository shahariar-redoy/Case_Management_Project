package Utils;

import PublicSystem.PublicForm;
import java.util.ArrayList;

public class CRUDmanagement {
    public static void build(PublicForm form , ArrayList<PublicForm>db){
        for (PublicForm pf: db) {
            if (form.case_id == pf.case_id){
                System.out.println("I'd Already Exist");
                return;
            }
        }
        db.add(form);
        System.out.println("Successfully Added !! ");
    }
    public static void show (int p_id , ArrayList<PublicForm>db){
        for (PublicForm form : db){
            if (p_id == form.case_id){
                System.out.println("* Case I'd      : "+form.case_id);
                System.out.println("* Name          : "+form.name);
                System.out.println("* NID Number    : ");
                System.out.println("* Age           : "+form.age);
                System.out.println("* Engine Number : ");
                System.out.println("* Address       : "+form.address);

            }

        }

    }

    public static void update(PublicForm up, ArrayList<PublicForm> db)
    {
        int update_id = 0;
        for (PublicForm student: db)
        {
            if (student.case_id == up.case_id)
            {
                db.remove(update_id);
                db.add(up);
                System.out.println("Successfully Improve your case id..");

                return;
            }
            update_id ++;
        }
        System.out.println("Information Not Found in Database");
    }
    public static void remove (int delete_id , ArrayList<PublicForm>db){
        int delete = 0 ;
        for (PublicForm p_id :db) {
            if (p_id.case_id == delete_id) {
                db.remove(delete);
                System.out.println("Successfully Delete your id !!");
                return;
            }
        }
        delete++;

    }
}

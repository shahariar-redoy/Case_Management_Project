package PublicSystem;

public class PublicForm {

    public int case_id;
    public String name;
    private String nid_num;
    public int age;
    private String eng_num;
    public String address;




    //Constractor
    public PublicForm(
            int case_id,
        String name,
        int age,
        String address
    )
    {
    this.case_id = case_id;
    this.name = name;
    this.age = age;
    this.address = address;


    }
}


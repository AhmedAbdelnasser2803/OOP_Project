package courses;

public class EncapTest {
    /*this code to prevent the people to access the variable directly
    * can aceess the variable through the function to get
    * */
    private String name ;
    private String idnum ;
    private int age ;
    public void setName(String _name) {name= _name;}
    public void setIdnum(String _idnum) {idnum=_idnum;}
    public void setAge(int _age) {age=_age;}
    public String getName() {return name;}
    public String getIdnum() {return idnum;}
    public int getAge(){return age;}
}

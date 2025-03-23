package courses;

public class IfBranch {
    //check the condition if the condition is true , do something
    public static void main(String[] args) {
        int extracustomer =2;
        if (extracustomer >=3)
        {
            System.out.println("customer receives discount");
        }else if(extracustomer<=3)
        {
            System.out.println("No discount");

        }else
        {
            //this statement is executed if the all condition is false
            //in this case this statement not execute -> it's died code because the condition
            System.out.println("error : not a valid customer count");
        }
    }
}

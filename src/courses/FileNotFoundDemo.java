package courses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundDemo {


    public static void main(String[] args) throws FileNotFoundException {
        /*
        * that is the type of exception
        * if the file not found
        * */
//        File file = new File("c://file.txt");
//        FileReader fr = new FileReader(file);
//        System.out.println("hello");
        /*
        * the second type of exception
        * if i select the index of array which is out of bound
        * */
        FileNotFoundDemo obj1 = new FileNotFoundDemo();
        obj1.TestArray();

    }
    public void TestArray()
    {

        try {
            int arr1 [] = {1,2,3,4,5,6};
            System.out.println("the value is "+arr1[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ex : " + e);
        }
        System.out.println("please enter number again ");
    }

}

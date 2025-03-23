package courses;

public class Arrays {
    //array is the group of continuous data
    public static void main(String[] args) {
        int [] arr;
        arr = new int[10];
        // to get the length of array
        System.out.println(arr.length);
        // second way to declare array
        int [] arr2 = new int[5];
        //third way to declare array and initialize the variable in the array
        int [] arr3 ={1,2,3,4,5,6,7,8,9,10};
        for (int i=0 ;i<arr3.length;i++)
        {
            System.out.println("the value of arr["+i+"]is "+arr3[i]);
        }

    }
}

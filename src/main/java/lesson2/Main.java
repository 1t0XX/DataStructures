import array.Array;
import array.ArrayImpl;

public class Main {





    public static void main(String[] args){


       Array<Integer> array = new ArrayImpl<>(5);
        //Array<Integer> array = new SortedArrayImpl<>();

        array.add(5);
        array.add(2);
        array.add(4);
        array.add(1);
        array.add(3);
        array.add(8);



        array.display();

        array.sortInsert();
        array.display();

       System.out.println("Remove 3 " + array.remove(Integer.valueOf(3)));
       System.out.println("Remove " + array.remove(Integer.valueOf(3333)));

        array.display();

        System.out.println("Find 1 " + array.indexOf(1));
        System.out.println("Find" + array.indexOf(111));



    }
}

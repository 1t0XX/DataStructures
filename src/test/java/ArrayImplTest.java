import array.ArrayImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;



public class ArrayImplTest {


    private ArrayImpl<Integer> array;


        @Before
    public void prepare(){
            array = new ArrayImpl<Integer>();
        }


        @Test

    public void testAdd() {
            array.add(1);
            array.add(2);
            array.add(3);

            Assert.assertArrayEquals(
                    new Integer[]{1, 2, 3},
                    array.getArray()
            );
        }


    @Test

    public void testRemove() {
        array.add(1);
        array.add(2);
        array.add(3);

        array.remove(Integer.valueOf(2));

        Assert.assertArrayEquals(
                new Integer[]{1,  3},
                array.getArray()
        );
    }


    @Test

    public void testSeach() {
        array.add(1);
        array.add(2);
        array.add(3);

        Assert.assertTrue(array.contains(2));
        Assert.assertFalse(array.contains(4));

        Assert.assertEquals(1, array.indexOf(2));
        Assert.assertEquals(-1, array.indexOf(222));
    }
}

import org.junit.*;

import static org.junit.Assert.*;

public class Trial1Test {

    static Trial1 obj = null;

    @Before
    public void setUp() throws Exception {
        obj = new Trial1();
    }

    @Test
    public void MyMethod(){

//        Trial1 obj = new Trial1();
//        int[] exp = {1,2,22,3,5};

        int[] ints = obj.Array();
        assertArrayEquals(new int[]{1,2,22,3,5}, ints);
    }

    @After
    public void tearDown(){
        obj = null;
    }

}
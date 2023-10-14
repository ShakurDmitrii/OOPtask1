package Tests;

import Programm.SetSh;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Tests {
        private SetSh myMethod;
        private SetSh myMethod1;

        @Before
        public void setUp() {
            myMethod = new SetSh(0, 10);
            myMethod1 = new SetSh(1, 5);
        }

        @Test
        public void test1(){
            boolean result = myMethod.check(5);
            assertEquals(true, result);
        }
        @Test
        public void test2() {
            List<Integer> result = myMethod.add(11);

            assertEquals(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11), result);
        }
    @Test
    public void test3(){
        List<Integer> result = myMethod.remove(5);
        assertEquals(List.of(0, 1, 2, 3, 4, 6, 7, 8, 9, 10), result);
    }
    @Test
    public void test4(){
        int result = myMethod.min();
        assertEquals(0, result);
    }

    @Test
    public void test5(){
        int result = myMethod.max();
        assertEquals(10, result);
    }
    @Test
    public void test6(){
        List<Integer> result = myMethod.sum(myMethod1);
        assertEquals(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5), result);
    }
    @Test
    public void test7(){
        List<Integer> result = myMethod.subtract(myMethod1);
        assertEquals(List.of( 0, 6, 7, 8, 9, 10), result);
    }

    @Test
    public void test8(){
        List<Integer> result = myMethod.getSet(0, 6);
        assertEquals(List.of( 0,1,2,3,4,5), result);
    }
}

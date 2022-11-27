package Calculator.Operations;

import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StatisticsTest {
    Statistics stats=new Statistics();
    double[] arr1={1,2,3,3};
    double[] arr2={1.1,2.6,6.7};
    double[] arr3={0};
    double[] arr4={-1,2,3,4,-54,5,-1};//-54 -1 -1 2 3 4 5
    double[] arr5={};

    double res;

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void findMean()
    {
        EmptyArrayException exception;

        res = stats.findMean(arr1);
        assertEquals(2.25, res, 0.01);

        res = stats.findMean(arr2);
        assertEquals(3.46666666667, res, 0.1);

        res = stats.findMean(arr3);
        assertEquals(0, res, 0.01);

        res = stats.findMean(arr4);
        assertEquals(-6.0, res, 0.01);


        exception  = assertThrows(EmptyArrayException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                res= stats.findMean(arr5);
            }
        });

        assertEquals("Array is empty.",exception.getMessage());
    }

    @Test
    public void findMedian()
    {
        EmptyArrayException exception;

        res= stats.findMedian(arr1);
        assertEquals(2.5, res, 0.01);

        res= stats.findMedian(arr2);
        assertEquals(2.6, res, 0.01);

        res= stats.findMedian(arr3);
        assertEquals(0, res, 0.01);

        res= stats.findMedian(arr4);
        assertEquals(2, res, 0.01);

        exception  = assertThrows(EmptyArrayException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                res= stats.findMedian(arr5);
            }
        });

        assertEquals("Array is empty.",exception.getMessage());
    }

    @Test
    public void findMode()
    {
        EmptyArrayException exception;

        res= stats.findMode(arr1);
        assertEquals(3, res, 0.01);

        res= stats.findMode(arr2);
        assertEquals(1.1, res, 0.01);

        res= stats.findMode(arr3);
        assertEquals(0, res, 0.01);

        res= stats.findMode(arr4);
        assertEquals(-1, res, 0.01);

        exception  = assertThrows(EmptyArrayException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                res= stats.findMode(arr5);
            }
        });

        assertEquals("Array is empty.",exception.getMessage());
    }
}

package Calculator.Operations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StatisticsTest {
    Statistics stats=new Statistics();
    double[] arr1={1,2,3,3};
    double[] arr2={1.1,2.6,6.7};
    double[] arr3={0};
    double[] arr4={-1,2,3,4,-54,5,-1};
    double[] arr5={};

    double res;

    @Test
    public void findMean()
    {
        res= stats.findMean(arr1);
        //System.out.println(res);
        assertEquals(2.25, res, 0.01);

        res= stats.findMean(arr2);
        assertEquals(3.46666666667, res, 0.1);

        res= stats.findMean(arr3);
        assertEquals(0, res, 0.01);

        res= stats.findMean(arr4);
        assertEquals(-6.0, res, 0.01);

        res= stats.findMean(arr5);
    }

    @Test
    public void findMedian()
    {
        res= stats.findMedian(arr1);
        assertEquals(2.5, res, 0.01);

        res= stats.findMedian(arr2);
        assertEquals(2.6, res, 0.01);

        res= stats.findMedian(arr3);
        assertEquals(0, res, 0.01);

        res= stats.findMedian(arr4);
        assertEquals(2.25, res, 0.01);

        res= stats.findMedian(arr5);
    }

    @Test
    public void findMode()
    {
        res= stats.findMode(arr1);
        assertEquals(3, res, 0.01);

        res= stats.findMode(arr2);
        assertEquals(1.1, res, 0.01);

        res= stats.findMode(arr3);
        assertEquals(0, res, 0.01);

        res= stats.findMode(arr4);
        assertEquals(-1, res, 0.01);

        res= stats.findMode(arr5);
    }
}

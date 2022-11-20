package Calculator.Operations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Statistics {
    public double findMean (double[] arr)
    {
        long count=0;
        double sum=0;
        for(double val:arr)
        {
            count++;
            sum+=val;
        }
        return sum/count;
    }

    public double findMedian (double[] arr)
    {
        Arrays.sort(arr);
        if(arr.length%2==1)
            return arr[arr.length/2];
        else
            return (arr[(arr.length/2)-1] + arr[arr.length/2])/2;
    }

    public double findMode (double[] arr)
    {
        long maxFreq=-1;
        double ans = 0;
        HashMap<Double, Long> countMap = new HashMap<>();
        for(double val:arr)
        {
            if(countMap.containsKey(val))
            {
                countMap.put(val,1L);
            }
            else
            {
                countMap.put(val,countMap.get(val)+1);
            }
        }
        Iterator hmIterator = countMap.entrySet().iterator();
        while (hmIterator.hasNext()) {

            HashMap.Entry mapElement = (HashMap.Entry)hmIterator.next();

            if(maxFreq < (Long)mapElement.getValue())
            {
                maxFreq = (Long)mapElement.getValue();
                ans = (Double)mapElement.getKey();
            }
        }
        return ans;
    }
}

package com.ruperttwind.algorithm.dp;

import com.ruperttwind.algorithm.dp.Kadane;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@Test
public class KadaneTest {

  @Test(dataProvider = "maxContiguousSumDataProvider")
  private static void getMaxContiguousSum(List<Integer> integerArrayList, Integer maxContiguousArraySum) {
    Assert.assertEquals(Kadane.getMaxContiguousSum(integerArrayList), maxContiguousArraySum);
  }

  @DataProvider(name = "maxContiguousSumDataProvider")
  private Object[][] maxContiguousSumDataProvider() {
    return new Object[][] {
        { Arrays.asList(new Integer(1), new Integer(1), new Integer(1)), new Integer(3) },
        { Arrays.asList(new Integer(1), new Integer(-1), new Integer(1)), new Integer(2) },
        { Arrays.asList(new Integer(1), new Integer(-10), new Integer(1)), new Integer(1) }
    };
  }
}

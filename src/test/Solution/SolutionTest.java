package test.Solution; 

import Solution.Solution;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Solution Tester. 
* 
* @author <Authors name> 
* @since <pre>Apr 9, 2016</pre> 
* @version 1.0 
*/ 
public class SolutionTest { 
Solution solution = new Solution();
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: containDupicate(int[] nums) 
* 
*/ 
    @Test
    public void testContainDupicate() throws Exception {
        int[] array = {1,2,4,2,5,6,2,4};
        Assert.assertTrue(solution.containDuplicate(array));
        int[] array2 = {2,3,4,5,6,7,8};
        Assert.assertFalse(solution.containDuplicate(array2));
}
    @Test
    public void testIsAnagram() throws Exception{
        String s = "qweqweqwe";
        String t = "wqewqewqe";
        Assert.assertTrue(solution.isAnagram(s,t));
        String a = "adfasd";
        String b = "aaaa";
        Assert.assertFalse((solution.isAnagram(a,b)));
    }
} 

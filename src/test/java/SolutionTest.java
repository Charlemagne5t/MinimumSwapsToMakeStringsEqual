import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        String s1 = "xy";
        String s2 = "yx";
        int expected = 2;
        int actual = new Solution().minimumSwap(s1, s2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        String s1 = "xx";
        String s2 = "yy";
        int expected = 1;
        int actual = new Solution().minimumSwap(s1, s2);

        Assert.assertEquals(expected, actual);
    }

}

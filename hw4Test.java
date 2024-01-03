import org.junit.*;

public class hw4Test{
    @Test
    public void testletterGrade(){

        Assert.assertEquals('A', hw4.letterGrade(95));
        Assert.assertEquals('B', hw4.letterGrade(85));
        Assert.assertEquals('C', hw4.letterGrade(75));
        Assert.assertEquals('D', hw4.letterGrade(65));
        Assert.assertEquals('F', hw4.letterGrade(55));
        Assert.assertEquals('X', hw4.letterGrade(105));
        Assert.assertEquals('X', hw4.letterGrade(-5));
    }

    @Test
    public void testTheBoundary(){
        Assert.assertEquals('A', hw4.letterGrade(90));
        Assert.assertEquals('A', hw4.letterGrade(100));
        Assert.assertEquals('B', hw4.letterGrade(80));
        Assert.assertEquals('B', hw4.letterGrade(89));
        Assert.assertEquals('C', hw4.letterGrade(70));
        Assert.assertEquals('C', hw4.letterGrade(79));
        Assert.assertEquals('D', hw4.letterGrade(60));
        Assert.assertEquals('D', hw4.letterGrade(69));
        Assert.assertEquals('F', hw4.letterGrade(0));
        Assert.assertEquals('X', hw4.letterGrade(-2));

    }
}
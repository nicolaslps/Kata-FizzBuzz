import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class FizzBuzzTest {

    protected FizzBuzz test;

    @Before
    public void setup(  ) {
        test = new FizzBuzz();
    }

    @Test
    public void AssertToBeMultipleOf3(){
        assertEquals(true, test.isMultiple3(3) );
    }

    @Test
    public void AssertToBeMultipleOf5(){
        assertEquals(true, test.isMultiple5(5) );
    }

    @Test
    public void AssertToBeMultipleOf3And5(){
        assertEquals(true, test.isMultiple3And5(15) );
    }
}

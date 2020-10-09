import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class FizzBuzzTest {
    //Vérifie que la méthode isMultiple3 retourne true pour 3
    @Test
    public void AssertToBeMultipleOf3(){
        assertTrue( FizzBuzz.isMultiple3(3) );
    }

    //Vérifie que la méthode isMultiple5 retourne true pour 3
    @Test
    public void AssertToBeMultipleOf5(){
        assertTrue( FizzBuzz.isMultiple5(5) );
    }

    //Vérifie que la méthode isMultiple3And5 retourne true pour 15
    @Test
    public void AssertToBeMultipleOf3And5(){
        assertTrue(FizzBuzz.isMultiple3And5(15) );
    }
}

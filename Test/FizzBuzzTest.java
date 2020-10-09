import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class FizzBuzzTest {

    protected FizzBuzz test;

    //Initialisation des choses qui seront répétées dans tous les tests
    @Before
    public void setup(  ) {
        test = new FizzBuzz();
    }

    //Vérifie que la méthode isMultiple3 retourne true pour 3
    @Test
    public void AssertToBeMultipleOf3(){
        assertEquals(true, test.isMultiple3(3) );
    }

    //Vérifie que la méthode isMultiple5 retourne true pour 3
    @Test
    public void AssertToBeMultipleOf5(){
        assertEquals(true, test.isMultiple5(5) );
    }

    //Vérifie que la méthode isMultiple3And5 retourne true pour 15
    @Test
    public void AssertToBeMultipleOf3And5(){
        assertEquals(true, test.isMultiple3And5(15) );
    }
}

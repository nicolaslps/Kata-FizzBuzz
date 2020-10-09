import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class FizzBuzzTest {

    static FizzBuzz fizzBuzz = new FizzBuzz();


    //Vérifie que la méthode isMultiple3 retourne true pour 3
    @Test
    public void AssertToBeMultipleOf3(){
        assertTrue( fizzBuzz.isMultiple3(3) );
    }

    //Vérifie que la méthode isMultiple5 retourne true pour 3
    @Test
    public void AssertToBeMultipleOf5(){
        assertTrue( fizzBuzz.isMultiple5(5) );
    }

    //Vérifie que la méthode isMultiple3And5 retourne true pour 15
    @Test
    public void AssertToBeMultipleOf3And5(){
        assertTrue(fizzBuzz.isMultiple3And5(15) );
    }

    //Affichage
    @Test
    public void TestAffichage(){
        fizzBuzz.Fizzbuzz();
    }
}

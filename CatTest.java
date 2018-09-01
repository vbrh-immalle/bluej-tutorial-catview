

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * test class CatTest - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class CatTest
{
    /**
     * Constructor voor test class CatTest
     */
    public CatTest()
    {
    }

    /**
     * Opzetten van de test fixture.
     *
     * Aanroep voor elke test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Verwijderen van de test fixture.
     *
     * Aanroep na elke test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testHappy()
    {
        Cat cat1 = new Cat();
        assertEquals(false, cat1.isHappy());
        cat1.feed();
        assertEquals(true, cat1.isHappy());
    }
}


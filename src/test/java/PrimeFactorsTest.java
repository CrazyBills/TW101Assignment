import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {

    PrimeFactors primeFactors;


    @Before
    public void initialize(){
        primeFactors = new PrimeFactors();
    }


    @Test
    public void testPrimeNull(){

        List<Integer> integers = primeFactors.primeFactors(1);
        assertEquals(0,integers.size());
    }

    @Test
    public void testPrime30(){
        List<Integer> integers = primeFactors.primeFactors(30);

        List<Integer> tCase = new ArrayList<>();
        tCase.add(2);
        tCase.add(3);
        tCase.add(5);

        assertArrayEquals(tCase.toArray(),integers.toArray());


    }



}
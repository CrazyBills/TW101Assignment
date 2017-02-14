import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class DiamondTest {

    Diamond diamond ;
    PrintStream console = null;
    ByteArrayOutputStream bytes = null;

    @Before
    public void initial(){
        diamond = new Diamond();
        bytes = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));
    }

    @After
    public void restore(){
        System.setOut(console);
    }


    @Test
    public void testIsolateTriangle(){
        diamond.isoscelesTriangle(3);
        assertEquals("  *\n ***\n*****\n",bytes.toString());
    }

    @Test
    public void testDiamond(){
        diamond.diamond(3);
        assertEquals("  *\n ***\n*****\n ***\n  *\n",bytes.toString());
    }

    @Test
    public void testDiamondWithNames(){
        diamond.diamondWithNames(3);
        assertEquals("  *\n ***\nBill\n ***\n  *\n",bytes.toString());
    }



}
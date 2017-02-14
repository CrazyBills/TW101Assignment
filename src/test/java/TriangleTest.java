import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    Triangle triangle;
    PrintStream console = null;
    ByteArrayOutputStream bytes = null;

    @Before
    public void initial(){
        triangle = new Triangle();
        bytes = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));
    }

    @After
    public void restore(){
        System.setOut(console);
    }


    @Test
    public void TestEasist(){
        triangle.easist();
        assertEquals("*\n",bytes.toString());
    }

    @Test
    public void Testhorizontal(){
        triangle.horizontal(8);
        assertEquals("********\n",bytes.toString());
    }



    @Test
    public void Testvertical(){
        triangle.vertical(8);
        assertEquals("*\n*\n*\n*\n*\n*\n*\n*\n",bytes.toString());
    }



    @Test
    public void TestRightTran(){
        triangle.righttriangle(3);
        assertEquals("*\n**\n***\n",bytes.toString());
    }


}
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    Triangle triangle;
    PrintStream console = null;          // 声明（为null）：输出流 (字符设备) console
    ByteArrayOutputStream bytes = null;  // 声明（为null）：bytes 用于缓存console 重定向过来的字符流

    @Before
    public void initial(){
        triangle = new Triangle();
        bytes = new ByteArrayOutputStream();    // 分配空间
        console = System.out;                   // 获取System.out 输出流的句柄
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
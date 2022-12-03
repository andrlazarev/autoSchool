import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber()
    {
        Assert.assertTrue("getLocalNumber возвращает число != 14", this.getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber()
    {
        Assert.assertTrue("getClassNumber вернул число <= 45", this.getClassNumber() > 45);
    }

    @Test
    public void testGetClassString()
    {
        Assert.assertTrue("Метод getClassString не возвращает строку с “hello” или “Hello”", this.getClassString().toLowerCase().contains("hello"));
    }
}

package j.m.w.iface;


import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Tests mocking a static method from an interface
 */
@PrepareForTest(MyInterface.class)
public class MyInterfaceTest extends PowerMockTestCase {

    @Test
    public void testTheStaticMethod() {
        PowerMockito.mockStatic(MyInterface.class);
        PowerMockito.when(MyInterface.returnSomething(null, null, null)).thenReturn(true);
        Assert.assertTrue(MyInterface.returnSomething(null, null, null));
    }
}

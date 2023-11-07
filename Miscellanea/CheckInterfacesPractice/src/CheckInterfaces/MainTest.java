package CheckInterfaces;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;





class MainTest {

    ChildClass2 childClass2 = new ChildClass2();

    /*this method only retrieves the directly implemented interfaces.
    Inheritance of the MasterInterface is not detected*/
    //List<Class<?>> interfaces = Arrays.asList(childClass2.getClass().getInterfaces());

    Set<Class<?>> interfaces = getAllExtendedOrImplementedInterfacesRecursively(ChildClass2.class);




    public static Set<Class<?>> getAllExtendedOrImplementedInterfacesRecursively(Class<?> clazz) {
        Set<Class<?>> res = new HashSet<Class<?>>();
        Class<?>[] interfaces = clazz.getInterfaces();

        if (interfaces.length > 0) {
            res.addAll(Arrays.asList(interfaces));

            for (Class<?> interfaze : interfaces) {
                res.addAll(getAllExtendedOrImplementedInterfacesRecursively(interfaze));
            }
        }

        return res;
    }

    /*This operator also works with interfaces:*/
    @Test
    public void CheckIsInstanceOf() {
        assertTrue(childClass2 instanceof MasterInterface);
    }

    /*This method returns true if the provided object implements the interface:*/
    @Test
    public void CheckIsInstace() {
        assertTrue(MasterInterface.class.isInstance(childClass2));
    }

    /*This method returns a true if the object inherits the specified interface,
     even if this isn’t a direct implementation*/
    @Test
    public void CheckIsAssignableFrom() {
        assertTrue(MasterInterface.class.isAssignableFrom(childClass2.getClass()));
    }

    @Test
    public void testInterfaces () {
        assertTrue(interfaces.contains(ChildInterface2.class));
        assertTrue(interfaces.contains(MasterInterface.class));
    }

    @Test
    public void testNumberOfInterfacesOnChildClass() {
        assertEquals(2, interfaces.size());
    }

    @Test
    public void testChildInterface2Implemented() {
        assertTrue(interfaces.contains(ChildInterface2.class));
    }

}
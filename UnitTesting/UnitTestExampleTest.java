import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)//import UnitTestExample;

public class UnitTestExampleTest {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { 
                 {"Discharge_Capacity":0.000, "Nominal_Capacity":0.000, "State_of_Health":0.000},
"Discharge_Capacity":0.025, "Nominal_Capacity":0.000, "State_of_Health":0.000 },
"Discharge_Capacity":0.000, "Nominal_Capacity":0.000, "State_of_Health":0.000 },
"Discharge_Capacity":0.000, "Nominal_Capacity":0.000, "State_of_Health":0.000 },
"Discharge_Capacity":-2031.26, "Nominal_Capacity":2031.258, "State_of_Health":-1 },
"Discharge_Capacity":0.000, "Nominal_Capacity":0.000, "State_of_Health":0.000 },
"Discharge_Capacity":2992.507, "Nominal_Capacity":0.000, "State_of_Health":0.000 },
"Discharge_Capacity":0.000, "Nominal_Capacity":0.000, "State_of_Health":0.000 },
"Discharge_Capacity":-962.034, "Nominal_Capacity":962.034, "State_of_Health":-1 },
"Discharge_Capacity":0.000, "Nominal_Capacity":0.000, "State_of_Health":0.000 }

           });
    }

    private int fx;
    private int fy;

    private String fExpected;

    public UnitTestExampleTest(int x, int y, String expected) {
        this.fx = x;
        this.fy = y;
        this.fExpected = expected;
    }

    @Test
    public void simpleFunctionTest() {
        String  retval = new UnitTestExample().simpleFunction(fx, fy);
        Assert.assertEquals(fExpected, retval);
    }
}
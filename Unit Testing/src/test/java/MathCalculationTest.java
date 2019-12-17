import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MathCalculationTest {

    private static MathCalculation mathCalculation;
    @Test
    @BeforeAll
    static  void Init(){
        mathCalculation = new MathCalculation();
    }

    @ParameterizedTest
    @Disabled
    @ValueSource(ints = {1,4,3})
    void sum(int result) {
        assertTrue(mathCalculation.sum(1,2) == result);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2,3" , "3,5,8"})
    public void sum1(int a,int b,int result){
        assertTrue(mathCalculation.sum(a,b) == result );
    }
}
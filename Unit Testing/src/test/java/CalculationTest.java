import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import sun.plugin2.message.AbstractSerializer;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CalculationTest {

    @Test
    void Init(){
        Operation operation = mock(Operation.class);
        Calculation calculation = new Calculation();
        calculation.serInterface(operation);

        when(operation.add(10 , 20)).thenReturn(30.0);
        when(operation.div(10,2)).thenReturn(5.0);
        doThrow(new ArithmeticException("Cannot div by 0")).when(operation).div(1,0);

        assertEquals(30.0 , calculation.ADD(10,20) );
        assertEquals(5.0, calculation.DIV(10,2));
        assertThrows(ArithmeticException.class , ()-> calculation.DIV(1,0));

        verify(operation).add(10,20);
        verify(operation,times(1)).div(10,2);
        verify(operation,never()).div(13,0);


    }




}
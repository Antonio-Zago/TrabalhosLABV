package br.edu.fatec.sjc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class StackTest {

    private CustomStack<Double> stack;
    
    private CustomStack<Number> stack2;
    
    private NumberAscOrder numberAscOrder;
    @Mock
    CalculableStrategy<Double> calculableStrategy;
    
    @Mock
    CalculableStrategy<Number> calculableStrategy2;

    @BeforeEach
    public void setup() {
        stack = new CustomStack<>(5, calculableStrategy);
    }

    @Test
    public void validatePushOneElementInStack() {
        Double elementValue = 5.0;
        Double value = 0.0;
        Mockito.when(
                calculableStrategy.calculateValue(Mockito.anyDouble())
        ).thenReturn(5.0);
        try {
            stack.push(elementValue);
            assertFalse(stack.isEmpty());
            assertEquals(elementValue, stack.top());
            assertEquals(1, stack.size());
            value = stack.pop();
        } catch(StackEmptyException | StackFullException ex) {
            fail();
        }
        assertEquals(elementValue, value);
        assertEquals(0.0, stack.size());
        Mockito.verify(calculableStrategy, Mockito.times(1))
                .calculateValue(Mockito.anyDouble());
    }

    @Test
    public void validatePushOneElementWithNullValueInStack() {
        Mockito.when(calculableStrategy.calculateValue(Mockito.isNull()))
                .thenThrow((NullPointerException.class));

        Assertions.assertThrows(NullPointerException.class, () -> stack.push(null));

        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());

        Mockito.verify(calculableStrategy, Mockito.times(1))
                .calculateValue(Mockito.isNull());
    }

    @Test
    public void validatePushTwoElementAndRemoveOneOfThenInStack() {
        Double secondElementValue = 10.0;
        Double value = 0.0;
        Mockito.when(
                calculableStrategy.calculateValue(Mockito.anyDouble())
        ).thenReturn(10.0);
        try {
            stack.push(5.0);
            stack.push(secondElementValue);
            assertFalse(stack.isEmpty());
            assertEquals(secondElementValue, stack.top());
            assertEquals(2, stack.size());
            value = stack.pop();
        } catch(StackEmptyException | StackFullException ex) {
            fail();
        }
        assertEquals(secondElementValue, value);
        assertEquals(1, stack.size());
    }

    @Test
    public void validatePushOneElementAndRemoveTwoElementsInStack() {
        Double secondElementValue = 10.0;
        Mockito.when(
                calculableStrategy.calculateValue(Mockito.anyDouble())
        ).thenReturn(10.0);
        try {
            stack.push(secondElementValue);
            stack.pop();
        } catch(StackEmptyException | StackFullException ex) {
            fail();
        }
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
        assertThrows(StackEmptyException.class, () -> {
            stack.pop();
        });
    }

    @Test
    public void validatePushTwoElementForStackWithLimitSizeEqualOne() {
        this.stack = new CustomStack<>(1, calculableStrategy);
        Mockito.when(
                calculableStrategy.calculateValue(Mockito.anyDouble())
        ).thenReturn(20.0);
        try {
            stack.push(5.0);
        } catch(StackFullException ex) {
            fail();
        }
        assertThrows(StackFullException.class, () -> {
            stack.push(10.0);
        });
    }
    
    @Test
    public void validate6ElementosAleatorios() {
        Double primeiroValor = 6.0;
        Double segundoValor = 5.0;
        Double terceiroValor = 10.0;
        Double quartoValor = 12.0;
        Double quintoValor = 1.0;
        Double sextoValor = 14.0;
        
        stack2 = new CustomStack<>(6, new CalculableStrategyImpl());
        
        try {
            stack2.push(primeiroValor);
            stack2.push(segundoValor);
            stack2.push(terceiroValor);
            stack2.push(quartoValor);
            stack2.push(quintoValor);
            stack2.push(sextoValor);
            
            numberAscOrder = new NumberAscOrder(stack2);
            
            var listaOrdenada = numberAscOrder.sort();
            
            for (int i = 0; i < listaOrdenada.size(); i++) {
    			System.out.println(listaOrdenada.get(i));
    		}

            assertEquals(quintoValor, listaOrdenada.get(0));
            assertEquals(segundoValor, listaOrdenada.get(1));
            assertEquals(terceiroValor, listaOrdenada.get(3));
            assertEquals(quartoValor, listaOrdenada.get(4));
            assertEquals(primeiroValor, listaOrdenada.get(2));
            assertEquals(sextoValor, listaOrdenada.get(5));

            
            
            
        } catch(StackEmptyException | StackFullException ex) {
            fail();
        }
    }
    
    @Test
    public void validate6PosicoesVazias() {
        
        stack2 = new CustomStack<>(6, new CalculableStrategyImpl());
        
        numberAscOrder = new NumberAscOrder(stack2);
        assertThrows(StackEmptyException.class, () -> {
        	numberAscOrder.sort(); 
        });
    }
}

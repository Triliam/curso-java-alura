package testesJUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void DeveriaSomarDoisNumerosInteiros(){
        Calculadora calc = new Calculadora();
        int soma = calc.Somar(3, 7);

        Assertions.assertEquals(10, soma);
    }
}

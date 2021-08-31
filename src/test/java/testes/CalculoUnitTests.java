package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import principal.Calculo;

public class CalculoUnitTests {

    @Test
    public void SomarTeste() {
        Calculo calculo = new Calculo();

        int resultado = calculo.Somar(10, 20);

        Assertions.assertEquals(30, resultado);
    }
}

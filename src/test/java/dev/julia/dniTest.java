package dev.julia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class dniTest {

    @Test
    public void testCalcularLetraValido() {
        dni dni1 = getDni1();
        assertEquals('Z', dni1.calcularLetra(), "La letra calculada no es correcta para el número 12345678.");

        dni dni2 = new dni(87654321);
        assertEquals('X', dni2.calcularLetra(), "La letra calculada no es correcta para el número 87654321.");

        dni dni3 = new dni(0);
        assertEquals('T', dni3.calcularLetra(), "La letra calculada no es correcta para el número 0.");

        dni dni4 = new dni(99999999);
        assertEquals('R', dni4.calcularLetra(), "La letra calculada no es correcta para el número 99999999.");
    }

    private dni getDni1() {
        dni dni1 = new dni(12345678);
        return dni1;
    }
}

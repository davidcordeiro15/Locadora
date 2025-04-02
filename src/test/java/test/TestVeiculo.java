package test;

import main.Veiculo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class TestVeiculo {

    @Test
    void testCalculaAluguel() {
        Veiculo vel = new Veiculo("Ferrari Enzo", 2002, "Ferrari", 2000.0);
        assertEquals(42000, vel.calculaAluguel(30, vel));
        assertEquals(32000, vel.calculaAluguel(20, vel));
    }

    @Test
    void testCalculaMulta() {
        Veiculo vel = new Veiculo("Ferrari Enzo", 2002, "Ferrari", 2000.0);
        assertEquals(21600, vel.calculaMulta(5, 10, vel));
    }


}

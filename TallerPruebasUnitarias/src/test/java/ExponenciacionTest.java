/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */

import junit.framework.TestCase;
import org.example.Calculadora;
import org.junit.jupiter.api.*;


/**
 *
 * @author garci
 */
public class ExponenciacionTest extends TestCase {
    
     private static Calculadora calculadora;

    
     @BeforeAll
    public static void setUpClass() {
        calculadora = new Calculadora();
    }

    @BeforeEach
    public void setUp() {
        // No se requiere inicialización adicional antes de cada prueba
    }
    @Test
    public void testExponenciacionPotenciaPositiva() {
        assertEquals(9.0, calculadora.exponenciacion(3.0, 2.0), 0.001);
    }

    @Test
    public void testExponenciacionBaseNegativaExponentePar() {
        assertEquals(4.0, calculadora.exponenciacion(-2.0, 2.0), 0.001);
    }

    @Test
    public void testExponenciacionBaseNegativaExponenteImpar() {
        assertEquals(-8.0, calculadora.exponenciacion(-2.0, 3.0), 0.001);
    }

    @Test
    public void testExponenciacionPotenciaDeCero() {
        assertEquals(1.0, calculadora.exponenciacion(5.0, 0.0), 0.001);
    }
    @AfterEach
    public void tearDown() {
        // No se requiere limpieza adicional después de cada prueba
    }

    @AfterAll
    public static void tearDownClass() {
      calculadora = null;
    }

}

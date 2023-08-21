/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
/**
 *
 * @author Kevin Magallanes
 */
public class PruebaDivicion {
    
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
    public void testDivisionBasica() {
        double resultado = calculadora.division(6, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void testDivisionEntreCero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.division(10, 0);
        });
    }

    @Test
    public void testDivisionNumeroNegativoPorPositivo() {
        double resultado = calculadora.division(-10, 2);
        assertEquals(-5, resultado);
    }

    @Test
    public void testDivisionCeroPorNumeroPositivo() {
        double resultado = calculadora.division(0, 5);
        assertEquals(0, resultado);
    }

    @Test
    public void testDivisionNumeroPositivoPorCero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.division(8, 0);
        });
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

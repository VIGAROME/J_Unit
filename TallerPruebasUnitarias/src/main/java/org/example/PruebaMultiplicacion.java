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
public class PruebaMultiplicacion {
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
    public void testMultiplicacion() {
        double resultado = calculadora.multiplicacion(6, 3);
        assertEquals(18, resultado);
        
        
        
    }

    @Test
    public void testMultiplicacionNumeroNegativoConPositivo() {
        double resultado = calculadora.multiplicacion(-2, 3);
        assertEquals(-6, resultado);
    }

    @Test
    public void testMultiplicacionDosNumerosNegativos() {
        double resultado = calculadora.multiplicacion(-2, -3);
        assertEquals(6, resultado);
    }

    @Test
    public void testMultiplicacionDosNumerosPositivos() {
        double resultado = calculadora.multiplicacion(2, 3);
        assertEquals(6, resultado);
    }

    @Test
    public void testMultiplicacionPorCero() {
        double resultado = calculadora.multiplicacion(0, 3);
        assertEquals(0, resultado);
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


import junit.framework.TestCase;
import org.example.Calculadora;
import org.junit.jupiter.api.*;

public class RadicacionTest {
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
    public void testRadicacionNumeroPositivo() {
        assertEquals(3.0, calculadora.radicacion(9.0, 2.0), 0.001);
    }

    @Test
    public void testRadicacionNumeroNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.radicacion(-9.0, 2.0);
        });
    }

    @Test
    public void testRadicacionEnesima() {
        assertEquals(2.0, calculadora.radicacion(8.0, 3.0), 0.001);
    }
    @AfterEach
    public void tearDown() {
        // No se requiere limpieza adicional después de cada prueba
    }

    @AfterAll
    public static void tearDownClass() {
        calculadora = null;
    }

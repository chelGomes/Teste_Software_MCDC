import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MCDCTest {
        private MCDC mcdc;

        @BeforeEach
        void setUp() {
            mcdc = new MCDC();
        }

        @Test
        void testT1() {
            mcdc.mcdc(1, 2, 1, 1);
            assertEquals(1, mcdc.getX(), "x deveria ser incrementado");
            assertNotEquals(0, mcdc.getY(), "y não deveria ser alterado");
        }

        @Test
        void testT2() {
            mcdc.mcdc(1, 2, 0, 1);
            assertEquals(0, mcdc.getX(), "x não deveria ser alterado");
            assertNotEquals(0, mcdc.getY(), "y não deveria ser alterado");
        }

        @Test
        void testT3() {
            mcdc.mcdc(-1, 2, 1, 1);
            assertEquals(0, mcdc.getX(), "x não deveria ser alterado");
            assertNotEquals(0, mcdc.getY(), "y não deveria ser alterado");
        }

        @Test
        void testT4() {
            mcdc.mcdc(0, 3, 0, 0);
            assertEquals(0, mcdc.getX(), "x não deveria ser alterado");
            assertEquals(0, mcdc.getY(), "y deveria ser zerado");
        }

        @Test
        void testT5() {
            mcdc.mcdc(0, 3, 0, 1);
            assertEquals(0, mcdc.getX(), "x não deveria ser alterado");
            assertEquals(0, mcdc.getY(), "y deveria ser zerado");
        }

        @Test
        void testT6() {
            mcdc.mcdc(0, 2, 0, -1);
            assertEquals(0, mcdc.getX(), "x não deveria ser alterado");
            assertEquals(0, mcdc.getY(), "y deveria ser zerado");
        }

        @Test
        void testT7() {
            mcdc.mcdc(0, 2, 0, 1);
            assertEquals(0, mcdc.getX(), "x não deveria ser alterado");
            assertNotEquals(0, mcdc.getY(), "y não deveria ser alterado");
        }
    }




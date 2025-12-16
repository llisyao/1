package testproject;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testSum() {
        assertThat(Calculator.sum(2, 2)).isEqualTo(4);
    }

    @Test
    public void testSubtract() {
        assertThat(Calculator.subtract(3,2)).isEqualTo(1);
    }

    @Test
    public void testSumEdgeCases() {
        assertThat(Calculator.sum(0, 0)).isEqualTo(0);
        assertThat(Calculator.sum(-5, 10)).isEqualTo(5);
        assertThat(Calculator.sum(100, -100)).isEqualTo(0);
    }

    @Test
    public void testSubtractEdgeCases() {
        assertThat(Calculator.subtract(0, 0)).isEqualTo(0);
        assertThat(Calculator.subtract(10, 20)).isEqualTo(-10);
        assertThat(Calculator.subtract(-5, -3)).isEqualTo(-2);
    }
}



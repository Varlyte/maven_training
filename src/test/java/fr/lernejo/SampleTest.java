package fr.lernejo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

class SampleTest {
    private static Sample test = new Sample();

    @Test
    void Addition_3_and_2(){
        int a = 3, b = 2;
        int result = test.op(Sample.Operation.ADD, a, b);
        assertThat(result).as("result of 2 + 3").isEqualTo(5);
    }

    @Test
    void multiplication_2_and_8(){
        int a = 2, b = 8;
        int result = test.op(Sample.Operation.MULT, a, b);
        assertThat(result).as("result of 2 * 8").isEqualTo(16);
    }

    @Test
    void facto(){
        int nul = 0, nega=-2, pos=6;
        nul = test.fact(nul);
        pos = test.fact(pos);
        assertThat(nul).as("factorielle de 0").isEqualTo(1);
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(()-> test.fact(nega));
        assertThat(pos).as("factorielle de 6").isEqualTo(720);
    }
}

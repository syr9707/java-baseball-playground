package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    public void split() {
        String[] values = "1".split(",");
        assertThat(values).contains("1");
        values = "1,2".split(",");
        assertThat(values).containsExactly("1", "2");
    }

    @Test
    public void substring() {
        String input = "(1,2)";
        String result = input.substring(1, input.length() - 1);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt() 테스트")
    public void charAtTest() {
        String value = "abc";

        assertThatThrownBy(() -> {
            value.charAt(value.length());
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 3");
    }
}

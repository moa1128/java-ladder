package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NamesTest {
    private Names names;

    @BeforeEach
    void setup() {
        names = new Names(Arrays.asList(new Name("jieun")));
    }

    @Test
    void 큰거_찾기() {
        assertThat(names.findMaxLength(10, 20)).isEqualTo(20);
    }

    @AfterEach
    void testDown() {
        names = null;
    }

}
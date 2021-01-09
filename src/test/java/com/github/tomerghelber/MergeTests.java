package com.github.tomerghelber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.tomerghelber.ast.*;

import org.junit.jupiter.api.Test;

class MergeTests {
    \**
     * Main: int a = 1; int b = a + 1;
     * A:    int a = 1; int b = a + 2;
     * B:    int c = 1; int b = c + 1;
     *\
    @Test
    void mergeEditLineAndRename() {
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        boolean ret = Basic.isRename(a, b);
        assertEquals(true, ret);
    }
}

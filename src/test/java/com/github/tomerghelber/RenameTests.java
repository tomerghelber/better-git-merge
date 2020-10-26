package com.github.tomerghelber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.tomerghelber.ast.*;

import org.junit.jupiter.api.Test;

class RenameTests {
    @Test
    void twoVariable() {
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        boolean ret = Basic.isRename(a, b);
        assertEquals(true, ret);
    }
}

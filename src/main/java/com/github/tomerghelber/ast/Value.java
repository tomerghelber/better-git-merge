package com.github.tomerghelber.ast;

import lombok.Data;

@Data
public class Value implements ASTNode {
    private final String value;
}

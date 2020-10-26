package com.github.tomerghelber.ast;

import lombok.Data;

@Data
public class Variable implements ASTNode {
    private final String identifier;
}

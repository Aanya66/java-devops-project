package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void shouldReturnCorrectMessage() {
        assertEquals(
            "Hello! My Java DevOps pipeline is working.",
            App.getMessage()
        );
    }
}

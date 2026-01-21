package com.io.management.service.impl;

import com.io.management.repository.TestRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TestServiceImplTest {

    @Mock
    private TestRepository testRepository;

    @InjectMocks
    private TestServiceImpl testService;

    @Test
    void greetings_shouldReturnHelloWorld() {
        // Act
        String result = testService.greetings();

        // Assert
        assertEquals("Hello world !", result);
    }
}
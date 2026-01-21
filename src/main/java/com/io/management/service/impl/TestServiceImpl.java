package com.io.management.service.impl;

import com.io.management.repository.TestRepository;
import com.io.management.service.TestService;
import org.springframework.stereotype.Service;

@Service
public record TestServiceImpl(
        TestRepository testRepository
) implements TestService {
    @Override
    public String greetings() {
        return "Hello world !";
    }
}

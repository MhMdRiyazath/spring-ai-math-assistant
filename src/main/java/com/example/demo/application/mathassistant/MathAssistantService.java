package com.example.demo.application.mathassistant;

import com.example.demo.infrastructure.springai.SpringAIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MathAssistantService {
    private final SpringAIClient springAIClient;

    public String getAnswer(String userMessage) {
        String prompt = "You are a helpful math assistant. Answer math questions clearly.\n\nUser: " + userMessage;
        return springAIClient.getChatCompletion(prompt);
    }
}

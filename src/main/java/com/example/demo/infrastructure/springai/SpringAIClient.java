package com.example.demo.infrastructure.springai;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class SpringAIClient {
    private final ChatModel chatModel;

    public String getChatCompletion(String prompt) {
        return ChatClient.create(chatModel)
                .prompt(prompt)
                .call()
                .content();
    }
}
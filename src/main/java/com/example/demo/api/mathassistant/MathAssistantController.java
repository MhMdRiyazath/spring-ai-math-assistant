package com.example.demo.api.mathassistant;

import com.example.demo.application.mathassistant.MathAssistantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
@RequiredArgsConstructor
public class MathAssistantController {
    private final MathAssistantService mathAssistantService;

    @PostMapping("/ask")
    public String ask(@RequestBody String question) {
        return mathAssistantService.getAnswer(question.trim());
    }
}

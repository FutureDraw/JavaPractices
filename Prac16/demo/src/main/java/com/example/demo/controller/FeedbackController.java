package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class FeedbackController {

    @RequestMapping
    public String showForm() {
        return "home";
    }

    @PostMapping
    public String handleFeedback(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("message") String message,
            Model model
    ) {
        try {
            System.out.println("\n\n\n\nПолучено сообщение обратной связи:");
            System.out.println("Имя: " + name);
            System.out.println("Email: " + email);
            System.out.println("Сообщение: " + message);

            String feedbackMessage = "Спасибо, " + name + "! Ваше сообщение отправлено.";
            model.addAttribute("feedback", feedbackMessage);

            model.addAttribute("showAlert", true);

            return "home";
        } catch (Exception e) {
            System.out.println("Ошибка при обработке формы: " + e.getMessage());
            model.addAttribute("error", "Произошла ошибка. Попробуйте снова.");
            return "home";
        }
    }

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e, Model model) {
        model.addAttribute("error", "Произошла ошибка: " + e.getMessage());
        return "home";
    }
}

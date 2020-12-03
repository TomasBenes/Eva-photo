package com.evaphoto.Controller;

import com.evaphoto.Model.Feedback;
import com.evaphoto.Service.FeedbackService;
import com.evaphoto.Service.ShoppingCartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private final ShoppingCartService shoppingCartService;
    private final FeedbackService feedbackService;

    public MainController(ShoppingCartService shoppingCartService, FeedbackService feedbackService) {
        this.shoppingCartService = shoppingCartService;
        this.feedbackService = feedbackService;
    }

    @GetMapping("/")
    public String mainPage () {
        return "index";
    }

    @GetMapping("/portfolio")
    public String portfolioPage () {
        return "portfolio";
    }

    @GetMapping("/kontakt")
    public String contactPage () {
        return "kontakt";
    }

    @GetMapping("/omne")
    public String personalPage () {
        return "o_mne";
    }

    @GetMapping("/cenik")
    public String pricePage () {
        return "cenik";
    }

    @GetMapping("/kosik")
    public String shoppingCartPage () {
        return "kosik";
    }

    @GetMapping("/feedback")
    public String feedbackPage(Model model) {
        model.addAttribute("feedbacks", this.feedbackService.getAllFeedbacks());
        return "feedback";
    }

    @PostMapping("/add-feedback")
    public String addFeedback (@ModelAttribute Feedback feedback) {
        this.feedbackService.add(feedback);
        return "redirect:/feedback";
    }
}

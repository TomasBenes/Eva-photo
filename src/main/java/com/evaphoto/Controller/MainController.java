package com.evaphoto.Controller;

import com.evaphoto.Service.ShoppingCartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private final ShoppingCartService shoppingCartService;

    public MainController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
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
}

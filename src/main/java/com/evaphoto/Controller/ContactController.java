package com.evaphoto.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ContactController {

    @Autowired
    private JavaMailSender mailSender;

    @GetMapping("/kontakt")
    public String contactPage () {
        return "kontakt";
    }

    @PostMapping("/kontakt")
    public String submitEmail (@RequestParam String name, @RequestParam String email, @RequestParam String subject, @RequestParam String content) {
        /*String name = request.getParameter("name");HttpServletRequest request
        String email = request.getParameter("email");
        String subject = request.getParameter("subject");
        String content = request.getParameter("content");*/
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("tominobenes@gmail.com");
        message.setTo("tomasbenes123@gmail.com");

        String mailSubject = name + "odeslal email";
        String mailContent = "Jmeno odesilatele: " + name + "\n";
        mailContent += "Email odesilatele: " + email + "\n";
        mailContent += "Predmet: " + subject + "\n";
        mailContent += "Obsah: " + content + "\n";

        message.setSubject(mailSubject);
        message.setText(mailContent);

        this.mailSender.send(message);

        return "kontaktMessage";
    }
}

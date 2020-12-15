package com.evaphoto.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

@Controller
public class ContactController {

    @Autowired
    private JavaMailSender mailSender;

    @GetMapping("/kontakt")
    public String contactPage () {
        return "kontakt";
    }

    @PostMapping("/kontakt")
    public String submitEmail (@RequestParam String name, @RequestParam String email, @RequestParam String subject, @RequestParam String content, @RequestParam String sourceOfCustomer,@RequestParam MultipartFile attachment) throws MessagingException, UnsupportedEncodingException {

        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        String mailSubject = name + "odeslal email";
        String mailContent = "<p><b>Jmeno odesilatele:</b> " + name + "</p>";
        mailContent += "<p><b>Email odesilatele:</b> " + email + "</p>";
        mailContent += "<p><b>Predmet:</b> " + subject + "</p>";
        mailContent += "<p><b>Zdroj zakaznika:</b> " + sourceOfCustomer + "</p>";
        mailContent += "<p><b>Obsah:</b> " + content + "</p>";

        helper.setFrom("tominobenes@gmail.com", "Eva photo");
        helper.setTo("tomasbenes123@gmail.com");
        helper.setSubject(mailSubject);
        helper.setText(mailContent, true);

        if (!attachment.isEmpty()) {
            String fileName = StringUtils.cleanPath(attachment.getOriginalFilename());

            InputStreamSource source = new InputStreamSource() {
                @Override
                public InputStream getInputStream() throws IOException {
                    return attachment.getInputStream();
                }
            };
            helper.addAttachment(fileName, source);
        }

        this.mailSender.send(message);

        return "kontaktMessage";
    }
}

package com.toby.spring.user.service;

import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class DumyMailSender implements MailSender {
    @Override
    public void send(SimpleMailMessage simpleMessage) throws MailException {
        System.out.println("DumyMailSender.send");
    }

    @Override
    public void send(SimpleMailMessage... simpleMessages) throws MailException {

    }
}

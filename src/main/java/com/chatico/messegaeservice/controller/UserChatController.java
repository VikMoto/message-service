package com.chatico.messegaeservice.controller;

import com.chatico.messegaeservice.domain.UserChat;
import com.chatico.messegaeservice.repositiry.UserChatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserChatController {
    private final UserChatRepository userChatRepository;

    @PostMapping
    public UserChat createUserChat(@RequestBody UserChat userChat) {
        return userChatRepository.save(userChat);
    }
}

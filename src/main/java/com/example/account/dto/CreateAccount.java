package com.example.account.dto;

import lombok.*;

import java.time.LocalDateTime;

public class CreateAccount {

    @Getter
    @Setter
    public static class  Request{
        private Long userID;
        private Long initialBalance;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class  Response{
        private Long userID;
        private String account;
        private LocalDateTime registeredAt;
    }
}

package com.example.account.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    USER_NOT_FOUND("사용자가 없습니다."),
    Max_ACCOUNT_PER_USER_10("사용자 최대 계좌는 10개입니다"),
    ACCOUNT_ALREADY_UNREGISTERED("계좌가 이미 해지되었습니"),
    BALANCE_NOT_EMPTY("잔액이 있는 계좌는 해지 할 수 없습니다"),
    USER_ACCOUNT_UN_MATCH("사용자와 계좌 소유주가 다릅니다.");

    private final String description;
}

package com.example.account.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    INTERNAL_SERVER_ERROR("내부 서버 오류."),
    INVALID_REQUEST("잘못된 요청 입니다."),
    USER_NOT_FOUND("사용자가 없습니다."),
    Max_ACCOUNT_PER_USER_10("사용자 최대 계좌는 10개입니다."),
    AMOUNT_EXCEED_BALANCE("거래 금액이 계좌 잔액보다 큽니다."),
    ACCOUNT_ALREADY_UNREGISTERED("계좌가 이미 해지되었습니."),
    BALANCE_NOT_EMPTY("잔액이 있는 계좌는 해지 할 수 없습니다."),
    ACCOUNT_NOT_FOUND("계좌를 찾을 수 없습니다."),
    TRANSACTION_NOT_FOUND("해당 거래가 없습니다."),
    USER_ACCOUNT_UN_MATCH("사용자와 계좌 소유주가 다릅니다."),
    CANCEL_MUST_FULLY("부분 취소는 허용되지 않습니다."),
    TOO_OLD_ORDER_TO_CANCEL("너무 오래된 거래내역 입니다(1년 이상)."),
    TRANSACTION_ACCOUNT_UN_MATCH("이 거래는 해당 계좌에서 발생한 거래가 아닙니다.");

    private final String description;
}

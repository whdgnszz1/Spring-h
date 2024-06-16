package com.example.spring.dto;
/***************************************************
 * Copyright(c) 2021-2023 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * Jonghun Hong                   6/16/24
 *
 ****************************************************/


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author : Jonghun Hong
 * @Project : Spring-h
 * @FileName : ResponseMessage
 * @Date : 6/16/24
 * @description :
 */

@Data
@SuperBuilder
@NoArgsConstructor
public class ResponseMessage {
    private Object data;

    private int statusCode;

    private String resultMessage;

    private String detailMessage;
}
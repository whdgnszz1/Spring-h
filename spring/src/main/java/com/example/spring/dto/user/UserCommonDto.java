package com.example.spring.dto.user;
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


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Jonghun Hong
 * @Project : Spring-h
 * @FileName : UserCommonDto
 * @Date : 6/16/24
 * @description :
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCommonDto {
    private String email;
    private String password;
}

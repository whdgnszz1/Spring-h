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


import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author : Jonghun Hong
 * @Project : Spring-h
 * @FileName : CreateUserRequestDto
 * @Date : 6/16/24
 * @description :
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class CreateUserRequestDto extends UserCommonDto {
}

package com.example.spring.user;
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


import com.example.spring.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Jonghun Hong
 * @Project : Spring-h
 * @FileName : UserRepository
 * @Date : 6/16/24
 * @description :
 */

public interface UserRepository extends JpaRepository<User, Long> {
}
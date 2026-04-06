package com.sysAppEstudo.easyEstoque.controller;

import org.springframework.beans.factory.annotation.Value;

public class FunRestController {
    
    @Value("${coach.name}")
    private String coachName;
}

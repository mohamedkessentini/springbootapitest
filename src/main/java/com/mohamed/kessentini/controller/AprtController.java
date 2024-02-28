package com.mohamed.kessentini.controller;

import com.mohamed.kessentini.services.AprtService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class AprtController {
    private final AprtService aprtService;

    public AprtController(AprtService aprtService) {
        this.aprtService = aprtService;
    }
    @GetMapping ("get")
    List<Map<String, Object>> getAprt(){
        return aprtService.firstService("9913027","I");
    }
}

package com.rogers.ivril.caller.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping(value = "/ivril-caller-ms")
public class GetCallerHistoryController {

    @GetMapping("/getCallerHistory/test")
    ResponseEntity<String> getCallHistoryTest() {
        return new ResponseEntity<>("Success", null, HttpStatus.OK);
    }

}

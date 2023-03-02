package com.rogers.ivril.caller.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static com.rogers.ivril.common.constants.DataConstants.HeadersDetails.*;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.asyncDispatch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GetCallerHistoryController.class)
@ContextConfiguration(classes = {GetCallerHistoryController.class})
public class GetCallerHistoryControllerTest {
    @Autowired
    MockMvc mockMvc;


    @InjectMocks
    GetCallerHistoryController getCallerHistoryController;

    @BeforeEach
    public void setup() {

        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(getCallerHistoryController).build();
    }
    @Test
    void getCallerHistoryControllerTest() throws Exception {

        this.mockMvc.perform(get("/ivril-caller-ms/getCallerHistory/test/")).andExpect(status().isOk());

    }
}


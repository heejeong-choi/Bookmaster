package com.jpa.bookmaster.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest
class ExampleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void example() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/example"))
                .andDo(print())
                .andExpect(content().string("example"));
    }
}
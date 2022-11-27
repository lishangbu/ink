package io.github.lishangbu.ink.auth.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.lishangbu.ink.auth.entity.Account;
import io.github.lishangbu.ink.auth.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * 账户控制器
 *
 * @author lishangbu
 * @date 2022/11/26
 */
@WebMvcTest(AccountController.class)
public class AccountControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private AccountService accountService;

    @Test
    public void createAccount() throws Exception {
        Account account = new Account();
        account.setUsername("test");
        account.setPassword("test");
        this.mockMvc.perform(post("/account").content(objectMapper.writeValueAsString(account))
                        .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("{\"code\":200,\"message\":\"Success\",\"data\":null}")));

        // 验证方法执行过一次
        verify(accountService, times(1)).save(account);
    }
}

package org.zerock.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import orz.zerock.jdbcex.dto.TodoDTO;
import orz.zerock.jdbcex.service.TodoService;

import java.time.LocalDate;

/**
 * Created by sskim
 */
@Log4j2
public class TodoServiceTests {

    private TodoService todoService;

    @BeforeEach
    public void ready() {
        todoService = TodoService.INSTANCE;
    }

    @Test
    void testRegister() throws Exception {
        TodoDTO todoDTO = TodoDTO.builder()
                .title("JDBC Test Title")
                .dueDate(LocalDate.now())
                .build();

        log.info("=======================");
        log.info(todoDTO);
        todoService.register(todoDTO);
    }
}

package org.zerock.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import orz.zerock.jdbcex.dao.TodoDAO;
import orz.zerock.jdbcex.domain.TodoVO;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by sskim
 */
class TodoDAOTest {

    private TodoDAO todoDAO;

    @BeforeEach
    public void ready() {
        todoDAO = new TodoDAO();
    }

    @Test
    void testTime() throws Exception {
        System.out.println(todoDAO.getTime());
    }

    @Test
    void testInsert() throws Exception {
        TodoVO todoVO = TodoVO.builder()
                .title("Sample Title...")
                .dueDate(LocalDate.of(2022, 9, 10))
                .build();
        todoDAO.insert(todoVO);

    }

    @Test
    void testList() throws Exception {
        List<TodoVO> list = todoDAO.selectAll();
        list.forEach(System.out::println);

    }

    @Test
    void testSelectOne() throws Exception {
        Long tno = 1L;
        TodoVO vo = todoDAO.selectOne(tno);
        System.out.println("vo = " + vo);
    }

    @Test
    void testUpdateOne() throws Exception {
        TodoVO todoVO = TodoVO.builder()
                .tno(1L)
                .title("Sample Title...")
                .dueDate(LocalDate.of(2022, 9, 10))
                .finished(true)
                .build();

        todoDAO.updateOne(todoVO);
    }
}
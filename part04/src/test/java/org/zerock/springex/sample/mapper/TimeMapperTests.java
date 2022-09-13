package org.zerock.springex.sample.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.springex.mapper.TimeMapper;
import org.zerock.springex.mapper.TimeMapper2;

/**
 * Created by sskim
 */
@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TimeMapperTests {

    @Autowired(required = false)
    private TimeMapper timeMapper;
    
    @Autowired(required = false)
    private TimeMapper2 timeMapper2;
    
    @Test
    void testGetTime() throws Exception {
        log.info("timeMapper.getTime() = {}", timeMapper.getTime());
    }
    
    @Test
    void testNow() throws Exception {
        log.info("timeMapper2.getNow() = {}", timeMapper2.getNow());
    }
    
}

package org.zerock.springex.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * Created by sskim
 */
public interface TimeMapper {

    @Select("SELECT now()")
    String getTime();
}

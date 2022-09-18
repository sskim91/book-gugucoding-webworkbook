package org.zerock.b01.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by sskim
 */
@Data
public class BoardListReplyCountDTO {

    private Long bno;

    private String title;

    private String writer;

    private LocalDateTime regDate;

    private Long replyCount;

}
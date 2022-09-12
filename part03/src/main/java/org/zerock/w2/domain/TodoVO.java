package org.zerock.w2.domain;

import lombok.*;

import java.time.LocalDate;

/**
 * Created by sskim
 */
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TodoVO {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
}

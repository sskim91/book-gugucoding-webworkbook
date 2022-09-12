package org.zerock.w2.domain;

import lombok.*;

/**
 * Created by sskim
 */
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {

    private String mid;
    private String mpw;
    private String mname;
    private String uuid;
}

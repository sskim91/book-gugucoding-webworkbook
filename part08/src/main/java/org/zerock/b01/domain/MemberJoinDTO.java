package org.zerock.b01.domain;

import lombok.Data;

/**
 * Created by sskim
 */
@Data
public class MemberJoinDTO {

    private String mid;
    private String mpw;
    private String email;
    private boolean del;
    private boolean social;

}
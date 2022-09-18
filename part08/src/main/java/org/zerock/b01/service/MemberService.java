package org.zerock.b01.service;

import org.zerock.b01.domain.MemberJoinDTO;

/**
 * Created by sskim
 */
public interface MemberService {

    static class MidExistException extends Exception {

    }

    void join(MemberJoinDTO memberJoinDTO) throws MidExistException;

}

package com.fast.campus.simplesns.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AlarmType {
    NEW_COMMENT_ON_POST("새로운 댓글이 달렸어요!"),
    NEW_LIKE_ON_POST("게시글에 좋아요가 달렸어요!"),
    ;

    private final String alarmText;
}

package com.sparta.memo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class) // 이걸 달아줘야지 자동으로 시간을 넣어주는 기능이 실행된다
public abstract class Timestamped {

    @CreatedDate
    @Column(updatable = false) // 최초로 만든 시간만 필요하기 때문에 업데이트를 막아줘야 한다.
    @Temporal(TemporalType.TIMESTAMP) // 날짜 데이터를 맵핑할 때 사용
    private LocalDateTime createdAt;

    @LastModifiedDate // 마지막 변경한 시간으로 업데이트 해준다.
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime modifiedAt;

//    DATE : 2023-01-01  시간 타입
//    TIME : 20:21:14
//    TIMESTAMP : 2023-01-01 20:21:14.9993939
}
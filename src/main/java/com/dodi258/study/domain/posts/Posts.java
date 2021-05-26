package com.dodi258.study.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}

/**
 * @NoArgsConstructor: 기본 생성자 자동 추가
 * @Entity: 테이블과 링크될 클래스임을 나타냄.
 * @Id : PK 필드
 * @GeneratedValue : PK 생성 규칙
 * @Column : 굳이 선언 필요없음. 해당 클래스의 필드는 모두 칼럼이 됨. (속성들에 제약을 두고 싶을 때 사용)
 *
 * Entity 클래스 에서는 절대 Setter 메소드를 만들지 않습니다!
 **/
package chapter15.boardApp.entity;

import lombok.Data;

/*
 * 2번째
 *  Board 게시판
 *  - id: 게시판 고육 번호
 *  - title: 게시판 제목
 *  - countent: 게시판 내용
 *  - author: 게시판 작성자
 * 
 * 
 */

@Data
public class Board {
	private long id;
	private String title;
	private String content;
	private String author;
	
	public Board(String title, String content, String author) {
		this.title = title;
		this.content = content;
		this.author = author;
	}
}

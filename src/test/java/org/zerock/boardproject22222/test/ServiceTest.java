package org.zerock.boardproject22222.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.boardproject22222.dto.BoardDTO;
import org.zerock.boardproject22222.service.BoardService;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class ServiceTest {

	@Autowired
	private BoardService boardService;

	@Test
	public void registService() {

		BoardDTO boardDTO = BoardDTO.builder()
		.title("title")
		.content("content")
		.writer("yk")
		.build();

		boardService.registBoard(boardDTO);

		log.info(boardDTO);


	}


	
	
}

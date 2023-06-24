package org.zerock.boardproject22222.test;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.boardproject22222.dto.BoardDTO;
import org.zerock.boardproject22222.mappers.BoardMapper;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class BoardTest {

	
	@Autowired(required = false)
	private BoardMapper boardMapper;

	@Test
	public void getList(){
		
		List<BoardDTO> list = boardMapper.getList();

		log.info(list);


	}
	
}

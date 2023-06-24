package org.zerock.boardproject22222.mappers;

import java.util.List;

import org.zerock.boardproject22222.dto.BoardDTO;

public interface BoardMapper {
	
	// list
	List<BoardDTO> getList();

	// regist
	int regist(BoardDTO boardDTO);

	// read
	BoardDTO read(int bno);

	



}

package org.zerock.boardproject22222.service;

import java.util.List;

import javax.swing.border.Border;

import org.springframework.transaction.annotation.Transactional;
import org.zerock.boardproject22222.dto.BoardDTO;

@Transactional
public interface BoardService {


	// 목록
	public List<BoardDTO> getList(BoardDTO boardDTO);

	// 등록
	public int registBoard(BoardDTO boardDTO);



	
}

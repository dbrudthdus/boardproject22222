package org.zerock.boardproject22222.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.boardproject22222.dto.BoardDTO;
import org.zerock.boardproject22222.mappers.BoardMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private final BoardMapper boardMapper;

	// 목록
	@Override
	public List<BoardDTO> getList(BoardDTO boardDTO) {
		throw new UnsupportedOperationException("Unimplemented method 'getList'");
	}

	// 등록
	@Override
	public int registBoard(BoardDTO boardDTO) {

		return boardMapper.regist(boardDTO);
	
	}


	
}

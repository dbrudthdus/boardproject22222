package org.zerock.boardproject22222.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.boardproject22222.dto.BoardDTO;
import org.zerock.boardproject22222.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Controller
@Log4j2
@RequestMapping("/board/")
@RequiredArgsConstructor
public class BoardController {

	private final BoardService boardService;


	// 목록
	@GetMapping("list")
	public void list(BoardDTO boardDTO){
		
		log.info("list........");

	}
	
	// 등록
	@GetMapping("regist")
	public void regist(){

		log.info("regist..........");
	}

	// 등록 뿌려
	@PostMapping("regist")
	public String registBoard(BoardDTO boardDTO){
		boardService.registBoard(boardDTO);

		return "redirect:/board/list";
	}

	// 조회
	@GetMapping("read")
	public void read(){

		log.info("read.............");



	}
}

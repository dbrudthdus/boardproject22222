package org.zerock.boardproject22222.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BoardDTO {
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private String dueDate;
	private String updatdDate;
	
}

package com.samsung.biz.board;

import javax.naming.directory.SearchControls;

import com.samsung.biz.board.impl.BoardDAO;
import com.samsung.biz.board.vo.BoardVO;

public class GetBoardListTest {
	public static void main(String[] args) {
		String searchCondition = "TITLE";
		BoardVO vo= new BoardVO();
		vo.setSearchCondition(searchCondition);
		BoardDAO dao = new BoardDAO();
		System.out.println(dao.getBoardList(vo));
	}
}

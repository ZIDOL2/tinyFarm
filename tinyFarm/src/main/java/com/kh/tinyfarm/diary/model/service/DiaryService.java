package com.kh.tinyfarm.diary.model.service;

import java.util.ArrayList;
import java.util.Date;

import com.kh.tinyfarm.board.vo.Board;
import com.kh.tinyfarm.board.vo.BoardReply;
import com.kh.tinyfarm.common.model.vo.PageInfo;
import com.kh.tinyfarm.diary.model.vo.Diary;
import com.kh.tinyfarm.member.model.vo.Follow;
import com.kh.tinyfarm.member.model.vo.Member;



public interface DiaryService {

	int updateMember(Member m);

	int updatePwd(Member m);

	int deleteMember(String userId);

	int boardListCount(String userId);

	int replyListCount(String userId);
	
	int fwingListCount(String userId);

	int fwerListCount(String userId);

	ArrayList<Board> myBoardList(String userId, PageInfo bPi);

	ArrayList<BoardReply> myReplyList(String userId, PageInfo rPi);

	ArrayList<Follow> myFollowingList(String userId, PageInfo fiPi);

	ArrayList<Member> myFollowerList(String userId, PageInfo fwPi);

	int insertDiary(Diary d);

	ArrayList<Diary> selectDiaryList(int userNo);




}

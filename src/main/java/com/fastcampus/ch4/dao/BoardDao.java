package com.fastcampus.ch4.dao;

import com.fastcampus.ch4.domain.*;

import java.util.*;

public interface BoardDao {
   public abstract BoardDto select(Integer bno) throws Exception;
   public abstract int delete(Integer bno, String writer) throws Exception;
   public abstract int insert(BoardDto dto) throws Exception;
   public abstract int update(BoardDto dto) throws Exception;
   public abstract int increaseViewCnt(Integer bno) throws Exception;

   public abstract List<BoardDto> selectPage(Map map) throws Exception;
   public abstract List<BoardDto> selectAll() throws Exception;
   public abstract int deleteAll() throws Exception;
   public abstract int count() throws Exception;

// public abstract int searchResultCnt(SearchCondition sc) throws Exception;
// public abstract List<BoardDto> searchSelectPage(SearchCondition sc) throws Exception;
}
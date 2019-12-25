package com.yh.dao;

import java.util.List;

import com.yh.domain.Complain;
import com.yh.vo.ComplainVO;

public interface ComplainMapper {
	
	int insert(Complain complain);
	
	//查询举报
	List<Complain> selects(ComplainVO complainVO);

}

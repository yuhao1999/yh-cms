package com.yh.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yh.domain.Complain;
import com.yh.vo.ComplainVO;

public interface ComplainService {
	//举报
	boolean insert(Complain complain);
	
	//查询举报
		PageInfo<Complain> selects(ComplainVO complainVO,Integer page,Integer pageSize);
}

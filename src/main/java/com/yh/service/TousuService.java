package com.yh.service;

import java.util.List;

import javax.validation.Valid;

import com.github.pagehelper.PageInfo;
import com.yh.domain.Tousubiao;
import com.yh.vo.ComplainVO;

/**
 * @于浩
 */
public interface TousuService {
  
	//投诉列表
	PageInfo<Tousubiao> list(int pageNum,ComplainVO vo);
	//详情列表
	List<Tousubiao> xiangqing();
	void tousu(@Valid Tousubiao tousubiao);
}

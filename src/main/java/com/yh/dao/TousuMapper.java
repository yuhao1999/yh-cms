package com.yh.dao;

import java.util.List;

import javax.validation.Valid;

import com.yh.domain.Tousubiao;
import com.yh.vo.ComplainVO;

/**
 * @于浩
 */
public interface TousuMapper {

	//投诉列表
	List<Tousubiao> list(ComplainVO vo);
	//详情
	List<Tousubiao> xiangqing();
	void tousu(@Valid Tousubiao tousubiao);
}

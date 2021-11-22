package com.coherent.unnamed.logic.service;

import java.sql.Date;
import java.util.List;

import com.coherent.unnamed.logic.dto.LogicTransctionDTO;
import com.coherent.unnamed.logic.response.BaseResponse;

public interface LogicService {

	String saveLogic(LogicTransctionDTO logicTransaction);

	List<LogicTransctionDTO> getAllLogic();

	BaseResponse listbydaysbymonth(int year, int month);


	BaseResponse verifylocation(Double lngt, Double lat) throws Exception;

	BaseResponse logsbydate(Date date,int user_id);


	BaseResponse registerattendance(Double lngt, Double lat, int punch);

	//BaseResponse hoursandpresent(Date date);

	void calculatehours();

    BaseResponse systemlogout();
}

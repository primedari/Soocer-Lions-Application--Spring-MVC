package com.kgm.controller;

import java.io.PrintWriter;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.StyledEditorKit.ItalicAction;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.kgm.bean.ScheduleMatch;
import com.kgm.service.imp.ScheduleServiceImp;

/*Schedule Controller Class*/
@SuppressWarnings({ "deprecation", "unused" })
public class ScheduleController extends SimpleFormController{
	private ScheduleServiceImp scheduleService;
	
	public void setScheduleService(ScheduleServiceImp scheduleService) {
		this.scheduleService = scheduleService;
	}

	public ScheduleController() {
		setCommandClass(ScheduleMatch.class);
		setCommandName("ScheduleMatch");
	}

	@SuppressWarnings("unchecked")
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		ModelAndView mv = new ModelAndView();
		PrintWriter out = response.getWriter();
		System.out.println("......come to scheduler controller...");
		String ret_value="";
		ScheduleMatch sm=(ScheduleMatch)command;
		if(sm.getOperation()!=null){
			if(sm.getOperation().equals("add"))
			{
				boolean result=scheduleService.addSchedule(sm);
				System.out.println("...........result........"+result);
				if(result==true){
				ret_value="scheduleaddsuccess";
				}else{
					ret_value="scheduleaddfail";
				}
			}
			if(sm.getOperation().equals("edit"))
			{
				boolean result=scheduleService.updateById(sm);
				System.out.println("...........result........"+result);
				if(result==true){
				ret_value="schedulEditSuccess";
				}else{
					ret_value="schedulEditfail";
				}
			}if(sm.getOperation().equals("delete"))
			{
				boolean result=scheduleService.deleteById(sm.getScheduleId());
				System.out.println("...........result........"+result);
				if(result==true){
				ret_value="schedulDeleteSuccess";
				}else{
					ret_value="schedulDeleteFail";
				}
			}
			if(sm.getOperation().equals("fetch"))
			{
				List<ScheduleMatch> result=scheduleService.getAllData();
				System.out.println("...........result........"+result);
				JSONObject obj = new JSONObject();
				JSONArray array= new JSONArray();
				for(ScheduleMatch match:result){
					obj = new JSONObject();
					obj.put("scheduleBetween", match.getScheduleBetween());
					obj.put("date", match.getDate());
					obj.put("place", match.getPlace());
					obj.put("price", match.getPrice());
					array.add(obj);
					
				}
				System.out.println(array.toJSONString());
				ret_value=array.toJSONString();
			}
		}
		out.write(ret_value);
		return null;
	}
}

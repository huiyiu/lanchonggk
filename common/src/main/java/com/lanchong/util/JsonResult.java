package com.lanchong.util;

import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonResult<T> {
	private boolean success;
	private String resultMsg;
	private String errCode;
	private Map<String, Object> map = null;
	
	private int page;
	private int pageSize;
	private int pageCount;
	private long totalCount;
	private List<T> list;
	private List<Integer> pageList;
	
	public JsonResult(){
		map = new HashMap<String, Object>();
		setSuccess(true);
		setResultMsg(null);
		
	}
	public JsonResult(boolean success, String resultlMsg){
		map = new HashMap<String, Object>();
		setSuccess(success);
		setResultMsg(resultlMsg);
	}
	public JsonResult(boolean success, String resultlMsg, String errCode){
		map = new HashMap<String, Object>();
		setSuccess(success);
		setResultMsg(resultlMsg);
		setErrCode(errCode);
	}
	/**
	 * 根据返回结果获取默认的返回显示信息
	 * @param result
	 * @return
	 */
	public static String getDefaultMsg(Boolean result){
		return result == true?"操作成功！":"操作失败！";
	}
	
	public void setSuccess(boolean success) {
		this.success = success;
		map.put("success", success);
	}
	public boolean isSuccess() {
		return success;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
		map.put("resultMsg", resultMsg);
	}
	public void setErrCode(String errCode) {
		this.errCode = errCode;
		map.put("errCode", errCode);
	}
	public String getErrCode() {
		return errCode;
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
		map.put("page", page);
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		map.put("pageSize", pageSize);
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
		map.put("pageCount", pageCount);
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
		map.put("list", list);
	}
	public List<Integer> getPageList() {
		return pageList;
	}
	public void setPageList(List<Integer> pageList) {
		this.pageList = pageList;
		map.put("pageList", pageList);
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
		map.put("totalCount", totalCount);
	}
	public long getTotalCount() {
		return totalCount;
	}
	public <T> T attr(String key, T value){
		String notSet = ",success,resultMsg,errCode,page,pageSize,pageCount,list,pageList,totalCount,";
		if(notSet.indexOf(","+key+",")>=0)return null;
		map.put(key, value);
		return value;
	}


	public String toJson(String pattern){
		return toJson(pattern,true);
	}
	public String toJson(String pattern, boolean enableSecurity){
		if(enableSecurity)map = mask(map);
		return new GsonBuilder().setDateFormat(pattern).create().toJson(map);
	}
	public String toJson(){
		return toJson(true);
	}
	public String toJson(boolean enableSecurity){
//		if(enableSecurity)map = mask(map);
//		return new Gson().toJson(map);
		return toJson("yyyy-MM-dd HH:mm:ss", enableSecurity);
	}
	public Map<String, Object> asMap(){
		return map;
	}
	public Map<String, Object> mask(Map<String, Object> m){
		
		return m;
	}
	
	public void adMap(Map<String, ?> m){
		for ( Map.Entry< String, ?> entry : m.entrySet() ) {
			map.put(entry.getKey(),entry.getValue());
		}

	}
}
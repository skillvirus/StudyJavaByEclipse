package com.koreait.controller;

/*
 * 데이터베이스로 전달할 정보를 묶어주는 역할
 */
public class DataPack {

	private Object code;
	private Object value;
	private Object type;

	public DataPack(Object code, Object value) {
		this.code = code;
		this.value = value;
	}
	
	public DataPack(Object code, Object value, Object type) {
		this.code = code;
		this.value = value;
		this.type = type;
	}

	public Object getCode() {
		return code;
	}

	public void setCode(Object code) {
		this.code = code;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	public Object getType() {
		return type;
	}

	public void setType(Object type) {
		this.type = type;
	}
}
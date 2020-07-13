package com.example.demo.vo;


/**
 * HTTP结果封装
 */
public class HttpResult {

	private int code = 200;
	private String msg;
	private Object data;

	public static HttpResult error() {
		return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
	}

	public static HttpResult error(String msg) {
		return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
	}

	public static HttpResult error(int code, String msg) {
		return new HttpResult().setCode(code).setMsg(msg);
	}

	public static HttpResult ok(String msg) {
		return new HttpResult().setMsg(msg);
	}

	public static HttpResult ok(Object data) {
		return new HttpResult().setData(data);
	}

	public static HttpResult ok() {
		return new HttpResult();
	}

	public int getCode() {
		return code;
	}

	public HttpResult setCode(int code) {
		this.code = code;
		return this;
	}

	public String getMsg() {
		return msg;
	}

	public HttpResult setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public Object getData() {
		return data;
	}

	public HttpResult setData(Object data) {
		this.data = data;
		return this;
	}

}

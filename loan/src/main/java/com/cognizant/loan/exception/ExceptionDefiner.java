package com.cognizant.loan.exception;

import java.time.LocalDateTime;

public class ExceptionDefiner {
		LocalDateTime localDateTime;
		String msg;
		Integer status;
		
		public LocalDateTime getLocalDateTime() {
			return localDateTime;
		}
		public void setLocalDateTime(LocalDateTime localDateTime) {
			this.localDateTime = localDateTime;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
}

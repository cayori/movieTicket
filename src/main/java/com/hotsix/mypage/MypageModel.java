package com.hotsix.mypage;

import java.util.Date;
/**
 * 예매내역 리스트를 받아올 데이터 모델
 * @author 이명필
 *
 */
public class MypageModel {
	
	private String reserve_master_no;
	private String movie_name;
	private String room_name;
	private String show_date;
	private String start_time;
	private Date reg_date;
	private String cancel;
	private Date cancel_date;
	
	
	public String getReserve_master_no() {
		return reserve_master_no;
	}
	public void setReserve_master_no(String reserve_master_no) {
		this.reserve_master_no = reserve_master_no;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	
	public String getCancel() {
		return cancel;
	}
	public void setCancel(String cancel) {
		this.cancel = cancel;
	}
	public Date getCancel_date() {
		return cancel_date;
	}
	public void setCancel_date(Date cancel_date) {
		this.cancel_date = cancel_date;
	}
	public String getRoom_name() {
		return room_name;
	}
	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}
	public String getShow_date() {
		return show_date;
	}
	public void setShow_date(String show_date) {
		this.show_date = show_date;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	

}
	
	
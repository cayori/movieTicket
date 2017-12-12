package com.hotsix.mypage;

import java.util.Date;
/**
 * 위시리스트에서 사용할 데이터 모델
 * @author 이명필
 *
 */
public class WishlistModel {
	
	private int movie_no;
	private int member_no;
	private String movie_name;
	private String director;
	private String actor;
	private String summary;
	private Date show_date;
	private String story;
	private String poster;
	private Date reg_date;
	private String cut1;
	private String cut2;
	private String cut3;
	public int getMovie_no() {
		return movie_no;
	}
	public void setMovie_no(int movie_no) {
		this.movie_no = movie_no;
	}
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Date getShow_date() {
		return show_date;
	}
	public void setShow_date(Date show_date) {
		this.show_date = show_date;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public String getCut1() {
		return cut1;
	}
	public void setCut1(String cut1) {
		this.cut1 = cut1;
	}
	public String getCut2() {
		return cut2;
	}
	public void setCut2(String cut2) {
		this.cut2 = cut2;
	}
	public String getCut3() {
		return cut3;
	}
	public void setCut3(String cut3) {
		this.cut3 = cut3;
	}
	
	
	

}

	
package com.java.spring.chap1;




public class NewArticleCommand {

	private String title;
	private String content;
	private int parentId;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	
	
	@Override
	public String toString(){
		
		return "NewArticleCommend[content="+content+",parentId="+parentId+",tilt="+title+"]";
	}
	
	
}

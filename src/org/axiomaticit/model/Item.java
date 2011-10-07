package org.axiomaticit.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="item", namespace="org.axiomaticit.model")
public class Item implements Serializable {

	private static final long serialVersionUID = 8986221083999860039L;
	
	private Long id;
	private String title;
	private String content;
	private String author;
	
	private int hashCode;
	
	public Item () { }
	
	public Item(Long id, String title, String content, String author) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.author = author;
	}
	
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Item)
			return equals((Item) obj);
		
		return false;
	}
	
	public boolean equals(Item item) {
		if(item.getTitle().equals(this.getTitle()) && item.getAuthor().equals(this.getAuthor()))
			return true;
		
		return false;
	}
	
	public int hashCode() {
		hashCode ^= this.getTitle().hashCode() + this.getAuthor().hashCode();
		return hashCode;
	}
}
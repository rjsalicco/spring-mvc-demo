package org.axiomaticit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="items")
@XmlRootElement(name="item", namespace="org.axiomaticit.model")
public class Item implements Serializable {

	private static final long serialVersionUID = 8986221083999860039L;
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="content")
	private String content;
	
	@Column(name="author")
	private String author;
	
	public Item () { }
	
	public Item(String title, String content, String author) {
		this.title = title;
		this.content = content;
		this.author = author;
	}
	
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
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
		if(obj  == null)
			return false;
		if(obj == this)
			return true;
		if(obj instanceof Item)
			return equals((Item) obj);
		
		return false;
	}
	
	public boolean equals(Item item) {
		return new EqualsBuilder().
				append(id, item.getId()).
				append(author, item.getAuthor()).
				append(title, item.getTitle()).
				isEquals();
	}
	
	public int hashCode() {
		return new HashCodeBuilder(3,5).
				append(id).
				append(author).
				append(title).
				toHashCode();
	}
}
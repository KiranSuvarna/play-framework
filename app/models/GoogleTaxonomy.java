package models;

import org.bson.types.ObjectId;
import org.jongo.marshall.jackson.oid.MongoObjectId;

public class GoogleTaxonomy {
	
	public ObjectId _id;
	public String name;
	public String actual_path;
	public String q_tags;
	public String questions;
	
	@MongoObjectId
	public ObjectId getId() {
		return _id;
	}
	public void setId(ObjectId _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActual_path() {
		return actual_path;
	}
	public void setActual_path(String actual_path) {
		this.actual_path = actual_path;
	}
	public String getQ_tags() {
		return q_tags;
	}
	public void setQ_tags(String q_tags) {
		this.q_tags = q_tags;
	}
	public String getQuestions() {
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = questions;
	}

}

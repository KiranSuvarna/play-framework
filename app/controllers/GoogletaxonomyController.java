package controllers;

import org.bson.types.ObjectId;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

import com.google.gson.Gson;
import com.mongodb.DB;
import com.mongodb.MongoClient;

import models.GoogleTaxonomy;
import play.mvc.Controller;
import play.mvc.Result;

public class GoogletaxonomyController extends Controller {

	public Result getTaxonomyByName(String name) {
		DB db = new MongoClient().getDB("youplus_development");
		Jongo jongo = new Jongo(db);
		MongoCollection googleTaxonomy = jongo.getCollection("Google_Taxonomy");
		String query = "{'name':'"+name+"'}";
		System.out.println(query);
		GoogleTaxonomy all = googleTaxonomy.findOne(query).as(GoogleTaxonomy.class);
		return ok(new Gson().toJson(all));
	}
}

package controllers;

import java.util.List;

import com.google.inject.Inject;

import models.Contact;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

public class ContactsController extends Controller {
	
	@Inject FormFactory formfactory;
	
	public Result getContacts() {
		List<Contact> contact = Contact.finder.all();
		return ok(views.html.contacts.render(contact));
	}
	
	public Result getContactsById(String id) {
		Contact contact = Contact.finder.byId(id);
		if(contact != null) {
			return notFound();
		}else {
			return ok();
		}
	}
	
	public Result newContact() {
		Form<Contact> contactForm = formfactory.form(Contact.class);
		return ok(views.html.newContact.render(contactForm));
		}
	
	public Result createContact() {
		Form<Contact> contactForm = formfactory.form(Contact.class).bindFromRequest();
		Contact contatc = contactForm.get();
		contatc.save();
		return redirect(routes.ContactsController.getContacts());
		}
	
	

}

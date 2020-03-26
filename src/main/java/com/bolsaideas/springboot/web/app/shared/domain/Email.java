package com.bolsaideas.springboot.web.app.shared.domain;

import java.util.regex.Pattern;

public class Email {
	
	private static final String EMAIL_REGEX = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
	
	private String value;

	  public Email(String value) {

	    try {
	      this.value = value;
	      if (!Pattern.matches(EMAIL_REGEX, value)) {
	        throw new RuntimeException("El correo ingresado no es válido");
	      }
	    } catch (NullPointerException e) {
	    	 throw new RuntimeException("El correo ingresado no es válido");
	    }

	  }
	  public String getEmail() {
	    return value;
	  }
	

}

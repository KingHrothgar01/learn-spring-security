package com.baeldung.lss.validation;

public class EmailExistsException extends Throwable {

    private static final long serialVersionUID = 454521771672220015L;

	public EmailExistsException(final String message) {
        super(message);
    }

}

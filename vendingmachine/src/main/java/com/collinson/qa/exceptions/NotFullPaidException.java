package com.collinson.qa.exceptions;


/**
 * An Exception, thrown by Vending Machine when a user tries to collect an item, without paying the full amount.
 */
public class NotFullPaidException extends RuntimeException {

    private final String message;
    private final long remaining;

    public NotFullPaidException(String message, long remaining) {

        this.message = message;
        this.remaining = remaining;
    }

    public long getRemaining() {

        return remaining;
    }

    @Override
    public String getMessage() {

        return message + remaining;
    }

}

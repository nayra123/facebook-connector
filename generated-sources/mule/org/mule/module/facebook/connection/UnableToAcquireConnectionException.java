
package org.mule.module.facebook.connection;

import javax.annotation.Generated;


/**
 * Exception thrown when the connection needed for executing an
 *  operation is null.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.0-SNAPSHOT", date = "2014-04-24T12:40:55-05:00", comments = "Build master.1920.518defc")
public class UnableToAcquireConnectionException
    extends Exception
{

    /**
     * Create a new exception
     */
    public UnableToAcquireConnectionException() {
    }

    /**
     * Create a new exception
     */
    public UnableToAcquireConnectionException(String message) {
        super(message);
    }

    /**
     * Create a new exception
     *
     * @param throwable Inner exception
     */
    public UnableToAcquireConnectionException(Throwable throwable) {
        super(throwable);
    }
}

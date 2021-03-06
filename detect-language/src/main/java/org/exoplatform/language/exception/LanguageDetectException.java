/*
 * Copyright (C) 2003-2013 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.exoplatform.language.exception;

import org.exoplatform.language.define.ErrorCode;

/**
 * @author <a href="mailto:sondn@exoplatform.com">Ngoc Son Dang</a>
 * @version LanguageDetectException.java Oct 18, 2013
 * 
 */
public class LanguageDetectException extends Exception {

    /**
	 * 
	 */
    private static final long serialVersionUID = 6106838564536761251L;

    private ErrorCode errorCode;

    /**
     * @return the error errorCode
     */
    public ErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * Constructs a new exception with {@code null} as its detail message. The
     * cause is not initialized, and may subsequently be initialized by a call
     * to {@link #initCause}.
     */
    public LanguageDetectException() {
        super();
    }

    /**
     * Constructs a new exception with the specified detail message. The cause
     * is not initialized, and may subsequently be initialized by a call to
     * {@link #initCause}.
     * 
     * @param message
     *            The detail message which is saved for later retrieval by the
     *            {@link #getMessage()} method.
     */
    public LanguageDetectException(final String message) {
        super(message);
    }

    /**
     * Constructs a new exception with the specified cause and a detail message
     * of <code>(cause==null ?
     * null : cause.toString())</code> (which typically contains the class and
     * detail message of <code>cause</code>). This constructor is useful for
     * exceptions that are little more than wrappers for other throwables.
     * 
     * @param cause
     *            The cause which is saved for later retrieval by the
     *            {@link #getCause()} method. A {@code null} value is permitted,
     *            and indicates that the cause is nonexistent or unknown.
     * @since 1.4
     */
    public LanguageDetectException(final Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new exception with the specified detail message and cause.
     * <p>
     * Note that the detail message associated with <code>cause</code> is not
     * automatically incorporated into this exception's detail message.
     * 
     * @param message
     *            The detail message which is saved for later retrieval by the
     *            {@link #getMessage()} method.
     * @param cause
     *            The cause which is saved for later retrieval by the
     *            {@link #getCause()} method. A {@code null} value is permitted,
     *            and indicates that the cause is nonexistent or unknown.
     * @since 1.4
     */
    public LanguageDetectException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public LanguageDetectException(final String message,
            final ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}

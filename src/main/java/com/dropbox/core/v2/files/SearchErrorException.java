/* DO NOT EDIT */
/* This file was generated from files.babel */

package com.dropbox.core.v2.files;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link SearchError} error.
 */
public class SearchErrorException extends DbxApiException {

    /**
     * The error reported by {@link DbxFiles#search(String,String)}.
     */
    public final SearchError errorValue;

    public SearchErrorException(String requestId, LocalizedText userMessage, SearchError errorValue) {
        super(requestId, userMessage, buildMessage("search", userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Windows Mobile MSIRequest.
 */
public interface IBaseWindowsMobileMSIRequest extends IHttpRequest {

    /**
     * Gets the WindowsMobileMSI from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WindowsMobileMSI> callback);

    /**
     * Gets the WindowsMobileMSI from the service
     *
     * @return the WindowsMobileMSI from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsMobileMSI get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsMobileMSI with a source
     *
     * @param sourceWindowsMobileMSI the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsMobileMSI sourceWindowsMobileMSI, final ICallback<WindowsMobileMSI> callback);

    /**
     * Patches this WindowsMobileMSI with a source
     *
     * @param sourceWindowsMobileMSI the source object with updates
     * @return the updated WindowsMobileMSI
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsMobileMSI patch(final WindowsMobileMSI sourceWindowsMobileMSI) throws ClientException;

    /**
     * Posts a WindowsMobileMSI with a new object
     *
     * @param newWindowsMobileMSI the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsMobileMSI newWindowsMobileMSI, final ICallback<WindowsMobileMSI> callback);

    /**
     * Posts a WindowsMobileMSI with a new object
     *
     * @param newWindowsMobileMSI the new object to create
     * @return the created WindowsMobileMSI
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsMobileMSI post(final WindowsMobileMSI newWindowsMobileMSI) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWindowsMobileMSIRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWindowsMobileMSIRequest expand(final String value);

}

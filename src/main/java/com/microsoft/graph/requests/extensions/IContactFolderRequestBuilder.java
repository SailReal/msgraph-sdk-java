// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IContactFolderRequest;
import com.microsoft.graph.requests.extensions.IContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContactRequestBuilder;
import com.microsoft.graph.requests.extensions.IContactFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContactFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Contact Folder Request Builder.
 */
public interface IContactFolderRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IContactFolderRequest instance
     */
    IContactFolderRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IContactFolderRequest instance
     */
    IContactFolderRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    IContactCollectionRequestBuilder contacts();

    IContactRequestBuilder contacts(final String id);

    IContactFolderCollectionRequestBuilder childFolders();

    IContactFolderRequestBuilder childFolders(final String id);

    ISingleValueLegacyExtendedPropertyCollectionRequestBuilder singleValueExtendedProperties();

    ISingleValueLegacyExtendedPropertyRequestBuilder singleValueExtendedProperties(final String id);

    IMultiValueLegacyExtendedPropertyCollectionRequestBuilder multiValueExtendedProperties();

    IMultiValueLegacyExtendedPropertyRequestBuilder multiValueExtendedProperties(final String id);

}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationRequest;
import com.microsoft.graph.requests.extensions.ITeamsAppWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationUpgradeRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Teams App Installation Request Builder.
 */
public interface IBaseTeamsAppInstallationRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the ITeamsAppInstallationRequest instance
     */
    ITeamsAppInstallationRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ITeamsAppInstallationRequest instance
     */
    ITeamsAppInstallationRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    /**
     * Gets the request builder for TeamsApp
     *
     * @return the ITeamsAppWithReferenceRequestBuilder instance
     */
    ITeamsAppWithReferenceRequestBuilder teamsApp();

    /**
     * Gets the request builder for TeamsAppDefinition
     *
     * @return the ITeamsAppDefinitionWithReferenceRequestBuilder instance
     */
    ITeamsAppDefinitionWithReferenceRequestBuilder teamsAppDefinition();
    ITeamsAppInstallationUpgradeRequestBuilder upgrade();

}
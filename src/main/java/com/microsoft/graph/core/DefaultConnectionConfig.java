// ------------------------------------------------------------------------------
// Copyright (c) 2017 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.core;

public class DefaultConnectionConfig implements IConnectionConfig{
	
    /**
     * Default connect timeout
     */
    private static int DEFAULT_CONNECT_TIMEOUT_MS = 30_000;
    
    /**
     * Default connection read timeout
     */
    private static int DEFAULT_READ_TIMEOUT_MS = 30_000;
    
    /**
     * Gets the connect timeout
     *
     * @return the timeout in milliseconds
     */
    @Override
    public int getConnectTimeout() {
        return DEFAULT_CONNECT_TIMEOUT_MS;
    }
    
    /**
     * Sets the connect timeout
     * 
     * @param connectTimeoutValue Connect timeout in milliseconds to be set to.
     */
    @Override
    public void setConnectTimeout(int connectTimeoutValue) {
        DEFAULT_CONNECT_TIMEOUT_MS = connectTimeoutValue;
    }
    
    /**
     * Gets the read timeout
     *
     * @return the timeout in milliseconds
     */
    @Override
    public int getReadTimeout() {
        return DEFAULT_READ_TIMEOUT_MS;
    }
    
    /**
     * Sets the connect timeout
     * 
     * @param readTimeoutValue Read timeout in milliseconds to be set to.
     */
    @Override
    public void setReadTimeout(int readTimeoutValue) {
    	DEFAULT_READ_TIMEOUT_MS = readTimeoutValue;
    }

}

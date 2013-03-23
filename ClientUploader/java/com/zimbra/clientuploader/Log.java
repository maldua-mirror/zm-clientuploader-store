/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2012 VMware, Inc.
 * 
 * The contents of this file are subject to the Zimbra Public License
 * Version 1.3 ("License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.zimbra.com/license.
 * 
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.clientuploader;

import com.zimbra.common.util.LogFactory;

/**
 * Log for client uploader extension
 *
 * @author Dongwei Feng
 * @since 2012.3.16
 */
public class Log {
    /**
     * the "zimbra.clientUploader" logger, for client upload logs.
     */
    public static final com.zimbra.common.util.Log clientUploader = LogFactory.getLog("zimbra.clientUploader");

}

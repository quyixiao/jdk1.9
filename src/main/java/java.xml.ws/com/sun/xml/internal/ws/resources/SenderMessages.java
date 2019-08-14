/*
 * Copyright (c) 1997, 2017, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.xml.internal.ws.resources;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.annotation.Generated;
import com.sun.istack.internal.localization.Localizable;
import com.sun.istack.internal.localization.LocalizableMessageFactory;
import com.sun.istack.internal.localization.LocalizableMessageFactory.ResourceBundleSupplier;
import com.sun.istack.internal.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 *
 */
@Generated("com.sun.istack.internal.maven.ResourceGenMojo")
public final class SenderMessages {

    private final static String BUNDLE_NAME = "com.sun.xml.internal.ws.resources.sender";
    private final static LocalizableMessageFactory MESSAGE_FACTORY = new LocalizableMessageFactory(BUNDLE_NAME, new SenderMessages.BundleSupplier());
    private final static Localizer LOCALIZER = new Localizer();

    public static Localizable localizableSENDER_REQUEST_MESSAGE_NOT_READY() {
        return MESSAGE_FACTORY.getMessage("sender.request.messageNotReady");
    }

    /**
     * message not ready to be sent
     *
     */
    public static String SENDER_REQUEST_MESSAGE_NOT_READY() {
        return LOCALIZER.localize(localizableSENDER_REQUEST_MESSAGE_NOT_READY());
    }

    public static Localizable localizableSENDER_RESPONSE_CANNOT_DECODE_FAULT_DETAIL() {
        return MESSAGE_FACTORY.getMessage("sender.response.cannotDecodeFaultDetail");
    }

    /**
     * fault detail cannot be decoded
     *
     */
    public static String SENDER_RESPONSE_CANNOT_DECODE_FAULT_DETAIL() {
        return LOCALIZER.localize(localizableSENDER_RESPONSE_CANNOT_DECODE_FAULT_DETAIL());
    }

    public static Localizable localizableSENDER_REQUEST_ILLEGAL_VALUE_FOR_CONTENT_NEGOTIATION(Object arg0) {
        return MESSAGE_FACTORY.getMessage("sender.request.illegalValueForContentNegotiation", arg0);
    }

    /**
     * illegal value for content negotiation property "{0}"
     *
     */
    public static String SENDER_REQUEST_ILLEGAL_VALUE_FOR_CONTENT_NEGOTIATION(Object arg0) {
        return LOCALIZER.localize(localizableSENDER_REQUEST_ILLEGAL_VALUE_FOR_CONTENT_NEGOTIATION(arg0));
    }

    public static Localizable localizableSENDER_NESTED_ERROR(Object arg0) {
        return MESSAGE_FACTORY.getMessage("sender.nestedError", arg0);
    }

    /**
     * sender error: {0}
     *
     */
    public static String SENDER_NESTED_ERROR(Object arg0) {
        return LOCALIZER.localize(localizableSENDER_NESTED_ERROR(arg0));
    }

    private static class BundleSupplier
        implements ResourceBundleSupplier
    {


        public ResourceBundle getResourceBundle(Locale locale) {
            return ResourceBundle.getBundle(BUNDLE_NAME, locale);
        }

    }

}

/*
 * Copyright (c) 2000, 2014, Oracle and/or its affiliates. All rights reserved.
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
package javax.print.attribute.standard;

import java.util.Locale;

import javax.print.attribute.Attribute;
import javax.print.attribute.TextSyntax;
import javax.print.attribute.PrintServiceAttribute;

/**
 * Class PrinterLocation is a printing attribute class, a text attribute, that
 * identifies the location of the device. This could include things like:
 * {@code "in Room 123A, second floor of building XYZ"}.
 * <P>
 * <B>IPP Compatibility:</B> The string value gives the IPP name value. The
 * locale gives the IPP natural language. The category name returned by
 * {@code getName()} gives the IPP attribute name.
 *
 * @author  Alan Kaminsky
 */
public final class PrinterLocation extends TextSyntax
    implements PrintServiceAttribute {

    private static final long serialVersionUID = -1598610039865566337L;

    /**
     * Constructs a new printer location attribute with the given location and
     * locale.
     *
     * @param  location  Printer location.
     * @param  locale    Natural language of the text string. null
     * is interpreted to mean the default locale as returned
     * by {@code Locale.getDefault()}
     *
     * @exception  NullPointerException
     *     (unchecked exception) Thrown if {@code location} is null.
     */
    public PrinterLocation(String location, Locale locale) {
        super (location, locale);
    }

    /**
     * Returns whether this printer location attribute is equivalent to the
     * passed in object. To be equivalent, all of the following conditions
     * must be true:
     * <OL TYPE=1>
     * <LI>
     * {@code object} is not null.
     * <LI>
     * {@code object} is an instance of class PrinterLocation.
     * <LI>
     * This printer location attribute's underlying string and
     * {@code object}'s underlying string are equal.
     * <LI>
     * This printer location attribute's locale and {@code object}'s
     * locale are equal.
     * </OL>
     *
     * @param  object  Object to compare to.
     *
     * @return  True if {@code object} is equivalent to this printer
     *          location attribute, false otherwise.
     */
    public boolean equals(Object object) {
        return (super.equals(object) && object instanceof PrinterLocation);
    }

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value.
     * <P>
     * For class PrinterLocation, the
     * category is class PrinterLocation itself.
     *
     * @return  Printing attribute class (category), an instance of class
     *          {@link java.lang.Class java.lang.Class}.
     */
    public final Class<? extends Attribute> getCategory() {
        return PrinterLocation.class;
    }

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * <P>
     * For class PrinterLocation, the
     * category name is {@code "printer-location"}.
     *
     * @return  Attribute category name.
     */
    public final String getName() {
        return "printer-location";
    }

}

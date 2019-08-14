/*
 * Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved.
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

package jdk.jshell;

/**
 * Common interface for all wrappings of snippet source to Java source.
 *
 * @author Robert Field
 */
interface GeneralWrap {

    String wrapped();

    int snippetIndexToWrapIndex(int sni);

    int wrapIndexToSnippetIndex(int wi);

    default int wrapIndexToSnippetIndex(long wi) {
        return wrapIndexToSnippetIndex((int) wi);
    }

    int firstSnippetIndex();

    int lastSnippetIndex();

    int snippetLineToWrapLine(int snline);

    int wrapLineToSnippetLine(int wline);

    int firstSnippetLine();

    int lastSnippetLine();

    default String debugPos(long lpos) {
        int pos = (int) lpos;
        int len = wrapped().length();
        return wrapped().substring(Math.max(0, pos - 10), Math.max(0, Math.min(len, pos)))
                + "###"
                + wrapped().substring(Math.max(0, Math.min(len, pos)), Math.max(0, Math.min(len, pos + 10)));
    }
}

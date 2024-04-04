/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class hr {
    private static final Pattern a = Pattern.compile((String)"\\\\.");
    private static final Pattern b = Pattern.compile((String)"[\\\\\"/\b\f\n\r\t]");

    public static String a(String string) {
        Matcher matcher;
        StringBuffer stringBuffer;
        block16 : {
            block15 : {
                if (TextUtils.isEmpty((CharSequence)string)) break block15;
                matcher = b.matcher((CharSequence)string);
                stringBuffer = null;
                block10 : while (matcher.find()) {
                    StringBuffer stringBuffer2 = stringBuffer;
                    if (stringBuffer == null) {
                        stringBuffer2 = new StringBuffer();
                    }
                    switch (matcher.group().charAt(0)) {
                        default: {
                            stringBuffer = stringBuffer2;
                            continue block10;
                        }
                        case '\b': {
                            matcher.appendReplacement(stringBuffer2, "\\\\b");
                            stringBuffer = stringBuffer2;
                            continue block10;
                        }
                        case '\"': {
                            matcher.appendReplacement(stringBuffer2, "\\\\\\\"");
                            stringBuffer = stringBuffer2;
                            continue block10;
                        }
                        case '\\': {
                            matcher.appendReplacement(stringBuffer2, "\\\\\\\\");
                            stringBuffer = stringBuffer2;
                            continue block10;
                        }
                        case '/': {
                            matcher.appendReplacement(stringBuffer2, "\\\\/");
                            stringBuffer = stringBuffer2;
                            continue block10;
                        }
                        case '\f': {
                            matcher.appendReplacement(stringBuffer2, "\\\\f");
                            stringBuffer = stringBuffer2;
                            continue block10;
                        }
                        case '\n': {
                            matcher.appendReplacement(stringBuffer2, "\\\\n");
                            stringBuffer = stringBuffer2;
                            continue block10;
                        }
                        case '\r': {
                            matcher.appendReplacement(stringBuffer2, "\\\\r");
                            stringBuffer = stringBuffer2;
                            continue block10;
                        }
                        case '\t': 
                    }
                    matcher.appendReplacement(stringBuffer2, "\\\\t");
                    stringBuffer = stringBuffer2;
                }
                if (stringBuffer != null) break block16;
            }
            return string;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}


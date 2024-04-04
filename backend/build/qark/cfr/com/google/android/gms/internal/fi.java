/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.webkit.ConsoleMessage
 *  android.webkit.ConsoleMessage$MessageLevel
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 */
package com.google.android.gms.internal;

import android.webkit.ConsoleMessage;

class fi {
    static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        a = new int[ConsoleMessage.MessageLevel.values().length];
        try {
            fi.a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fi.a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fi.a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fi.a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fi.a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}


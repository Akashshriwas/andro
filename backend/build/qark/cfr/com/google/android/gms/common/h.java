/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  java.lang.Exception
 *  java.lang.String
 */
package com.google.android.gms.common;

import android.content.Intent;

public class h
extends Exception {
    private final Intent a;

    public h(String string, Intent intent) {
        super(string);
        this.a = intent;
    }
}


/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.String
 */
package com.google.android.gms.internal;

import java.io.IOException;

public class jf
extends IOException {
    jf(int n2, int n3) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + n2 + " limit " + n3 + ").");
    }
}


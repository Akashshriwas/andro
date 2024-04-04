/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

public class b
extends RuntimeException {
    public b(String string, Parcel parcel) {
        super(string + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}


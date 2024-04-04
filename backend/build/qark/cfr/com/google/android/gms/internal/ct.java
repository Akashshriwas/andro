/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.eu;

public final class ct
implements SafeParcelable {
    public static final eu a = new eu();
    public final int b;
    public String c;
    public int d;
    public int e;
    public boolean f;

    /*
     * Enabled aggressive block sorting
     */
    public ct(int n2, int n3, boolean bl2) {
        StringBuilder stringBuilder = new StringBuilder().append("afma-sdk-a-v").append(n2).append(".").append(n3).append(".");
        String string = bl2 ? "0" : "1";
        this(1, stringBuilder.append(string).toString(), n2, n3, bl2);
    }

    ct(int n2, String string, int n3, int n4, boolean bl2) {
        this.b = n2;
        this.c = string;
        this.d = n3;
        this.e = n4;
        this.f = bl2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        eu.a(this, parcel, n2);
    }
}


// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

final class c extends f
{
    @Override
    public PlayerEntity a(final Parcel parcel) {
        Uri parse = null;
        if (.b(.w()) || .b(PlayerEntity.class.getCanonicalName())) {
            return super.a(parcel);
        }
        final String string = parcel.readString();
        final String string2 = parcel.readString();
        final String string3 = parcel.readString();
        final String string4 = parcel.readString();
        Uri parse2;
        if (string3 == null) {
            parse2 = null;
        }
        else {
            parse2 = Uri.parse(string3);
        }
        if (string4 != null) {
            parse = Uri.parse(string4);
        }
        return new PlayerEntity(1, string, string2, parse2, parse, parcel.readLong());
    }
}

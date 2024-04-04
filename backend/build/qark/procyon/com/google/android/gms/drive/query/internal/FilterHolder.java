// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.query.a;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class FilterHolder implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final ComparisonFilter b;
    final FieldOnlyFilter c;
    final LogicalFilter d;
    final NotFilter e;
    final InFilter f;
    private final a g;
    
    static {
        CREATOR = (Parcelable$Creator)new c();
    }
    
    FilterHolder(final int a, final ComparisonFilter b, final FieldOnlyFilter c, final LogicalFilter d, final NotFilter e, final InFilter f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        if (this.b != null) {
            this.g = this.b;
            return;
        }
        if (this.c != null) {
            this.g = this.c;
            return;
        }
        if (this.d != null) {
            this.g = this.d;
            return;
        }
        if (this.e != null) {
            this.g = this.e;
            return;
        }
        if (this.f != null) {
            this.g = this.f;
            return;
        }
        throw new IllegalArgumentException("At least one filter must be set.");
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.drive.query.internal.c.a(this, parcel, n);
    }
}

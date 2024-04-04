/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.a;
import com.google.android.gms.drive.query.internal.ComparisonFilter;
import com.google.android.gms.drive.query.internal.FieldOnlyFilter;
import com.google.android.gms.drive.query.internal.InFilter;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.NotFilter;
import com.google.android.gms.drive.query.internal.c;

public class FilterHolder
implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new c();
    final int a;
    final ComparisonFilter b;
    final FieldOnlyFilter c;
    final LogicalFilter d;
    final NotFilter e;
    final InFilter f;
    private final a g;

    FilterHolder(int n2, ComparisonFilter comparisonFilter, FieldOnlyFilter fieldOnlyFilter, LogicalFilter logicalFilter, NotFilter notFilter, InFilter inFilter) {
        this.a = n2;
        this.b = comparisonFilter;
        this.c = fieldOnlyFilter;
        this.d = logicalFilter;
        this.e = notFilter;
        this.f = inFilter;
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

    public void writeToParcel(Parcel parcel, int n2) {
        c.a(this, parcel, n2);
    }
}


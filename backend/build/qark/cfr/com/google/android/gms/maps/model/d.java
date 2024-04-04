/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.e;
import com.google.android.gms.maps.model.f;

public class d
implements Parcelable.Creator {
    static void a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int n2) {
        int n3 = c.a(parcel);
        c.a(parcel, 1, groundOverlayOptions.b());
        c.a(parcel, 2, groundOverlayOptions.a(), false);
        c.a(parcel, 3, groundOverlayOptions.c(), n2, false);
        c.a(parcel, 4, groundOverlayOptions.d());
        c.a(parcel, 5, groundOverlayOptions.e());
        c.a(parcel, 6, groundOverlayOptions.f(), n2, false);
        c.a(parcel, 7, groundOverlayOptions.g());
        c.a(parcel, 8, groundOverlayOptions.h());
        c.a(parcel, 9, groundOverlayOptions.l());
        c.a(parcel, 10, groundOverlayOptions.i());
        c.a(parcel, 11, groundOverlayOptions.j());
        c.a(parcel, 12, groundOverlayOptions.k());
        c.a(parcel, n3);
    }

    public GroundOverlayOptions a(Parcel parcel) {
        int n2 = a.b(parcel);
        int n3 = 0;
        IBinder iBinder = null;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        LatLngBounds latLngBounds = null;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean bl2 = false;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        block14 : while (parcel.dataPosition() < n2) {
            int n4 = a.a(parcel);
            switch (a.a(n4)) {
                default: {
                    a.b(parcel, n4);
                    continue block14;
                }
                case 1: {
                    n3 = a.g(parcel, n4);
                    continue block14;
                }
                case 2: {
                    iBinder = a.n(parcel, n4);
                    continue block14;
                }
                case 3: {
                    latLng = (LatLng)a.a(parcel, n4, LatLng.a);
                    continue block14;
                }
                case 4: {
                    f2 = a.j(parcel, n4);
                    continue block14;
                }
                case 5: {
                    f3 = a.j(parcel, n4);
                    continue block14;
                }
                case 6: {
                    latLngBounds = (LatLngBounds)a.a(parcel, n4, LatLngBounds.a);
                    continue block14;
                }
                case 7: {
                    f4 = a.j(parcel, n4);
                    continue block14;
                }
                case 8: {
                    f5 = a.j(parcel, n4);
                    continue block14;
                }
                case 9: {
                    bl2 = a.c(parcel, n4);
                    continue block14;
                }
                case 10: {
                    f6 = a.j(parcel, n4);
                    continue block14;
                }
                case 11: {
                    f7 = a.j(parcel, n4);
                    continue block14;
                }
                case 12: 
            }
            f8 = a.j(parcel, n4);
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        return new GroundOverlayOptions(n3, iBinder, latLng, f2, f3, latLngBounds, f4, f5, bl2, f6, f7, f8);
    }

    public GroundOverlayOptions[] a(int n2) {
        return new GroundOverlayOptions[n2];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }
}


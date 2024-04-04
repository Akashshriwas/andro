/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gz;

public final class Status
implements SafeParcelable {
    public static final Status a = new Status(0, null, null);
    public static final Status b = new Status(14, null, null);
    public static final Status c = new Status(15, null, null);
    public static final a d = new a();
    private final int e;
    private final int f;
    private final String g;
    private final PendingIntent h;

    Status(int n2, int n3, String string, PendingIntent pendingIntent) {
        this.e = n2;
        this.f = n3;
        this.g = string;
        this.h = pendingIntent;
    }

    public Status(int n2, String string, PendingIntent pendingIntent) {
        this(1, n2, string, pendingIntent);
    }

    private String e() {
        if (this.g != null) {
            return this.g;
        }
        switch (this.f) {
            default: {
                return "unknown status code " + this.f;
            }
            case -1: {
                return "SUCCESS_CACHE";
            }
            case 0: {
                return "SUCCESS";
            }
            case 1: {
                return "SERVICE_MISSING";
            }
            case 2: {
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            }
            case 3: {
                return "SERVICE_DISABLED";
            }
            case 4: {
                return "SIGN_IN_REQUIRED";
            }
            case 5: {
                return "INVALID_ACCOUNT";
            }
            case 6: {
                return "RESOLUTION_REQUIRED";
            }
            case 7: {
                return "NETWORK_ERROR";
            }
            case 8: {
                return "INTERNAL_ERROR";
            }
            case 9: {
                return "SERVICE_INVALID";
            }
            case 10: {
                return "DEVELOPER_ERROR";
            }
            case 11: 
        }
        return "LICENSE_CHECK_FAILED";
    }

    PendingIntent a() {
        return this.h;
    }

    String b() {
        return this.g;
    }

    int c() {
        return this.e;
    }

    public int d() {
        return this.f;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return gw.a((Object)this).a("statusCode", this.e()).a("resolution", (Object)this.h).toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        a.a(this, parcel, n2);
    }
}


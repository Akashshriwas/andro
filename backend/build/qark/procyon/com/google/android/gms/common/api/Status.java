// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.common.api;

import android.os.Parcel;
import com.google.android.gms.internal.gw;
import android.app.PendingIntent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class Status implements SafeParcelable
{
    public static final Status a;
    public static final Status b;
    public static final Status c;
    public static final a d;
    private final int e;
    private final int f;
    private final String g;
    private final PendingIntent h;
    
    static {
        a = new Status(0, null, null);
        b = new Status(14, null, null);
        c = new Status(15, null, null);
        d = new a();
    }
    
    Status(final int e, final int f, final String g, final PendingIntent h) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public Status(final int n, final String s, final PendingIntent pendingIntent) {
        this(1, n, s, pendingIntent);
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
            case 11: {
                return "LICENSE_CHECK_FAILED";
            }
        }
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
    
    @Override
    public String toString() {
        return gw.a(this).a("statusCode", this.e()).a("resolution", this.h).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.common.api.a.a(this, parcel, n);
    }
}

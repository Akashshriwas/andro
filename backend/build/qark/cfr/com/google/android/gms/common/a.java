/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.common;

import android.app.PendingIntent;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gz;

public final class a {
    public static final a a = new a(0, null);
    private final PendingIntent b;
    private final int c;

    public a(int n2, PendingIntent pendingIntent) {
        this.c = n2;
        this.b = pendingIntent;
    }

    private String a() {
        switch (this.c) {
            default: {
                return "unknown status code " + this.c;
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

    public String toString() {
        return gw.a((Object)this).a("statusCode", this.a()).a("resolution", (Object)this.b).toString();
    }
}


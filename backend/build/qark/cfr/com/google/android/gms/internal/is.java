/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.view.MotionEvent
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.fl;
import com.google.android.gms.internal.jj;

public class is {
    private String a = "googleads.g.doubleclick.net";
    private String b = "/pagead/ads";
    private String[] c = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private fl d;
    private final dm e = new dm();

    public is(fl fl2) {
        this.d = fl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Uri a(Uri uri, Context object, String string, boolean bl2) {
        try {
            if (uri.getQueryParameter("ms") != null) {
                throw new jj("Query parameter already exists: ms");
            }
            if (bl2) {
                object = this.d.a((Context)object, string);
                return this.a(uri, "ms", (String)object);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw new jj("Provided Uri is not in a valid state");
        }
        object = this.d.a((Context)object);
        return this.a(uri, "ms", (String)object);
    }

    private Uri a(Uri uri, String string, String string2) {
        int n2;
        String string3 = uri.toString();
        int n3 = n2 = string3.indexOf("&adurl");
        if (n2 == -1) {
            n3 = string3.indexOf("?adurl");
        }
        if (n3 != -1) {
            return Uri.parse((String)(string3.substring(0, n3 + 1) + string + "=" + string2 + "&" + string3.substring(n3 + 1)));
        }
        return uri.buildUpon().appendQueryParameter(string, string2).build();
    }

    public Uri a(Uri uri, Context context) {
        try {
            uri = this.a(uri, context, uri.getQueryParameter("ai"), true);
            return uri;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw new jj("Provided Uri is not in a valid state");
        }
    }

    public fl a() {
        return this.d;
    }

    public void a(MotionEvent motionEvent) {
        this.d.a(motionEvent);
    }

    public boolean a(Uri object) {
        String[] arrstring;
        int n2;
        int n3;
        boolean bl2 = false;
        if (object == null) {
            throw new NullPointerException();
        }
        try {
            object = object.getHost();
            arrstring = this.c;
            n3 = arrstring.length;
            n2 = 0;
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
        do {
            block6 : {
                boolean bl3 = bl2;
                if (n2 < n3) {
                    bl3 = object.endsWith(arrstring[n2]);
                    if (!bl3) break block6;
                    bl3 = true;
                }
                return bl3;
            }
            ++n2;
        } while (true);
    }
}


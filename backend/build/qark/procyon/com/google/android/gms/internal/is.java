// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.view.MotionEvent;
import android.content.Context;
import android.net.Uri;

public class is
{
    private String a;
    private String b;
    private String[] c;
    private fl d;
    private final dm e;
    
    public is(final fl d) {
        this.a = "googleads.g.doubleclick.net";
        this.b = "/pagead/ads";
        this.c = new String[] { ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com" };
        this.e = new dm();
        this.d = d;
    }
    
    private Uri a(final Uri uri, final Context context, final String s, final boolean b) {
        try {
            if (uri.getQueryParameter("ms") != null) {
                throw new jj("Query parameter already exists: ms");
            }
        }
        catch (UnsupportedOperationException ex) {
            throw new jj("Provided Uri is not in a valid state");
        }
        String s2;
        if (b) {
            s2 = this.d.a(context, s);
        }
        else {
            s2 = this.d.a(context);
        }
        return this.a(uri, "ms", s2);
    }
    
    private Uri a(final Uri uri, final String str, final String str2) {
        final String string = uri.toString();
        int n;
        if ((n = string.indexOf("&adurl")) == -1) {
            n = string.indexOf("?adurl");
        }
        if (n != -1) {
            return Uri.parse(string.substring(0, n + 1) + str + "=" + str2 + "&" + string.substring(n + 1));
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }
    
    public Uri a(Uri a, final Context context) {
        try {
            a = this.a(a, context, a.getQueryParameter("ai"), true);
            return a;
        }
        catch (UnsupportedOperationException ex) {
            throw new jj("Provided Uri is not in a valid state");
        }
    }
    
    public fl a() {
        return this.d;
    }
    
    public void a(final MotionEvent motionEvent) {
        this.d.a(motionEvent);
    }
    
    public boolean a(final Uri uri) {
        final boolean b = false;
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            final String host = uri.getHost();
            final String[] c = this.c;
            final int length = c.length;
            int n = 0;
            boolean b2;
            while (true) {
                b2 = b;
                if (n >= length) {
                    break;
                }
                if (host.endsWith(c[n])) {
                    b2 = true;
                    break;
                }
                ++n;
            }
            return b2;
        }
        catch (NullPointerException ex) {
            return false;
        }
    }
}

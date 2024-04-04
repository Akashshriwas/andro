/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.IOException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 */
package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.em;
import com.google.android.gms.internal.et;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public final class er
extends ef {
    private final String a;
    private final Context b;
    private final String c;

    public er(Context context, String string, String string2) {
        this.b = context;
        this.a = string;
        this.c = string2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void a() {
        HttpURLConnection httpURLConnection;
        block6 : {
            try {
                et.d("Pinging URL: " + this.c);
                httpURLConnection = (HttpURLConnection)new URL(this.c).openConnection();
            }
            catch (IOException iOException) {
                et.e("Error while pinging URL: " + this.c + ". " + iOException.getMessage());
                return;
            }
            em.a(this.b, this.a, true, httpURLConnection);
            int n2 = httpURLConnection.getResponseCode();
            if (n2 >= 200 && n2 < 300) break block6;
            et.e("Received non-success response code " + n2 + " from pinging URL: " + this.c);
            {
                catch (Throwable throwable) {
                    httpURLConnection.disconnect();
                    throw throwable;
                }
            }
        }
        httpURLConnection.disconnect();
    }

    @Override
    public void b() {
    }
}


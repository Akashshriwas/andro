// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;
import android.content.Context;

public final class er extends ef
{
    private final String a;
    private final Context b;
    private final String c;
    
    public er(final Context b, final String a, final String c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void a() {
        try {
            et.d("Pinging URL: " + this.c);
            final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(this.c).openConnection();
            try {
                em.a(this.b, this.a, true, httpURLConnection);
                final int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    et.e("Received non-success response code " + responseCode + " from pinging URL: " + this.c);
                }
            }
            finally {
                httpURLConnection.disconnect();
            }
        }
        catch (IOException ex) {
            et.e("Error while pinging URL: " + this.c + ". " + ex.getMessage());
        }
    }
    
    @Override
    public void b() {
    }
}

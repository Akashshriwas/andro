// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.a.a.f;
import android.app.Activity;
import com.google.a.a.e;
import com.google.android.gms.a.d;
import com.google.a.a.c;
import java.util.Iterator;
import com.google.a.a.a.a;
import java.util.Map;
import android.os.RemoteException;
import java.util.HashMap;
import org.json.JSONObject;
import com.google.a.a.g;
import com.google.a.a.j;
import com.google.a.a.b;

public final class bv extends bq
{
    private final b a;
    private final j b;
    
    public bv(final b a, final j b) {
        this.a = a;
        this.b = b;
    }
    
    private g a(final String s, final int c, final String b) {
        HashMap<String, String> hashMap;
        if (s != null) {
            try {
                final JSONObject jsonObject = new JSONObject(s);
                hashMap = new HashMap<String, String>(jsonObject.length());
                final Iterator keys = jsonObject.keys();
                while (keys.hasNext()) {
                    final String s2 = keys.next();
                    hashMap.put(s2, jsonObject.getString(s2));
                }
            }
            catch (Throwable t) {
                et.b("Could not get MediationServerParameters.", t);
                throw new RemoteException();
            }
        }
        else {
            hashMap = new HashMap<String, String>(0);
        }
        final Class c2 = this.a.c();
        g g = null;
        if (c2 != null) {
            g = c2.newInstance();
            g.a(hashMap);
        }
        if (g instanceof a) {
            final a a = (a)g;
            a.b = b;
            a.c = c;
            return g;
        }
        return g;
    }
    
    public com.google.android.gms.a.a a() {
        if (!(this.a instanceof c)) {
            et.e("MediationAdapter is not a MediationBannerAdapter: " + this.a.getClass().getCanonicalName());
            throw new RemoteException();
        }
        try {
            return d.a(((c)this.a).d());
        }
        catch (Throwable t) {
            et.b("Could not get banner view from adapter.", t);
            throw new RemoteException();
        }
    }
    
    public void a(final com.google.android.gms.a.a a, final v v, final String s, final bs bs) {
        this.a(a, v, s, null, bs);
    }
    
    public void a(final com.google.android.gms.a.a a, final v v, final String s, final String s2, final bs bs) {
        if (!(this.a instanceof e)) {
            et.e("MediationAdapter is not a MediationInterstitialAdapter: " + this.a.getClass().getCanonicalName());
            throw new RemoteException();
        }
        et.a("Requesting interstitial ad from adapter.");
        try {
            ((e)this.a).a(new bw(bs), (Activity)d.a(a), this.a(s, v.h, s2), bx.a(v), this.b);
        }
        catch (Throwable t) {
            et.b("Could not request interstitial ad from adapter.", t);
            throw new RemoteException();
        }
    }
    
    public void a(final com.google.android.gms.a.a a, final x x, final v v, final String s, final bs bs) {
        this.a(a, x, v, s, null, bs);
    }
    
    public void a(final com.google.android.gms.a.a a, final x x, final v v, final String s, final String s2, final bs bs) {
        if (!(this.a instanceof c)) {
            et.e("MediationAdapter is not a MediationBannerAdapter: " + this.a.getClass().getCanonicalName());
            throw new RemoteException();
        }
        et.a("Requesting banner ad from adapter.");
        try {
            ((c)this.a).a(new bw(bs), (Activity)d.a(a), this.a(s, v.h, s2), bx.a(x), bx.a(v), this.b);
        }
        catch (Throwable t) {
            et.b("Could not request banner ad from adapter.", t);
            throw new RemoteException();
        }
    }
    
    public void b() {
        if (!(this.a instanceof e)) {
            et.e("MediationAdapter is not a MediationInterstitialAdapter: " + this.a.getClass().getCanonicalName());
            throw new RemoteException();
        }
        et.a("Showing interstitial from adapter.");
        try {
            ((e)this.a).d();
        }
        catch (Throwable t) {
            et.b("Could not show interstitial from adapter.", t);
            throw new RemoteException();
        }
    }
    
    public void c() {
        try {
            this.a.a();
        }
        catch (Throwable t) {
            et.b("Could not destroy adapter.", t);
            throw new RemoteException();
        }
    }
}

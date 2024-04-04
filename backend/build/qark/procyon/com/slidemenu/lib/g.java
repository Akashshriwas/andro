// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.slidemenu.lib;

import android.os.Handler;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;

public class g
{
    private Activity a;
    private SlidingMenu b;
    private View c;
    private View d;
    private boolean e;
    private boolean f;
    private boolean g;
    
    public g(final Activity a) {
        this.e = false;
        this.f = false;
        this.g = true;
        this.a = a;
    }
    
    public View a(final int n) {
        if (this.b != null) {
            final View viewById = this.b.findViewById(n);
            if (viewById != null) {
                return viewById;
            }
        }
        return null;
    }
    
    public SlidingMenu a() {
        return this.b;
    }
    
    public void a(final Bundle bundle) {
        this.b = (SlidingMenu)LayoutInflater.from((Context)this.a).inflate(2130903056, (ViewGroup)null);
    }
    
    public void a(final View c, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (!this.e) {
            this.c = c;
        }
    }
    
    public boolean a(final int n, final KeyEvent keyEvent) {
        if (n == 4 && this.b.c()) {
            this.b();
            return true;
        }
        return false;
    }
    
    public void b() {
        this.b.b();
    }
    
    public void b(final Bundle bundle) {
        int n = 1;
        boolean boolean1 = false;
        if (this.d == null || this.c == null) {
            throw new IllegalStateException("Both setBehindContentView must be called in onCreate in addition to setContentView.");
        }
        this.f = true;
        final SlidingMenu b = this.b;
        final Activity a = this.a;
        if (this.g) {
            n = 0;
        }
        b.a(a, n);
        boolean boolean2;
        if (bundle != null) {
            boolean2 = bundle.getBoolean("SlidingActivityHelper.open");
            boolean1 = bundle.getBoolean("SlidingActivityHelper.secondary");
        }
        else {
            boolean2 = false;
        }
        new Handler().post((Runnable)new h(this, boolean2, boolean1));
    }
    
    public void b(final View d, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.d = d;
        this.b.setMenu(this.d);
    }
    
    public void c() {
        this.b.a();
    }
    
    public void c(final Bundle bundle) {
        bundle.putBoolean("SlidingActivityHelper.open", this.b.c());
        bundle.putBoolean("SlidingActivityHelper.secondary", this.b.d());
    }
}

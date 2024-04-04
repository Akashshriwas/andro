/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.slidemenu.lib;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.slidemenu.lib.SlidingMenu;
import com.slidemenu.lib.h;

public class g {
    private Activity a;
    private SlidingMenu b;
    private View c;
    private View d;
    private boolean e = false;
    private boolean f = false;
    private boolean g = true;

    public g(Activity activity) {
        this.a = activity;
    }

    static /* synthetic */ SlidingMenu a(g g2) {
        return g2.b;
    }

    public View a(int n2) {
        View view;
        if (this.b != null && (view = this.b.findViewById(n2)) != null) {
            return view;
        }
        return null;
    }

    public SlidingMenu a() {
        return this.b;
    }

    public void a(Bundle bundle) {
        this.b = (SlidingMenu)LayoutInflater.from((Context)this.a).inflate(2130903056, null);
    }

    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        if (!this.e) {
            this.c = view;
        }
    }

    public boolean a(int n2, KeyEvent keyEvent) {
        if (n2 == 4 && this.b.c()) {
            this.b();
            return true;
        }
        return false;
    }

    public void b() {
        this.b.b();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(Bundle bundle) {
        boolean bl2;
        int n2 = 1;
        boolean bl3 = false;
        if (this.d == null || this.c == null) {
            throw new IllegalStateException("Both setBehindContentView must be called in onCreate in addition to setContentView.");
        }
        this.f = true;
        SlidingMenu slidingMenu = this.b;
        Activity activity = this.a;
        if (this.g) {
            n2 = 0;
        }
        slidingMenu.a(activity, n2);
        if (bundle != null) {
            bl2 = bundle.getBoolean("SlidingActivityHelper.open");
            bl3 = bundle.getBoolean("SlidingActivityHelper.secondary");
        } else {
            bl2 = false;
        }
        new Handler().post((Runnable)new h(this, bl2, bl3));
    }

    public void b(View view, ViewGroup.LayoutParams layoutParams) {
        this.d = view;
        this.b.setMenu(this.d);
    }

    public void c() {
        this.b.a();
    }

    public void c(Bundle bundle) {
        bundle.putBoolean("SlidingActivityHelper.open", this.b.c());
        bundle.putBoolean("SlidingActivityHelper.secondary", this.b.d());
    }
}


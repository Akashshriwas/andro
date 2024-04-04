/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
package com.slidemenu.lib;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.slidemenu.lib.SlidingMenu;
import com.slidemenu.lib.g;

public class i
extends android.support.v4.app.g {
    private g m;

    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        this.m.b(view, layoutParams);
    }

    public void b(int n2) {
        this.setBehindContentView(this.getLayoutInflater().inflate(n2, null));
    }

    public SlidingMenu f() {
        return this.m.a();
    }

    public View findViewById(int n2) {
        View view = super.findViewById(n2);
        if (view != null) {
            return view;
        }
        return this.m.a(n2);
    }

    public void g() {
        this.m.b();
    }

    public void h() {
        this.m.c();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.m = new g(this);
        this.m.a(bundle);
    }

    public boolean onKeyUp(int n2, KeyEvent keyEvent) {
        boolean bl2 = this.m.a(n2, keyEvent);
        if (bl2) {
            return bl2;
        }
        return super.onKeyUp(n2, keyEvent);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.m.b(bundle);
    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.m.c(bundle);
    }

    public void setBehindContentView(View view) {
        this.a(view, new ViewGroup.LayoutParams(-1, -1));
    }

    public void setContentView(int n2) {
        this.setContentView(this.getLayoutInflater().inflate(n2, null));
    }

    public void setContentView(View view) {
        this.setContentView(view, new ViewGroup.LayoutParams(-1, -1));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.m.a(view, layoutParams);
    }
}


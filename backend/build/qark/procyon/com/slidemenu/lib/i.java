// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.slidemenu.lib;

import android.view.KeyEvent;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.support.v4.app.g;

public class i extends g
{
    private com.slidemenu.lib.g m;
    
    public void a(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.m.b(view, viewGroup$LayoutParams);
    }
    
    public void b(final int n) {
        this.setBehindContentView(this.getLayoutInflater().inflate(n, (ViewGroup)null));
    }
    
    public SlidingMenu f() {
        return this.m.a();
    }
    
    public View findViewById(final int n) {
        final View viewById = super.findViewById(n);
        if (viewById != null) {
            return viewById;
        }
        return this.m.a(n);
    }
    
    public void g() {
        this.m.b();
    }
    
    public void h() {
        this.m.c();
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        (this.m = new com.slidemenu.lib.g(this)).a(bundle);
    }
    
    public boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        final boolean a = this.m.a(n, keyEvent);
        if (a) {
            return a;
        }
        return super.onKeyUp(n, keyEvent);
    }
    
    public void onPostCreate(final Bundle bundle) {
        super.onPostCreate(bundle);
        this.m.b(bundle);
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.m.c(bundle);
    }
    
    public void setBehindContentView(final View view) {
        this.a(view, new ViewGroup$LayoutParams(-1, -1));
    }
    
    public void setContentView(final int n) {
        this.setContentView(this.getLayoutInflater().inflate(n, (ViewGroup)null));
    }
    
    public void setContentView(final View view) {
        this.setContentView(view, new ViewGroup$LayoutParams(-1, -1));
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.setContentView(view, viewGroup$LayoutParams);
        this.m.a(view, viewGroup$LayoutParams);
    }
}

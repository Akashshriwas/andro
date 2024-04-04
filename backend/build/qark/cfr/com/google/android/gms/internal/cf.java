/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ce;
import com.google.android.gms.internal.ev;

final class cf {
    public final int a;
    public final ViewGroup.LayoutParams b;
    public final ViewGroup c;

    public cf(ev ev2) {
        this.b = ev2.getLayoutParams();
        ViewParent viewParent = ev2.getParent();
        if (viewParent instanceof ViewGroup) {
            this.c = (ViewGroup)viewParent;
            this.a = this.c.indexOfChild((View)ev2);
            this.c.removeView((View)ev2);
            ev2.a(true);
            return;
        }
        throw new ce("Could not get the parent of the WebView for an overlay.");
    }
}


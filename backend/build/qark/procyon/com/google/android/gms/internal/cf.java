// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.view.ViewParent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;

final class cf
{
    public final int a;
    public final ViewGroup$LayoutParams b;
    public final ViewGroup c;
    
    public cf(final ev ev) {
        this.b = ev.getLayoutParams();
        final ViewParent parent = ev.getParent();
        if (parent instanceof ViewGroup) {
            this.c = (ViewGroup)parent;
            this.a = this.c.indexOfChild((View)ev);
            this.c.removeView((View)ev);
            ev.a(true);
            return;
        }
        throw new ce("Could not get the parent of the WebView for an overlay.");
    }
}

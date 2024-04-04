// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.content.Context;
import android.widget.ViewSwitcher;

final class jv
{
    public final ViewSwitcher a;
    public final String b;
    public final Context c;
    public final is d;
    public final ct e;
    public b f;
    public ef g;
    public x h;
    public ec i;
    public k j;
    
    public jv(final Context c, final x h, final String b, final ct e) {
        if (h.f) {
            this.a = null;
        }
        else {
            (this.a = new ViewSwitcher(c)).setMinimumWidth(h.h);
            this.a.setMinimumHeight(h.e);
            this.a.setVisibility(4);
        }
        this.h = h;
        this.b = b;
        this.c = c;
        this.d = new is(ih.a(e.c, c));
        this.e = e;
    }
}

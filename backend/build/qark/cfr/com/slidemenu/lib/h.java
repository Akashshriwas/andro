/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.slidemenu.lib;

import com.slidemenu.lib.g;

class h
implements Runnable {
    final /* synthetic */ g a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ boolean c;

    h(g g2, boolean bl2, boolean bl3) {
        this.a = g2;
        this.b = bl2;
        this.c = bl3;
    }

    public void run() {
        if (this.b) {
            if (this.c) {
                g.a(this.a).b(false);
                return;
            }
            g.a(this.a).a(false);
            return;
        }
        g.a(this.a).c(false);
    }
}


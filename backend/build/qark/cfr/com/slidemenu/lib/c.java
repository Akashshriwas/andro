/*
 * Decompiled with CFR 0_124.
 */
package com.slidemenu.lib;

import com.slidemenu.lib.a;
import com.slidemenu.lib.e;

class c
extends e {
    final /* synthetic */ a a;

    c(a a2) {
        this.a = a2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(int n2) {
        if (a.a(this.a) == null) return;
        switch (n2) {
            default: {
                return;
            }
            case 0: 
            case 2: {
                a.a(this.a).setChildrenEnabled(true);
                return;
            }
            case 1: 
        }
        a.a(this.a).setChildrenEnabled(false);
    }
}


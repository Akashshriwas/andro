/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.slidemenu.lib;

import com.slidemenu.lib.SlidingMenu;
import com.slidemenu.lib.d;

class j
implements d {
    final /* synthetic */ SlidingMenu a;

    j(SlidingMenu slidingMenu) {
        this.a = slidingMenu;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(int n2) {
        if (n2 == 0 && SlidingMenu.a(this.a) != null) {
            SlidingMenu.a(this.a).b();
            return;
        } else {
            if (n2 == 1 && SlidingMenu.b(this.a) != null) {
                SlidingMenu.b(this.a).a();
                return;
            }
            if (n2 != 2 || SlidingMenu.c(this.a) == null) return;
            {
                SlidingMenu.c(this.a).b();
                return;
            }
        }
    }

    @Override
    public void a(int n2, float f2, int n3) {
    }
}


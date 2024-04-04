/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint
 *  android.util.Log
 *  android.view.View
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.slidemenu.lib;

import android.graphics.Paint;
import android.util.Log;
import android.view.View;
import com.slidemenu.lib.SlidingMenu;

class k
implements Runnable {
    final /* synthetic */ SlidingMenu a;
    private final /* synthetic */ int b;

    k(SlidingMenu slidingMenu, int n2) {
        this.a = slidingMenu;
        this.b = n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void run() {
        StringBuilder stringBuilder = new StringBuilder("changing layerType. hardware? ");
        boolean bl2 = this.b == 2;
        Log.v((String)"SlidingMenu", (String)stringBuilder.append(bl2).toString());
        this.a.getContent().setLayerType(this.b, null);
        this.a.getMenu().setLayerType(this.b, null);
        if (this.a.getSecondaryMenu() != null) {
            this.a.getSecondaryMenu().setLayerType(this.b, null);
        }
    }
}


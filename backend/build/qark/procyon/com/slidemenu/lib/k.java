// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.slidemenu.lib;

import android.graphics.Paint;
import android.util.Log;

class k implements Runnable
{
    final /* synthetic */ SlidingMenu a;
    private final /* synthetic */ int b;
    
    k(final SlidingMenu a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        Log.v("SlidingMenu", "changing layerType. hardware? " + (this.b == 2));
        this.a.getContent().setLayerType(this.b, (Paint)null);
        this.a.getMenu().setLayerType(this.b, (Paint)null);
        if (this.a.getSecondaryMenu() != null) {
            this.a.getSecondaryMenu().setLayerType(this.b, (Paint)null);
        }
    }
}

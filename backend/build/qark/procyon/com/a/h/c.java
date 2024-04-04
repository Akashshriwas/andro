// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.h;

import android.support.v4.app.g;
import android.content.Context;

class c implements Runnable
{
    private final /* synthetic */ Context a;
    
    c(final Context a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (b()) {
            ((g)this.a).runOnUiThread((Runnable)new d(this, this.a));
        }
    }
}

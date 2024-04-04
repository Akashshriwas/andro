// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.app;

import android.view.View;

class u implements Runnable
{
    final /* synthetic */ t a;
    
    u(final t a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.O.focusableViewAvailable((View)this.a.O);
    }
}

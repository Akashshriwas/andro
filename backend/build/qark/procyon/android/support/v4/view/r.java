// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.view;

import android.view.View;

class r implements w
{
    @Override
    public int a(final View view) {
        return 2;
    }
    
    long a() {
        return 10L;
    }
    
    @Override
    public boolean a(final View view, final int n) {
        return false;
    }
    
    @Override
    public void b(final View view) {
        view.postInvalidateDelayed(this.a());
    }
}

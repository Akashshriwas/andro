// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.view;

import android.database.DataSetObserver;

class an extends DataSetObserver
{
    final /* synthetic */ ViewPager a;
    
    private an(final ViewPager a) {
        this.a = a;
    }
    
    public void onChanged() {
        this.a.a();
    }
    
    public void onInvalidated() {
        this.a.a();
    }
}

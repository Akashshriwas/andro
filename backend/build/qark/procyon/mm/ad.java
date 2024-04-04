// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.widget.RelativeLayout;
import com.google.android.gms.ads.a;

class ad extends a
{
    final /* synthetic */ m a;
    private final /* synthetic */ RelativeLayout b;
    
    ad(final m a, final RelativeLayout b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void d() {
        super.d();
        this.b.setVisibility(0);
    }
}

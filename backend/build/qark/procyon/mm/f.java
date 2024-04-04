// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.view.View;
import android.view.View$OnClickListener;

class f implements View$OnClickListener
{
    final /* synthetic */ d a;
    
    f(final d a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        try {
            this.a.n();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

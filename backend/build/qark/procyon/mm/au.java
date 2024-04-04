// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import dn.a;
import android.view.View;
import android.view.View$OnClickListener;

class au implements View$OnClickListener
{
    final /* synthetic */ rc a;
    
    au(final rc a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        try {
            this.a.onBackPressed();
        }
        catch (Exception ex) {
            dn.a.a(view.getContext(), view.getResources().getString(2131230758));
        }
    }
}

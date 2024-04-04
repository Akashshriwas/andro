// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import dn.a;
import android.view.View;
import android.view.View$OnClickListener;

class am implements View$OnClickListener
{
    final /* synthetic */ pr a;
    
    am(final pr a) {
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

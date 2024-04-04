// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.view.View;
import android.view.View$OnClickListener;

class h implements View$OnClickListener
{
    final /* synthetic */ g a;
    
    h(final g a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        try {
            if (this.a.i != null) {
                this.a.i.a_(Integer.parseInt(view.getTag().toString()));
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

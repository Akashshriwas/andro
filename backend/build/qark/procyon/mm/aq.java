// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class aq implements DialogInterface$OnClickListener
{
    final /* synthetic */ rc a;
    
    aq(final rc a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
}

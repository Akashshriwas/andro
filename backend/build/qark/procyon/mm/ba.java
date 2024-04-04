// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import java.io.File;
import dn.a;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class ba implements DialogInterface$OnClickListener
{
    final /* synthetic */ rc a;
    
    ba(final rc a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        while (true) {
            try {
                final File file = new File(dn.a.d(this.a.p));
                if (dn.a.c(this.a.p) && file.delete()) {
                    this.a.u.setVisibility(8);
                    this.a.t.setVisibility(0);
                    this.a.v.setVisibility(8);
                    this.a.w.setVisibility(8);
                }
                dialogInterface.dismiss();
            }
            catch (Exception ex) {
                ex.printStackTrace();
                continue;
            }
            break;
        }
    }
}

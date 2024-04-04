/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.widget.Button
 *  java.io.File
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package mm;

import android.content.DialogInterface;
import android.widget.Button;
import dn.a;
import java.io.File;
import mm.rc;

class ba
implements DialogInterface.OnClickListener {
    final /* synthetic */ rc a;

    ba(rc rc2) {
        this.a = rc2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onClick(DialogInterface dialogInterface, int n2) {
        try {
            File file = new File(a.d(this.a.p));
            if (a.c(this.a.p).booleanValue() && file.delete()) {
                this.a.u.setVisibility(8);
                this.a.t.setVisibility(0);
                this.a.v.setVisibility(8);
                this.a.w.setVisibility(8);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        dialogInterface.dismiss();
    }
}


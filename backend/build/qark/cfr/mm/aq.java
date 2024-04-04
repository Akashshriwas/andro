/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  java.lang.Object
 */
package mm;

import android.content.DialogInterface;
import mm.rc;

class aq
implements DialogInterface.OnClickListener {
    final /* synthetic */ rc a;

    aq(rc rc2) {
        this.a = rc2;
    }

    public void onClick(DialogInterface dialogInterface, int n2) {
        dialogInterface.dismiss();
    }
}


/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Exception
 *  java.lang.Object
 */
package com.a.b;

import android.app.AlertDialog;
import android.view.View;
import com.a.b.d;

class e
implements View.OnClickListener {
    final /* synthetic */ d a;

    e(d d2) {
        this.a = d2;
    }

    public void onClick(View view) {
        try {
            this.a.e.dismiss();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }
}


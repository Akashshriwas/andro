/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package com.a.b;

import android.app.AlertDialog;
import android.view.View;
import com.a.b.b;

class c
implements View.OnClickListener {
    final /* synthetic */ b a;

    c(b b2) {
        this.a = b2;
    }

    public void onClick(View view) {
        try {
            this.a.g.dismiss();
            b.a(this.a, this.a.c());
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }
}


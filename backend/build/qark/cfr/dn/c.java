/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Exception
 *  java.lang.Object
 */
package dn;

import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import dn.b;

class c
implements View.OnClickListener {
    private final /* synthetic */ Context a;
    private final /* synthetic */ SharedPreferences.Editor b;

    c(Context context, SharedPreferences.Editor editor) {
        this.a = context;
        this.b = editor;
    }

    public void onClick(View view) {
        try {
            b.a.cancel();
            b.b(this.a, this.b);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }
}


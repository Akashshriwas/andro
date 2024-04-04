/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package dn;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.view.View;
import dn.b;

class d
implements View.OnClickListener {
    private final /* synthetic */ SharedPreferences.Editor a;

    d(SharedPreferences.Editor editor) {
        this.a = editor;
    }

    public void onClick(View view) {
        try {
            if (this.a != null) {
                this.a.putLong("date_reminder_pressed", System.currentTimeMillis());
                this.a.commit();
                b.a.cancel();
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }
}


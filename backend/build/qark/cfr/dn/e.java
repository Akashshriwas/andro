/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package dn;

import android.content.Context;
import android.util.Log;
import android.view.View;
import dn.a;
import dn.b;

class e
implements View.OnClickListener {
    e() {
    }

    public void onClick(View view) {
        try {
            a.b(b.b);
            return;
        }
        catch (Exception exception) {
            Log.w((String)"click_facebook", (String)exception.toString());
            exception.printStackTrace();
            return;
        }
    }
}


/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.MutableContextWrapper
 */
package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

class ew
extends MutableContextWrapper {
    private Activity a;
    private Context b;

    public ew(Context context) {
        super(context);
        this.setBaseContext(context);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setBaseContext(Context context) {
        this.b = context.getApplicationContext();
        context = context instanceof Activity ? (Activity)context : null;
        this.a = context;
        super.setBaseContext(this.b);
    }

    public void startActivity(Intent intent) {
        if (this.a != null) {
            this.a.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.b.startActivity(intent);
    }
}


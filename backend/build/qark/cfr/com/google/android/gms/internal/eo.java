/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.em;
import com.google.android.gms.internal.en;

final class eo
extends BroadcastReceiver {
    private eo() {
    }

    /* synthetic */ eo(en en2) {
        this();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals((Object)intent.getAction())) {
            em.a(true);
            return;
        } else {
            if (!"android.intent.action.SCREEN_OFF".equals((Object)intent.getAction())) return;
            {
                em.a(false);
                return;
            }
        }
    }
}


// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

final class eo extends BroadcastReceiver
{
    private eo() {
    }
    
    public void onReceive(final Context context, final Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            em.b = true;
        }
        else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            em.b = false;
        }
    }
}

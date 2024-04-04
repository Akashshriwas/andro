/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 */
package android.support.v4.content;

import android.content.Context;
import android.content.Intent;

class ContextCompatHoneycomb {
    ContextCompatHoneycomb() {
    }

    static void startActivities(Context context, Intent[] arrintent) {
        context.startActivities(arrintent);
    }
}


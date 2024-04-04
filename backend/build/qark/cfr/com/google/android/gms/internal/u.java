/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.gms.internal.ad;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ev;
import java.util.HashMap;
import java.util.Map;

final class u
implements ad {
    u() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(ev ev2, Map object) {
        if ((object = (String)object.get((Object)"urls")) == null) {
            et.e("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] arrstring = object.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = ev2.getContext().getPackageManager();
        int n2 = arrstring.length;
        int n3 = 0;
        do {
            if (n3 >= n2) {
                ev2.a("openableURLs", (Map)hashMap);
                return;
            }
            String string = arrstring[n3];
            object = string.split(";", 2);
            String string2 = object[0].trim();
            object = object.length > 1 ? object[1].trim() : "android.intent.action.VIEW";
            boolean bl2 = packageManager.resolveActivity(new Intent((String)object, Uri.parse((String)string2)), 65536) != null;
            hashMap.put((Object)string, (Object)bl2);
            ++n3;
        } while (true);
    }
}


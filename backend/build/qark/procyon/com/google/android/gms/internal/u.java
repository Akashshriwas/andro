// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.content.pm.PackageManager;
import android.content.Intent;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

final class u implements ad
{
    @Override
    public void a(final ev ev, final Map map) {
        final String s = map.get("urls");
        if (s == null) {
            et.e("URLs missing in canOpenURLs GMSG.");
            return;
        }
        final String[] split = s.split(",");
        final HashMap<String, Boolean> hashMap = new HashMap<String, Boolean>();
        final PackageManager packageManager = ev.getContext().getPackageManager();
        for (int length = split.length, i = 0; i < length; ++i) {
            final String key = split[i];
            final String[] split2 = key.split(";", 2);
            final String trim = split2[0].trim();
            String trim2;
            if (split2.length > 1) {
                trim2 = split2[1].trim();
            }
            else {
                trim2 = "android.intent.action.VIEW";
            }
            hashMap.put(key, packageManager.resolveActivity(new Intent(trim2, Uri.parse(trim)), 65536) != null);
        }
        ev.a("openableURLs", hashMap);
    }
}

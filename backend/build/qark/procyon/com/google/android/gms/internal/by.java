// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.text.TextUtils;
import android.content.Intent;
import android.content.Context;

public final class by
{
    public static boolean a(final Context context, final bj bj, final cm cm) {
        if (bj == null) {
            et.e("No intent data for launcher overlay.");
            return false;
        }
        final Intent obj = new Intent();
        if (TextUtils.isEmpty((CharSequence)bj.d)) {
            et.e("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty((CharSequence)bj.e)) {
            obj.setDataAndType(Uri.parse(bj.d), bj.e);
        }
        else {
            obj.setData(Uri.parse(bj.d));
        }
        obj.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty((CharSequence)bj.f)) {
            obj.setPackage(bj.f);
        }
        if (!TextUtils.isEmpty((CharSequence)bj.g)) {
            final String[] split = bj.g.split("/", 2);
            if (split.length < 2) {
                et.e("Could not parse component name from open GMSG: " + bj.g);
                return false;
            }
            obj.setClassName(split[0], split[1]);
        }
        try {
            et.d("Launching an intent: " + obj);
            context.startActivity(obj);
            cm.q();
            return true;
        }
        catch (ActivityNotFoundException ex) {
            et.e(ex.getMessage());
            return false;
        }
    }
}

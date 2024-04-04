/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.bj;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.et;

public final class by {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(Context context, bj bj2, cm cm2) {
        if (bj2 == null) {
            et.e("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty((CharSequence)bj2.d)) {
            et.e("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty((CharSequence)bj2.e)) {
            intent.setDataAndType(Uri.parse((String)bj2.d), bj2.e);
        } else {
            intent.setData(Uri.parse((String)bj2.d));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty((CharSequence)bj2.f)) {
            intent.setPackage(bj2.f);
        }
        if (!TextUtils.isEmpty((CharSequence)bj2.g)) {
            String[] arrstring = bj2.g.split("/", 2);
            if (arrstring.length < 2) {
                et.e("Could not parse component name from open GMSG: " + bj2.g);
                return false;
            }
            intent.setClassName(arrstring[0], arrstring[1]);
        }
        try {
            et.d("Launching an intent: " + (Object)intent);
            context.startActivity(intent);
            cm2.q();
            return true;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            et.e(activityNotFoundException.getMessage());
            return false;
        }
    }
}


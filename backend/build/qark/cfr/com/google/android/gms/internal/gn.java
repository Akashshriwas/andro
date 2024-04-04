/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

public class gn {
    private static final Uri a = Uri.parse((String)"http://plus.google.com/");
    private static final Uri b = a.buildUpon().appendPath("circles").appendPath("find").build();

    public static Intent a() {
        return new Intent("android.settings.DATE_SETTINGS");
    }

    public static Intent a(String string) {
        string = Uri.fromParts((String)"package", (String)string, (String)null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData((Uri)string);
        return intent;
    }

    public static Intent b(String string) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(gn.d(string));
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    public static Intent c(String string) {
        string = Uri.parse((String)("bazaar://search?q=pname:" + string));
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData((Uri)string);
        intent.setFlags(524288);
        return intent;
    }

    private static Uri d(String string) {
        return Uri.parse((String)"market://details").buildUpon().appendQueryParameter("id", string).build();
    }
}


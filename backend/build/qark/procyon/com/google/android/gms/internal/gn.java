// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

public class gn
{
    private static final Uri a;
    private static final Uri b;
    
    static {
        a = Uri.parse("http://plus.google.com/");
        b = gn.a.buildUpon().appendPath("circles").appendPath("find").build();
    }
    
    public static Intent a() {
        return new Intent("android.settings.DATE_SETTINGS");
    }
    
    public static Intent a(final String s) {
        final Uri fromParts = Uri.fromParts("package", s, (String)null);
        final Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }
    
    public static Intent b(final String s) {
        final Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(d(s));
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }
    
    public static Intent c(final String str) {
        final Uri parse = Uri.parse("bazaar://search?q=pname:" + str);
        final Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        intent.setFlags(524288);
        return intent;
    }
    
    private static Uri d(final String s) {
        return Uri.parse("market://details").buildUpon().appendQueryParameter("id", s).build();
    }
}

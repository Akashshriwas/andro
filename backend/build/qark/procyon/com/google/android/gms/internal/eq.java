// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.webkit.WebSettings;
import android.content.Context;

public final class eq
{
    public static String a(final Context context) {
        return WebSettings.getDefaultUserAgent(context);
    }
    
    public static void a(final Context context, final WebSettings webSettings) {
        ep.a(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }
}

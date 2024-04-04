/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.webkit.WebChromeClient
 *  android.webkit.WebChromeClient$CustomViewCallback
 */
package com.google.android.gms.internal;

import android.view.View;
import android.webkit.WebChromeClient;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.fb;

public final class fk
extends fb {
    public fk(ev ev2) {
        super(ev2);
    }

    public void onShowCustomView(View view, int n2, WebChromeClient.CustomViewCallback customViewCallback) {
        this.a(view, n2, customViewCallback);
    }
}


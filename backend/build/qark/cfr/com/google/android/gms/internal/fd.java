/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.webkit.JsResult
 *  java.lang.Object
 */
package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsResult;

final class fd
implements DialogInterface.OnClickListener {
    final /* synthetic */ JsResult a;

    fd(JsResult jsResult) {
        this.a = jsResult;
    }

    public void onClick(DialogInterface dialogInterface, int n2) {
        this.a.cancel();
    }
}


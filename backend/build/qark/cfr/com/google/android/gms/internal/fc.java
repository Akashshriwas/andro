/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.webkit.JsResult
 *  java.lang.Object
 */
package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsResult;

final class fc
implements DialogInterface.OnCancelListener {
    final /* synthetic */ JsResult a;

    fc(JsResult jsResult) {
        this.a = jsResult;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.cancel();
    }
}


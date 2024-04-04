/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.webkit.JsPromptResult
 *  java.lang.Object
 */
package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class ff
implements DialogInterface.OnCancelListener {
    final /* synthetic */ JsPromptResult a;

    ff(JsPromptResult jsPromptResult) {
        this.a = jsPromptResult;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.cancel();
    }
}


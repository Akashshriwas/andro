/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.webkit.JsPromptResult
 *  java.lang.Object
 */
package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class fg
implements DialogInterface.OnClickListener {
    final /* synthetic */ JsPromptResult a;

    fg(JsPromptResult jsPromptResult) {
        this.a = jsPromptResult;
    }

    public void onClick(DialogInterface dialogInterface, int n2) {
        this.a.cancel();
    }
}


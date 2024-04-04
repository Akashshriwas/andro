/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.text.Editable
 *  android.webkit.JsPromptResult
 *  android.widget.EditText
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.text.Editable;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class fh
implements DialogInterface.OnClickListener {
    final /* synthetic */ JsPromptResult a;
    final /* synthetic */ EditText b;

    fh(JsPromptResult jsPromptResult, EditText editText) {
        this.a = jsPromptResult;
        this.b = editText;
    }

    public void onClick(DialogInterface dialogInterface, int n2) {
        this.a.confirm(this.b.getText().toString());
    }
}


// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.widget.EditText;
import android.webkit.JsPromptResult;
import android.content.DialogInterface$OnClickListener;

final class fh implements DialogInterface$OnClickListener
{
    final /* synthetic */ JsPromptResult a;
    final /* synthetic */ EditText b;
    
    fh(final JsPromptResult a, final EditText b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.confirm(this.b.getText().toString());
    }
}

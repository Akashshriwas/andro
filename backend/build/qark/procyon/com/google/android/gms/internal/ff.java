// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.content.DialogInterface$OnCancelListener;

final class ff implements DialogInterface$OnCancelListener
{
    final /* synthetic */ JsPromptResult a;
    
    ff(final JsPromptResult a) {
        this.a = a;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.a.cancel();
    }
}

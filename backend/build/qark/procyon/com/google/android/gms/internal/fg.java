// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.content.DialogInterface$OnClickListener;

final class fg implements DialogInterface$OnClickListener
{
    final /* synthetic */ JsPromptResult a;
    
    fg(final JsPromptResult a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.cancel();
    }
}

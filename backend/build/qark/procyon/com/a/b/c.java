// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.b;

import android.view.View;
import android.view.View$OnClickListener;

class c implements View$OnClickListener
{
    final /* synthetic */ b a;
    
    c(final b a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        try {
            this.a.g.dismiss();
            this.a.a(this.a.c());
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

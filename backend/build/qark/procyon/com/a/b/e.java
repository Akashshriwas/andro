// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.b;

import android.view.View;
import android.view.View$OnClickListener;

class e implements View$OnClickListener
{
    final /* synthetic */ d a;
    
    e(final d a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        try {
            this.a.e.dismiss();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package dn;

import android.view.View;
import android.content.SharedPreferences$Editor;
import android.content.Context;
import android.view.View$OnClickListener;

class c implements View$OnClickListener
{
    private final /* synthetic */ Context a;
    private final /* synthetic */ SharedPreferences$Editor b;
    
    c(final Context a, final SharedPreferences$Editor b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        try {
            dn.b.a.cancel();
            c(this.a, this.b);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

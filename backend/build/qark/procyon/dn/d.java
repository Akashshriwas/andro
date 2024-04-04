// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package dn;

import android.view.View;
import android.content.SharedPreferences$Editor;
import android.view.View$OnClickListener;

class d implements View$OnClickListener
{
    private final /* synthetic */ SharedPreferences$Editor a;
    
    d(final SharedPreferences$Editor a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        try {
            if (this.a != null) {
                this.a.putLong("date_reminder_pressed", System.currentTimeMillis());
                this.a.commit();
                b.a.cancel();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

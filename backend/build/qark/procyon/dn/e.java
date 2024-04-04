// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package dn;

import android.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class e implements View$OnClickListener
{
    public void onClick(final View view) {
        try {
            a.b(b.b);
        }
        catch (Exception ex) {
            Log.w("click_facebook", ex.toString());
            ex.printStackTrace();
        }
    }
}

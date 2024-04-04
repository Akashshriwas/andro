// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.b;

import android.util.Log;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Bundle;
import android.content.Context;
import android.app.ProgressDialog;

public class a extends ProgressDialog
{
    Context a;
    
    public a(final Context a) {
        super(a);
        this.a = a;
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        try {
            final TextView textView = (TextView)this.findViewById(16908299);
            textView.setTextColor(2131099659);
            final ViewGroup viewGroup = (ViewGroup)((View)textView.getParent()).getParent().getParent().getParent();
            viewGroup.setPadding(((Activity)this.a).getWindowManager().getDefaultDisplay().getWidth() / 3, 0, 0, 0);
            viewGroup.setBackgroundDrawable((Drawable)new ColorDrawable(0));
        }
        catch (Exception ex) {
            Log.w("HKLoadDialog", ex.toString());
        }
    }
}

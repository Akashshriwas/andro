/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.Display
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.view.WindowManager
 *  android.widget.TextView
 *  java.lang.Exception
 *  java.lang.String
 */
package com.a.b;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.TextView;

public class a
extends ProgressDialog {
    Context a;

    public a(Context context) {
        super(context);
        this.a = context;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            bundle = (TextView)this.findViewById(16908299);
            bundle.setTextColor(2131099659);
            bundle = (ViewGroup)((View)bundle.getParent()).getParent().getParent().getParent();
            bundle.setPadding(((Activity)this.a).getWindowManager().getDefaultDisplay().getWidth() / 3, 0, 0, 0);
            bundle.setBackgroundDrawable((Drawable)new ColorDrawable(0));
            return;
        }
        catch (Exception exception) {
            Log.w((String)"HKLoadDialog", (String)exception.toString());
            return;
        }
    }
}


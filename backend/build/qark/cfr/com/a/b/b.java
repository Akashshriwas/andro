/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.widget.Button
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.a.b;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.TextView;
import com.a.b.c;

public class b {
    Context a;
    String b;
    String c;
    AlertDialog.Builder d;
    public Button e;
    View f;
    AlertDialog g;
    private View.OnClickListener h;

    public b(Context context, String string, String string2) {
        this.h = new c(this);
        this.a = context;
        this.b = string;
        this.c = string2;
        this.d = new AlertDialog.Builder(context);
        this.f = View.inflate((Context)context, (int)2130903058, (ViewGroup)null);
        ((TextView)this.f.findViewById(2131165230)).setText((CharSequence)string);
        this.e = (Button)this.f.findViewById(2131165233);
        this.e.setOnClickListener(this.h);
        this.d.setView(this.f);
        this.g = this.d.create();
        this.d.setInverseBackgroundForced(true);
    }

    static /* synthetic */ void a(b b2, String string) {
        b2.a(string);
    }

    private void a(String string) {
        if (this.b() != null) {
            string = "market://details?id=".concat(string);
            this.b().startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)string)));
        }
    }

    public void a() {
        this.g.show();
        ViewGroup viewGroup = (ViewGroup)this.f.getParent();
        viewGroup.setPadding(0, 0, 0, 0);
        viewGroup.setBackgroundDrawable((Drawable)new ColorDrawable(0));
    }

    public Context b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }
}


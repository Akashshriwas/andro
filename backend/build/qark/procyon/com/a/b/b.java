// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.b;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog$Builder;
import android.content.Context;

public class b
{
    Context a;
    String b;
    String c;
    AlertDialog$Builder d;
    public Button e;
    View f;
    AlertDialog g;
    private View$OnClickListener h;
    
    public b(final Context a, final String s, final String c) {
        this.h = (View$OnClickListener)new c(this);
        this.a = a;
        this.b = s;
        this.c = c;
        this.d = new AlertDialog$Builder(a);
        this.f = View.inflate(a, 2130903058, (ViewGroup)null);
        ((TextView)this.f.findViewById(2131165230)).setText((CharSequence)s);
        (this.e = (Button)this.f.findViewById(2131165233)).setOnClickListener(this.h);
        this.d.setView(this.f);
        this.g = this.d.create();
        this.d.setInverseBackgroundForced(true);
    }
    
    private void a(String concat) {
        if (this.b() != null) {
            concat = "market://details?id=".concat(concat);
            this.b().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(concat)));
        }
    }
    
    public void a() {
        this.g.show();
        final ViewGroup viewGroup = (ViewGroup)this.f.getParent();
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

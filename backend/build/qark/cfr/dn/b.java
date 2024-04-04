/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.net.Uri
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  java.lang.Object
 *  java.lang.String
 */
package dn;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import dn.c;
import dn.d;
import dn.e;

public class b {
    static AlertDialog a;
    static Context b;

    public static void a(Context context, SharedPreferences.Editor editor) {
        b = context;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LinearLayout linearLayout = (LinearLayout)LayoutInflater.from((Context)context).inflate(2130903072, null);
        ((LinearLayout)linearLayout.findViewById(2131165251)).setOnClickListener((View.OnClickListener)new c(context, editor));
        ((LinearLayout)linearLayout.findViewById(2131165253)).setOnClickListener((View.OnClickListener)new d(editor));
        ((LinearLayout)linearLayout.findViewById(2131165252)).setOnClickListener((View.OnClickListener)new e());
        builder.setView((View)linearLayout);
        a = builder.create();
        a.show();
    }

    static /* synthetic */ void b(Context context, SharedPreferences.Editor editor) {
        b.c(context, editor);
    }

    private static void c(Context context, SharedPreferences.Editor editor) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)String.format((String)context.getString(2131230794), (Object[])new Object[]{context.getPackageName()}))));
        b = context;
        if (editor != null) {
            editor.putBoolean("rateclicked", true);
            editor.commit();
        }
    }
}


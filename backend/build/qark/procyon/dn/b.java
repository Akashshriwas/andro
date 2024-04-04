// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package dn;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.app.AlertDialog$Builder;
import android.content.SharedPreferences$Editor;
import android.content.Context;
import android.app.AlertDialog;

public class b
{
    static AlertDialog a;
    static Context b;
    
    public static void a(final Context b, final SharedPreferences$Editor sharedPreferences$Editor) {
        b.b = b;
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b);
        final LinearLayout view = (LinearLayout)LayoutInflater.from(b).inflate(2130903072, (ViewGroup)null);
        ((LinearLayout)view.findViewById(2131165251)).setOnClickListener((View$OnClickListener)new c(b, sharedPreferences$Editor));
        ((LinearLayout)view.findViewById(2131165253)).setOnClickListener((View$OnClickListener)new d(sharedPreferences$Editor));
        ((LinearLayout)view.findViewById(2131165252)).setOnClickListener((View$OnClickListener)new e());
        alertDialog$Builder.setView((View)view);
        (b.a = alertDialog$Builder.create()).show();
    }
    
    private static void c(final Context b, final SharedPreferences$Editor sharedPreferences$Editor) {
        b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(b.getString(2131230794), b.getPackageName()))));
        b.b = b;
        if (sharedPreferences$Editor != null) {
            sharedPreferences$Editor.putBoolean("rateclicked", true);
            sharedPreferences$Editor.commit();
        }
    }
}

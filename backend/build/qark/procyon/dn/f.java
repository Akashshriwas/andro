// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package dn;

import android.preference.PreferenceManager;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;

public class f
{
    public static String a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    public static int g;
    public static int h;
    public static String i;
    public static String j;
    public static String k;
    public static String l;
    public static String m;
    public static String n;
    private static f o;
    private SharedPreferences p;
    private SharedPreferences$Editor q;
    
    static {
        dn.f.a = "PopupSelectedIndex";
        dn.f.b = "HeaderName";
        dn.f.c = "SELECTEDID";
        dn.f.d = "KeywordSearch";
        dn.f.e = "URLAudio";
        dn.f.f = "APPJSON";
        dn.f.g = 4;
        dn.f.h = 4;
        dn.f.i = "ca-app-pub-8587596210307129/3803803295";
        dn.f.j = "ca-app-pub-8587596210307129/3489184898";
        dn.f.k = ".info/config/conversationgb.txt";
        dn.f.l = "DBVersionKey";
        dn.f.m = "AppVersionKey";
        dn.f.n = "PRApp";
    }
    
    private f() {
        this.p = PreferenceManager.getDefaultSharedPreferences(hs.a());
        this.q = this.p.edit();
    }
    
    public static f a() {
        if (dn.f.o == null) {
            dn.f.o = new f();
        }
        return dn.f.o;
    }
    
    public f a(final String s, final int n) {
        this.q.remove(s);
        this.q.putInt(s, n);
        this.q.commit();
        return this;
    }
    
    public f a(final String s, final String s2) {
        this.q.remove(s);
        this.q.putString(s, s2);
        this.q.commit();
        return this;
    }
    
    public String a(final String s) {
        return this.p.getString(s, (String)null);
    }
    
    public boolean a(final String s, final boolean b) {
        return this.p.getBoolean(s, b);
    }
    
    public int b(final String s) {
        return this.p.getInt(s, -1);
    }
    
    public f b(final String s, final boolean b) {
        this.q.remove(s);
        this.q.commit();
        this.q.putBoolean(s, b);
        this.q.commit();
        return this;
    }
    
    public void b() {
        this.c("PopupSelectedIndex");
        this.c("HeaderName");
    }
    
    public void c(final String s) {
        this.q.remove(s);
        this.q.commit();
    }
}

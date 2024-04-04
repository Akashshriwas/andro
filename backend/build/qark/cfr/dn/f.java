/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.preference.PreferenceManager
 *  java.lang.Object
 *  java.lang.String
 */
package dn;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import dn.hs;

public class f {
    public static String a = "PopupSelectedIndex";
    public static String b = "HeaderName";
    public static String c = "SELECTEDID";
    public static String d = "KeywordSearch";
    public static String e = "URLAudio";
    public static String f = "APPJSON";
    public static int g = 4;
    public static int h = 4;
    public static String i = "ca-app-pub-8587596210307129/3803803295";
    public static String j = "ca-app-pub-8587596210307129/3489184898";
    public static String k = ".info/config/conversationgb.txt";
    public static String l = "DBVersionKey";
    public static String m = "AppVersionKey";
    public static String n = "PRApp";
    private static f o;
    private SharedPreferences p = PreferenceManager.getDefaultSharedPreferences((Context)hs.a());
    private SharedPreferences.Editor q = this.p.edit();

    private f() {
    }

    public static f a() {
        if (o == null) {
            o = new f();
        }
        return o;
    }

    public f a(String string, int n2) {
        this.q.remove(string);
        this.q.putInt(string, n2);
        this.q.commit();
        return this;
    }

    public f a(String string, String string2) {
        this.q.remove(string);
        this.q.putString(string, string2);
        this.q.commit();
        return this;
    }

    public String a(String string) {
        return this.p.getString(string, null);
    }

    public boolean a(String string, boolean bl2) {
        return this.p.getBoolean(string, bl2);
    }

    public int b(String string) {
        return this.p.getInt(string, -1);
    }

    public f b(String string, boolean bl2) {
        this.q.remove(string);
        this.q.commit();
        this.q.putBoolean(string, bl2);
        this.q.commit();
        return this;
    }

    public void b() {
        this.c("PopupSelectedIndex");
        this.c("HeaderName");
    }

    public void c(String string) {
        this.q.remove(string);
        this.q.commit();
    }
}


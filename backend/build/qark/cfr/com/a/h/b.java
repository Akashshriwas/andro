/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  java.io.BufferedInputStream
 *  java.io.BufferedReader
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.Locale
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.a.h;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.a.h.a;
import com.a.h.c;
import dn.f;
import dn.g;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static a a(String object) {
        a a2 = new a();
        object = new JSONObject((String)object);
        a2.d(object.getString("adsLinkEN"));
        a2.c(object.getString("adsLinkVN"));
        a2.f(object.getString("adsTitleEN"));
        a2.e(object.getString("adsTitleVI"));
        a2.b(object.getInt("adsVersion"));
        a2.a(object.getInt("appVersion"));
        a2.b(object.getString("appVersionTitleEN"));
        a2.a(object.getString("appVersionTitleVI"));
        a2.a(object.getBoolean("notified"));
        a2.g(object.getString("serverLink"));
        return a2;
        catch (JSONException jSONException) {
            block4 : {
                object = null;
                break block4;
                catch (JSONException jSONException2) {
                    object = a2;
                    a2 = jSONException2;
                }
            }
            a2.printStackTrace();
            return object;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String a(InputStream var0) {
        try {
            var2_4 = new BufferedReader((Reader)new InputStreamReader((InputStream)var0));
            var0 = "";
        }
        catch (Exception var3_10) {
            var2_4 = null;
            var0 = "";
lbl23: // 2 sources:
            var1_5 = var2_4;
            var3_11.printStackTrace();
            var1_5 = var0;
            if (var2_4 == null) return var1_5;
            try {
                var2_4.close();
                return var0;
            }
            catch (IOException var1_6) {
                var1_6.printStackTrace();
                return var0;
            }
        }
        catch (Throwable var0_1) {
            var1_5 = null;
lbl36: // 2 sources:
            do {
                if (var1_5 == null) throw var0_2;
                try {
                    var1_5.close();
                }
                catch (IOException var1_7) {
                    var1_7.printStackTrace();
                    throw var0_2;
                }
                do {
                    throw var0_2;
                    break;
                } while (true);
                break;
            } while (true);
        }
        do {
            block18 : {
                var1_5 = var2_4;
                var3_9 = var2_4.readLine();
                if (var3_9 != null) break block18;
                var1_5 = var0;
                if (var2_4 == null) return var1_5;
                var2_4.close();
                return var0;
            }
            var1_5 = var2_4;
            var3_9 = String.valueOf((Object)var0) + var3_9;
            var0 = var3_9;
            continue;
            break;
        } while (true);
        catch (IOException var1_8) {
            var1_8.printStackTrace();
            return var0;
        }
        {
            catch (Throwable var0_3) {
                ** continue;
            }
        }
        catch (Exception var3_12) {
            ** GOTO lbl23
        }
    }

    public static void a(Context context) {
        if (dn.a.a() && context != null) {
            new Thread((Runnable)new c(context)).start();
        }
    }

    static /* synthetic */ boolean a() {
        return b.b();
    }

    private static boolean a(String string, Context context) {
        context = context.getPackageManager();
        try {
            context.getPackageInfo(string, 1);
            return true;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return false;
        }
    }

    static /* synthetic */ void b(Context context) {
        b.c(context);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static boolean b() {
        block8 : {
            var1 = null;
            var0_3 = (HttpURLConnection)new URL(String.format((String)"%s%s%s", (Object[])new Object[]{g.a, com.a.a.b.a, f.k})).openConnection();
            var1 = b.a((InputStream)new BufferedInputStream(var0_3.getInputStream()));
            if (var1 == null || var1.length() <= 0) break block8;
            f.a().a(f.f, (String)var1);
        }
        var0_3.disconnect();
        return true;
        catch (Exception var1_1) {
            block9 : {
                var0_3 = null;
                break block9;
                catch (Throwable var0_4) {}
                ** GOTO lbl-1000
                catch (Throwable var2_5) {
                    var1 = var0_3;
                    var0_3 = var2_5;
                    ** GOTO lbl-1000
                }
                catch (Exception var1_2) {}
            }
            try {
                var1.printStackTrace();
            }
            catch (Throwable var2_6) {
                var1 = var0_3;
                var0_3 = var2_6;
            }
            var0_3.disconnect();
            return false;
        }
lbl-1000: // 3 sources:
        {
            var1.disconnect();
            throw var0_3;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static void c(Context var0) {
        try {
            block10 : {
                block9 : {
                    block8 : {
                        block7 : {
                            var4_2 = f.a().a(f.f);
                            if (dn.a.a() == false) return;
                            if (var4_2 == null) return;
                            var6_3 = b.a((String)var4_2);
                            if (var6_3 == null) return;
                            var1_4 = f.a().b(f.m);
                            var2_5 = var6_3.a();
                            if (var1_4 == -1) {
                                var1_4 = var2_5;
                            }
                            var5_6 = null;
                            if (var6_3.i() != null) {
                                f.a().a(f.e, var6_3.i());
                            }
                            if (var6_3.d == false) return;
                            if (var2_5 <= var1_4) break block7;
                            var4_2 = Locale.getDefault().getLanguage().equalsIgnoreCase("en") != false ? var6_3.c() : var6_3.b();
                            var4_2 = new com.a.b.b(var0, (String)var4_2, var0.getPackageName());
                            break block8;
                        }
                        var1_4 = var3_7 = f.a().b(f.n);
                        if (var3_7 == -1) {
                            var1_4 = var6_3.h();
                        }
                        var4_2 = var5_6;
                        if (var6_3.h() <= var1_4) break block8;
                        var4_2 = var5_6;
                        if (b.a(var6_3.e(), var0)) break block8;
                        var4_2 = var5_6;
                        if (b.a(var6_3.d(), var0)) break block8;
                        if (!Locale.getDefault().getLanguage().equalsIgnoreCase("en")) break block9;
                        var4_2 = var6_3.g();
                        var5_6 = var6_3.e();
                        break block10;
                    }
lbl34: // 2 sources:
                    do {
                        f.a().a(f.m, var2_5);
                        f.a().a(f.n, var6_3.h());
                        if (var4_2 == null) return;
                        var4_2.a();
                        return;
                        break;
                    } while (true);
                }
                var4_2 = var6_3.f();
                var5_6 = var6_3.d();
            }
            var4_2 = new com.a.b.b(var0, (String)var4_2, var5_6);
            ** continue;
        }
        catch (Exception var0_1) {
            var0_1.printStackTrace();
            return;
        }
    }
}


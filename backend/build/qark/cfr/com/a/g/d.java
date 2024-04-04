/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.FileOutputStream
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.Future
 */
package com.a.g;

import android.content.Context;
import com.a.g.e;
import com.a.g.f;
import dn.a;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class d {
    ExecutorService a;

    public d(Context context) {
        a.b();
        this.a = Executors.newFixedThreadPool((int)5);
    }

    static /* synthetic */ void a(d d2, String string, String string2) {
        d2.c(string, string2);
    }

    private void b(String object, String string) {
        object = new e(this, (String)object, string);
        this.a.submit((Runnable)new f(this, (e)object));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c(String string, String string2) {
        block4 : {
            try {
                string = (HttpURLConnection)new URL(string).openConnection();
                string.setConnectTimeout(30000);
                string.setReadTimeout(30000);
                string.setInstanceFollowRedirects(true);
                InputStream inputStream = string.getInputStream();
                if (inputStream == null) break block4;
                string2 = new FileOutputStream(a.a(string2));
                byte[] arrby = new byte[1024];
                do {
                    int n2;
                    if ((n2 = inputStream.read(arrby)) == -1) {
                        inputStream.close();
                        string2.flush();
                        string2.close();
                        break;
                    }
                    string2.write(arrby, 0, n2);
                } while (true);
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
                return;
            }
        }
        string.disconnect();
    }

    public void a(String string, String string2) {
        this.b(string, string2);
    }
}


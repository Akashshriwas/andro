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
import com.a.g.b;
import com.a.g.c;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class a {
    ExecutorService a;

    public a(Context context) {
        dn.a.b();
        this.a = Executors.newFixedThreadPool((int)5);
    }

    static /* synthetic */ void a(a a2, String string, int n2) {
        a2.c(string, n2);
    }

    private void b(String object, int n2) {
        object = new b(this, (String)object, n2);
        this.a.submit((Runnable)new c(this, (b)object));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c(String string, int n2) {
        block4 : {
            try {
                string = (HttpURLConnection)new URL(string).openConnection();
                string.setConnectTimeout(30000);
                string.setReadTimeout(30000);
                string.setInstanceFollowRedirects(true);
                InputStream inputStream = string.getInputStream();
                if (inputStream == null) break block4;
                FileOutputStream fileOutputStream = new FileOutputStream(dn.a.a(n2));
                byte[] arrby = new byte[1024];
                do {
                    if ((n2 = inputStream.read(arrby)) == -1) {
                        inputStream.close();
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        break;
                    }
                    fileOutputStream.write(arrby, 0, n2);
                } while (true);
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
                return;
            }
        }
        string.disconnect();
    }

    public void a(String string, int n2) {
        this.b(string, n2);
    }
}


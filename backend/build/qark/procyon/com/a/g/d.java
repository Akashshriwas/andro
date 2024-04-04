// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.g;

import java.io.InputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.concurrent.Executors;
import dn.a;
import android.content.Context;
import java.util.concurrent.ExecutorService;

public class d
{
    ExecutorService a;
    
    public d(final Context context) {
        dn.a.b();
        this.a = Executors.newFixedThreadPool(5);
    }
    
    private void b(final String s, final String s2) {
        this.a.submit(new f(this, new e(this, s, s2)));
    }
    
    private void c(final String spec, final String s) {
        try {
            final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(spec).openConnection();
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setInstanceFollowRedirects(true);
            final InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream != null) {
                final FileOutputStream fileOutputStream = new FileOutputStream(dn.a.a(s));
                final byte[] array = new byte[1024];
                while (true) {
                    final int read = inputStream.read(array);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(array, 0, read);
                }
                inputStream.close();
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            httpURLConnection.disconnect();
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    public void a(final String s, final String s2) {
        this.b(s, s2);
    }
}

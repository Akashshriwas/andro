// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.g;

import java.io.InputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.concurrent.Executors;
import android.content.Context;
import java.util.concurrent.ExecutorService;

public class a
{
    ExecutorService a;
    
    public a(final Context context) {
        dn.a.b();
        this.a = Executors.newFixedThreadPool(5);
    }
    
    private void b(final String s, final int n) {
        this.a.submit(new c(this, new b(this, s, n)));
    }
    
    private void c(final String spec, int read) {
        try {
            final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(spec).openConnection();
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setInstanceFollowRedirects(true);
            final InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream != null) {
                final FileOutputStream fileOutputStream = new FileOutputStream(dn.a.a(read));
                final byte[] array = new byte[1024];
                while (true) {
                    read = inputStream.read(array);
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
    
    public void a(final String s, final int n) {
        this.b(s, n);
    }
}

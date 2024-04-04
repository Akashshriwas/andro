// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package dn;

import android.content.Context;
import android.app.Application;

public class hs extends Application
{
    private static Context a;
    
    public static Context a() {
        return hs.a;
    }
    
    public void onCreate() {
        super.onCreate();
        hs.a = this.getApplicationContext();
    }
}

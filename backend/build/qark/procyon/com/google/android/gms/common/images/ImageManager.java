// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.common.images;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import android.os.Handler;
import android.content.Context;
import java.util.HashSet;

public final class ImageManager
{
    private static final Object a;
    private static HashSet b;
    private final Context c;
    private final Handler d;
    private final ExecutorService e;
    private final b f;
    private final Map g;
    private final Map h;
    
    static {
        a = new Object();
        ImageManager.b = new HashSet();
    }
}

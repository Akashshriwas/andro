/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  java.lang.Object
 *  java.util.HashSet
 *  java.util.Map
 *  java.util.concurrent.ExecutorService
 */
package com.google.android.gms.common.images;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.images.b;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class ImageManager {
    private static final Object a = new Object();
    private static HashSet b = new HashSet();
    private final Context c;
    private final Handler d;
    private final ExecutorService e;
    private final b f;
    private final Map g;
    private final Map h;

    static /* synthetic */ Context a(ImageManager imageManager) {
        return imageManager.c;
    }

    static /* synthetic */ Object a() {
        return a;
    }

    static /* synthetic */ HashSet b() {
        return b;
    }

    static /* synthetic */ Map b(ImageManager imageManager) {
        return imageManager.h;
    }

    static /* synthetic */ Map c(ImageManager imageManager) {
        return imageManager.g;
    }

    static /* synthetic */ ExecutorService d(ImageManager imageManager) {
        return imageManager.e;
    }

    static /* synthetic */ Handler e(ImageManager imageManager) {
        return imageManager.d;
    }

    static /* synthetic */ b f(ImageManager imageManager) {
        return imageManager.f;
    }
}


/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.concurrent.CountDownLatch
 */
package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.ImageManager$ImageReceiver;
import com.google.android.gms.common.images.e;
import com.google.android.gms.common.images.f;
import com.google.android.gms.internal.fv;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

final class d
implements Runnable {
    final /* synthetic */ ImageManager a;
    private final Uri b;
    private final Bitmap c;
    private final CountDownLatch d;
    private boolean e;

    public d(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean bl2, CountDownLatch countDownLatch) {
        this.a = imageManager;
        this.b = uri;
        this.c = bitmap;
        this.e = bl2;
        this.d = countDownLatch;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(ImageManager$ImageReceiver imageManager$ImageReceiver, boolean bl2) {
        imageManager$ImageReceiver.a = true;
        ArrayList arrayList = ImageManager$ImageReceiver.a(imageManager$ImageReceiver);
        int n2 = arrayList.size();
        int n3 = 0;
        do {
            if (n3 >= n2) {
                imageManager$ImageReceiver.a = false;
                return;
            }
            e e2 = (e)arrayList.get(n3);
            if (bl2) {
                e2.a(ImageManager.a(this.a), this.c, false);
            } else {
                e2.a(ImageManager.a(this.a), false);
            }
            if (e2.b != 1) {
                ImageManager.c(this.a).remove((Object)e2);
            }
            ++n3;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        Object object;
        fv.a("OnBitmapLoadedRunnable must be executed in the main thread");
        boolean bl2 = this.c != null;
        if (ImageManager.f(this.a) != null) {
            if (this.e) {
                ImageManager.f(this.a).a();
                System.gc();
                this.e = false;
                ImageManager.e(this.a).post((Runnable)this);
                return;
            }
            if (bl2) {
                ImageManager.f(this.a).b(new f(this.b), (Object)this.c);
            }
        }
        if ((object = (ImageManager$ImageReceiver)((Object)ImageManager.b(this.a).remove((Object)this.b))) != null) {
            this.a((ImageManager$ImageReceiver)((Object)object), bl2);
        }
        this.d.countDown();
        object = ImageManager.a();
        synchronized (object) {
            ImageManager.b().remove((Object)this.b);
            return;
        }
    }
}


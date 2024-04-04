/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.net.Uri
 *  android.os.ParcelFileDescriptor
 *  android.util.Log
 *  java.io.FileDescriptor
 *  java.io.IOException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.CountDownLatch
 */
package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.d;
import com.google.android.gms.internal.fv;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

final class c
implements Runnable {
    final /* synthetic */ ImageManager a;
    private final Uri b;
    private final ParcelFileDescriptor c;

    public c(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = imageManager;
        this.b = uri;
        this.c = parcelFileDescriptor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        fv.b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        boolean bl2 = false;
        boolean bl3 = false;
        Bitmap bitmap = null;
        CountDownLatch countDownLatch = null;
        if (this.c != null) {
            try {
                bitmap = BitmapFactory.decodeFileDescriptor((FileDescriptor)this.c.getFileDescriptor());
                bl2 = bl3;
            }
            catch (OutOfMemoryError outOfMemoryError) {
                Log.e((String)"ImageManager", (String)("OOM while loading bitmap for uri: " + (Object)this.b), (Throwable)outOfMemoryError);
                bl2 = true;
                bitmap = countDownLatch;
            }
            try {
                this.c.close();
            }
            catch (IOException iOException) {
                Log.e((String)"ImageManager", (String)"closed failed", (Throwable)iOException);
            }
        }
        countDownLatch = new CountDownLatch(1);
        ImageManager.e(this.a).post((Runnable)new d(this.a, this.b, bitmap, bl2, countDownLatch));
        try {
            countDownLatch.await();
            return;
        }
        catch (InterruptedException interruptedException) {
            Log.w((String)"ImageManager", (String)("Latch interrupted while posting " + (Object)this.b));
            return;
        }
    }
}


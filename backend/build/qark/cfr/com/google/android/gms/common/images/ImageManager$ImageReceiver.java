/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.ParcelFileDescriptor
 *  android.os.Parcelable
 *  android.os.ResultReceiver
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.c;
import java.util.ArrayList;

final class ImageManager$ImageReceiver
extends ResultReceiver {
    boolean a;
    final /* synthetic */ ImageManager b;
    private final Uri c;
    private final ArrayList d;

    static /* synthetic */ ArrayList a(ImageManager$ImageReceiver imageManager$ImageReceiver) {
        return imageManager$ImageReceiver.d;
    }

    public void onReceiveResult(int n2, Bundle bundle) {
        bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
        ImageManager.d(this.b).execute((Runnable)new c(this.b, this.c, (ParcelFileDescriptor)bundle));
    }
}


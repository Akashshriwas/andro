// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.common.images;

import android.os.ParcelFileDescriptor;
import android.os.Bundle;
import java.util.ArrayList;
import android.net.Uri;
import android.os.ResultReceiver;

final class ImageManager$ImageReceiver extends ResultReceiver
{
    boolean a;
    final /* synthetic */ ImageManager b;
    private final Uri c;
    private final ArrayList d;
    
    public void onReceiveResult(final int n, final Bundle bundle) {
        this.b.e.execute(new c(this.b, this.c, (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
    }
}

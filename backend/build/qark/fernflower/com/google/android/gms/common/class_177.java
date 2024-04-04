package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// $FF: renamed from: com.google.android.gms.common.i
public class class_177 implements ServiceConnection {
   // $FF: renamed from: a boolean
   boolean field_532 = false;
   // $FF: renamed from: b java.util.concurrent.BlockingQueue
   private final BlockingQueue field_533 = new LinkedBlockingQueue();

   // $FF: renamed from: a () android.os.IBinder
   public IBinder method_691() {
      if (this.field_532) {
         throw new IllegalStateException();
      } else {
         this.field_532 = true;
         return (IBinder)this.field_533.take();
      }
   }

   public void onServiceConnected(ComponentName var1, IBinder var2) {
      try {
         this.field_533.put(var2);
      } catch (InterruptedException var3) {
      }
   }

   public void onServiceDisconnected(ComponentName var1) {
   }
}

package mm;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.support.v4.app.Fragment;
import dn.class_91;

// $FF: renamed from: mm.z
class class_660 implements OnCompletionListener {
   // $FF: renamed from: a mm.m
   // $FF: synthetic field
   final class_184 field_2228;

   class_660(class_184 var1) {
      this.field_2228 = var1;
   }

   public void onCompletion(MediaPlayer var1) {
      Exception var10000;
      label45: {
         boolean var10001;
         boolean var2;
         Fragment var8;
         try {
            var2 = class_91.method_281().method_285("RepeatPlayAll", false);
            var8 = this.field_2228.e().method_1946(2131165217);
         } catch (Exception var7) {
            var10000 = var7;
            var10001 = false;
            break label45;
         }

         if (var2) {
            label36: {
               try {
                  if (var8 instanceof class_147) {
                     ((class_147)var8).method_649();
                  }
               } catch (Exception var4) {
                  var10000 = var4;
                  var10001 = false;
                  break label36;
               }

               try {
                  class_184.method_730(this.field_2228);
                  class_184.method_731(this.field_2228);
                  this.field_2228.field_560 = false;
                  return;
               } catch (Exception var3) {
                  var10000 = var3;
                  var10001 = false;
               }
            }
         } else {
            label41: {
               try {
                  if (var8 instanceof class_147) {
                     ((class_147)var8).method_650();
                  }
               } catch (Exception var6) {
                  var10000 = var6;
                  var10001 = false;
                  break label41;
               }

               try {
                  this.field_2228.field_559 = false;
                  this.field_2228.field_581.setBackgroundResource(2130837586);
                  this.field_2228.field_560 = true;
                  class_184.method_722(this.field_2228);
                  return;
               } catch (Exception var5) {
                  var10000 = var5;
                  var10001 = false;
               }
            }
         }
      }

      Exception var9 = var10000;
      var9.printStackTrace();
   }
}

package android.support.v4.util;

public class SparseArrayCompat {
   private static final Object DELETED = new Object();
   private boolean mGarbage;
   private int[] mKeys;
   private int mSize;
   private Object[] mValues;

   public SparseArrayCompat() {
      this(10);
   }

   public SparseArrayCompat(int var1) {
      this.mGarbage = false;
      var1 = idealIntArraySize(var1);
      this.mKeys = new int[var1];
      this.mValues = new Object[var1];
      this.mSize = 0;
   }

   private static int binarySearch(int[] var0, int var1, int var2, int var3) {
      int var4 = var1 + var2;
      int var5 = var1 - 1;

      while(var4 - var5 > 1) {
         int var6 = (var4 + var5) / 2;
         if (var0[var6] < var3) {
            var5 = var6;
         } else {
            var4 = var6;
         }
      }

      if (var4 == var1 + var2) {
         var1 = ~(var1 + var2);
      } else {
         var1 = var4;
         if (var0[var4] != var3) {
            return ~var4;
         }
      }

      return var1;
   }

   // $FF: renamed from: gc () void
   private void method_0() {
      int var4 = this.mSize;
      int var2 = 0;
      int[] var5 = this.mKeys;
      Object[] var6 = this.mValues;

      int var3;
      for(int var1 = 0; var1 < var4; var2 = var3) {
         Object var7 = var6[var1];
         var3 = var2;
         if (var7 != DELETED) {
            if (var1 != var2) {
               var5[var2] = var5[var1];
               var6[var2] = var7;
            }

            var3 = var2 + 1;
         }

         ++var1;
      }

      this.mGarbage = false;
      this.mSize = var2;
   }

   static int idealByteArraySize(int var0) {
      int var1 = 4;

      int var2;
      while(true) {
         var2 = var0;
         if (var1 >= 32) {
            break;
         }

         if (var0 <= (1 << var1) - 12) {
            var2 = (1 << var1) - 12;
            break;
         }

         ++var1;
      }

      return var2;
   }

   static int idealIntArraySize(int var0) {
      return idealByteArraySize(var0 * 4) / 4;
   }

   public void append(int var1, Object var2) {
      if (this.mSize != 0 && var1 <= this.mKeys[this.mSize - 1]) {
         this.put(var1, var2);
      } else {
         if (this.mGarbage && this.mSize >= this.mKeys.length) {
            this.method_0();
         }

         int var3 = this.mSize;
         if (var3 >= this.mKeys.length) {
            int var4 = idealIntArraySize(var3 + 1);
            int[] var5 = new int[var4];
            Object[] var6 = new Object[var4];
            System.arraycopy(this.mKeys, 0, var5, 0, this.mKeys.length);
            System.arraycopy(this.mValues, 0, var6, 0, this.mValues.length);
            this.mKeys = var5;
            this.mValues = var6;
         }

         this.mKeys[var3] = var1;
         this.mValues[var3] = var2;
         this.mSize = var3 + 1;
      }
   }

   public void clear() {
      int var2 = this.mSize;
      Object[] var3 = this.mValues;

      for(int var1 = 0; var1 < var2; ++var1) {
         var3[var1] = null;
      }

      this.mSize = 0;
      this.mGarbage = false;
   }

   public void delete(int var1) {
      var1 = binarySearch(this.mKeys, 0, this.mSize, var1);
      if (var1 >= 0 && this.mValues[var1] != DELETED) {
         this.mValues[var1] = DELETED;
         this.mGarbage = true;
      }

   }

   public Object get(int var1) {
      return this.get(var1, (Object)null);
   }

   public Object get(int var1, Object var2) {
      var1 = binarySearch(this.mKeys, 0, this.mSize, var1);
      return var1 >= 0 && this.mValues[var1] != DELETED ? this.mValues[var1] : var2;
   }

   public int indexOfKey(int var1) {
      if (this.mGarbage) {
         this.method_0();
      }

      return binarySearch(this.mKeys, 0, this.mSize, var1);
   }

   public int indexOfValue(Object var1) {
      if (this.mGarbage) {
         this.method_0();
      }

      for(int var2 = 0; var2 < this.mSize; ++var2) {
         if (this.mValues[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   public int keyAt(int var1) {
      if (this.mGarbage) {
         this.method_0();
      }

      return this.mKeys[var1];
   }

   public void put(int var1, Object var2) {
      int var3 = binarySearch(this.mKeys, 0, this.mSize, var1);
      if (var3 >= 0) {
         this.mValues[var3] = var2;
      } else {
         int var4 = ~var3;
         if (var4 < this.mSize && this.mValues[var4] == DELETED) {
            this.mKeys[var4] = var1;
            this.mValues[var4] = var2;
         } else {
            var3 = var4;
            if (this.mGarbage) {
               var3 = var4;
               if (this.mSize >= this.mKeys.length) {
                  this.method_0();
                  var3 = ~binarySearch(this.mKeys, 0, this.mSize, var1);
               }
            }

            if (this.mSize >= this.mKeys.length) {
               var4 = idealIntArraySize(this.mSize + 1);
               int[] var5 = new int[var4];
               Object[] var6 = new Object[var4];
               System.arraycopy(this.mKeys, 0, var5, 0, this.mKeys.length);
               System.arraycopy(this.mValues, 0, var6, 0, this.mValues.length);
               this.mKeys = var5;
               this.mValues = var6;
            }

            if (this.mSize - var3 != 0) {
               System.arraycopy(this.mKeys, var3, this.mKeys, var3 + 1, this.mSize - var3);
               System.arraycopy(this.mValues, var3, this.mValues, var3 + 1, this.mSize - var3);
            }

            this.mKeys[var3] = var1;
            this.mValues[var3] = var2;
            ++this.mSize;
         }
      }
   }

   public void remove(int var1) {
      this.delete(var1);
   }

   public void removeAt(int var1) {
      if (this.mValues[var1] != DELETED) {
         this.mValues[var1] = DELETED;
         this.mGarbage = true;
      }

   }

   public void removeAtRange(int var1, int var2) {
      for(var2 = Math.min(this.mSize, var1 + var2); var1 < var2; ++var1) {
         this.removeAt(var1);
      }

   }

   public void setValueAt(int var1, Object var2) {
      if (this.mGarbage) {
         this.method_0();
      }

      this.mValues[var1] = var2;
   }

   public int size() {
      if (this.mGarbage) {
         this.method_0();
      }

      return this.mSize;
   }

   public Object valueAt(int var1) {
      if (this.mGarbage) {
         this.method_0();
      }

      return this.mValues[var1];
   }
}

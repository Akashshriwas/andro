package android.support.v4.util;

public class LongSparseArray implements Cloneable {
   private static final Object DELETED = new Object();
   private boolean mGarbage;
   private long[] mKeys;
   private int mSize;
   private Object[] mValues;

   public LongSparseArray() {
      this(10);
   }

   public LongSparseArray(int var1) {
      this.mGarbage = false;
      var1 = idealLongArraySize(var1);
      this.mKeys = new long[var1];
      this.mValues = new Object[var1];
      this.mSize = 0;
   }

   private static int binarySearch(long[] var0, int var1, int var2, long var3) {
      int var5 = var1 + var2;
      int var6 = var1 - 1;

      while(var5 - var6 > 1) {
         int var7 = (var5 + var6) / 2;
         if (var0[var7] < var3) {
            var6 = var7;
         } else {
            var5 = var7;
         }
      }

      if (var5 == var1 + var2) {
         var1 = ~(var1 + var2);
      } else {
         var1 = var5;
         if (var0[var5] != var3) {
            return ~var5;
         }
      }

      return var1;
   }

   // $FF: renamed from: gc () void
   private void method_1() {
      int var4 = this.mSize;
      int var2 = 0;
      long[] var5 = this.mKeys;
      Object[] var6 = this.mValues;

      int var3;
      for(int var1 = 0; var1 < var4; var2 = var3) {
         Object var7 = var6[var1];
         var3 = var2;
         if (var7 != DELETED) {
            if (var1 != var2) {
               var5[var2] = var5[var1];
               var6[var2] = var7;
               var6[var1] = null;
            }

            var3 = var2 + 1;
         }

         ++var1;
      }

      this.mGarbage = false;
      this.mSize = var2;
   }

   public static int idealByteArraySize(int var0) {
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

   public static int idealLongArraySize(int var0) {
      return idealByteArraySize(var0 * 8) / 8;
   }

   public void append(long var1, Object var3) {
      if (this.mSize != 0 && var1 <= this.mKeys[this.mSize - 1]) {
         this.put(var1, var3);
      } else {
         if (this.mGarbage && this.mSize >= this.mKeys.length) {
            this.method_1();
         }

         int var4 = this.mSize;
         if (var4 >= this.mKeys.length) {
            int var5 = idealLongArraySize(var4 + 1);
            long[] var6 = new long[var5];
            Object[] var7 = new Object[var5];
            System.arraycopy(this.mKeys, 0, var6, 0, this.mKeys.length);
            System.arraycopy(this.mValues, 0, var7, 0, this.mValues.length);
            this.mKeys = var6;
            this.mValues = var7;
         }

         this.mKeys[var4] = var1;
         this.mValues[var4] = var3;
         this.mSize = var4 + 1;
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

   public LongSparseArray clone() {
      LongSparseArray var1 = null;

      boolean var10001;
      LongSparseArray var2;
      try {
         var2 = (LongSparseArray)super.clone();
      } catch (CloneNotSupportedException var5) {
         var10001 = false;
         return var1;
      }

      var1 = var2;

      try {
         var2.mKeys = (long[])this.mKeys.clone();
      } catch (CloneNotSupportedException var4) {
         var10001 = false;
         return var1;
      }

      var1 = var2;

      try {
         var2.mValues = (Object[])this.mValues.clone();
         return var2;
      } catch (CloneNotSupportedException var3) {
         var10001 = false;
         return var1;
      }
   }

   public void delete(long var1) {
      int var3 = binarySearch(this.mKeys, 0, this.mSize, var1);
      if (var3 >= 0 && this.mValues[var3] != DELETED) {
         this.mValues[var3] = DELETED;
         this.mGarbage = true;
      }

   }

   public Object get(long var1) {
      return this.get(var1, (Object)null);
   }

   public Object get(long var1, Object var3) {
      int var4 = binarySearch(this.mKeys, 0, this.mSize, var1);
      return var4 >= 0 && this.mValues[var4] != DELETED ? this.mValues[var4] : var3;
   }

   public int indexOfKey(long var1) {
      if (this.mGarbage) {
         this.method_1();
      }

      return binarySearch(this.mKeys, 0, this.mSize, var1);
   }

   public int indexOfValue(Object var1) {
      if (this.mGarbage) {
         this.method_1();
      }

      for(int var2 = 0; var2 < this.mSize; ++var2) {
         if (this.mValues[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   public long keyAt(int var1) {
      if (this.mGarbage) {
         this.method_1();
      }

      return this.mKeys[var1];
   }

   public void put(long var1, Object var3) {
      int var4 = binarySearch(this.mKeys, 0, this.mSize, var1);
      if (var4 >= 0) {
         this.mValues[var4] = var3;
      } else {
         int var5 = ~var4;
         if (var5 < this.mSize && this.mValues[var5] == DELETED) {
            this.mKeys[var5] = var1;
            this.mValues[var5] = var3;
         } else {
            var4 = var5;
            if (this.mGarbage) {
               var4 = var5;
               if (this.mSize >= this.mKeys.length) {
                  this.method_1();
                  var4 = ~binarySearch(this.mKeys, 0, this.mSize, var1);
               }
            }

            if (this.mSize >= this.mKeys.length) {
               var5 = idealLongArraySize(this.mSize + 1);
               long[] var6 = new long[var5];
               Object[] var7 = new Object[var5];
               System.arraycopy(this.mKeys, 0, var6, 0, this.mKeys.length);
               System.arraycopy(this.mValues, 0, var7, 0, this.mValues.length);
               this.mKeys = var6;
               this.mValues = var7;
            }

            if (this.mSize - var4 != 0) {
               System.arraycopy(this.mKeys, var4, this.mKeys, var4 + 1, this.mSize - var4);
               System.arraycopy(this.mValues, var4, this.mValues, var4 + 1, this.mSize - var4);
            }

            this.mKeys[var4] = var1;
            this.mValues[var4] = var3;
            ++this.mSize;
         }
      }
   }

   public void remove(long var1) {
      this.delete(var1);
   }

   public void removeAt(int var1) {
      if (this.mValues[var1] != DELETED) {
         this.mValues[var1] = DELETED;
         this.mGarbage = true;
      }

   }

   public void setValueAt(int var1, Object var2) {
      if (this.mGarbage) {
         this.method_1();
      }

      this.mValues[var1] = var2;
   }

   public int size() {
      if (this.mGarbage) {
         this.method_1();
      }

      return this.mSize;
   }

   public Object valueAt(int var1) {
      if (this.mGarbage) {
         this.method_1();
      }

      return this.mValues[var1];
   }
}

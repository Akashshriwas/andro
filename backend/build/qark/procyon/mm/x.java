// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

class x implements Runnable
{
    final /* synthetic */ w a;
    
    x(final w a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a.w();
        this.a.a.runOnUiThread((Runnable)new y(this));
    }
}

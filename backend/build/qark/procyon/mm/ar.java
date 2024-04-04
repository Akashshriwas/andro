// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

class ar implements Runnable
{
    final /* synthetic */ rc a;
    private final /* synthetic */ long b;
    
    ar(final rc a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.a.b(this.b + 1000L);
    }
}

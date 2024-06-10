.class public Lde/ecspride/ConcreteClass;
.super Lde/ecspride/BaseClass;
.source "ConcreteClass.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Lde/ecspride/BaseClass;-><init>()V

    return-void
.end method


# virtual methods
.method public foo()Ljava/lang/String;
    .locals 1

    .prologue
    .line 6
    iget-object v0, p0, Lde/ecspride/ConcreteClass;->imei:Ljava/lang/String;

    return-object v0
.end method

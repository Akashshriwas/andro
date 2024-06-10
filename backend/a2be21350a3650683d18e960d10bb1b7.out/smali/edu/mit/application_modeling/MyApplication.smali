.class public Ledu/mit/application_modeling/MyApplication;
.super Landroid/app/Application;
.source "MyApplication.java"


# instance fields
.field public imei:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 9
    const-string v0, ""

    iput-object v0, p0, Ledu/mit/application_modeling/MyApplication;->imei:Ljava/lang/String;

    .line 8
    return-void
.end method

package br.com.zup.beagle.sample.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0000H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u00c6\u0003J?\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0002J\b\u0010%\u001a\u00020\u0003H\u0016J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0003H\u0016J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lbr/com/zup/beagle/sample/widgets/TextField;", "Lbr/com/zup/beagle/android/components/form/InputWidget;", "description", "", "hint", "color", "mask", "inputType", "Lbr/com/zup/beagle/sample/widgets/TextFieldInputType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbr/com/zup/beagle/sample/widgets/TextFieldInputType;)V", "getColor", "()Ljava/lang/String;", "getDescription", "getHint", "getInputType", "()Lbr/com/zup/beagle/sample/widgets/TextFieldInputType;", "getMask", "textFieldView", "Landroid/widget/EditText;", "bind", "", "textField", "buildView", "rootView", "Lbr/com/zup/beagle/android/widget/RootView;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "getColorWithHashTag", "value", "getValue", "hashCode", "", "onErrorMessage", "message", "toString", "sample_debug"})
@br.com.zup.beagle.annotation.RegisterWidget(name = "textField")
public final class TextField extends br.com.zup.beagle.android.components.form.InputWidget {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String hint = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String color = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String mask = null;
    @org.jetbrains.annotations.Nullable()
    private final br.com.zup.beagle.sample.widgets.TextFieldInputType inputType = null;
    @kotlin.jvm.Transient()
    private transient android.widget.EditText textFieldView;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.beagle.sample.widgets.TextField copy(@org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String hint, @org.jetbrains.annotations.NotNull()
    java.lang.String color, @org.jetbrains.annotations.Nullable()
    java.lang.String mask, @org.jetbrains.annotations.Nullable()
    br.com.zup.beagle.sample.widgets.TextFieldInputType inputType) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public TextField() {
        super();
    }
    
    public TextField(@org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String hint, @org.jetbrains.annotations.NotNull()
    java.lang.String color, @org.jetbrains.annotations.Nullable()
    java.lang.String mask, @org.jetbrains.annotations.Nullable()
    br.com.zup.beagle.sample.widgets.TextFieldInputType inputType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getColor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMask() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final br.com.zup.beagle.sample.widgets.TextFieldInputType component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final br.com.zup.beagle.sample.widgets.TextFieldInputType getInputType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.EditText buildView(@org.jetbrains.annotations.NotNull()
    br.com.zup.beagle.android.widget.RootView rootView) {
        return null;
    }
    
    @java.lang.Override()
    public void onErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getValue() {
        return null;
    }
    
    private final void bind(br.com.zup.beagle.sample.widgets.TextField textField) {
    }
    
    private final java.lang.String getColorWithHashTag(java.lang.String value) {
        return null;
    }
}
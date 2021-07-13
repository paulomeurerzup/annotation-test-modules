package br.com.zup.beagle.sample;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016\u00a8\u0006\t"}, d2 = {"Lbr/com/zup/beagle/sample/NameSurnameValidator;", "Lbr/com/zup/beagle/android/components/form/core/Validator;", "", "Lbr/com/zup/beagle/sample/widgets/TextField;", "()V", "isValid", "", "input", "widget", "sample_debug"})
@br.com.zup.beagle.android.annotation.RegisterValidator(name = "nameSurname")
public final class NameSurnameValidator implements br.com.zup.beagle.android.components.form.core.Validator<java.lang.String, br.com.zup.beagle.sample.widgets.TextField> {
    
    public NameSurnameValidator() {
        super();
    }
    
    @java.lang.Override()
    public boolean isValid(@org.jetbrains.annotations.NotNull()
    java.lang.String input, @org.jetbrains.annotations.NotNull()
    br.com.zup.beagle.sample.widgets.TextField widget) {
        return false;
    }
}
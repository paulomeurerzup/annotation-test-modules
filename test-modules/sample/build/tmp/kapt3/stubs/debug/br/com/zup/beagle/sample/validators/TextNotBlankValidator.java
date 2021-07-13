package br.com.zup.beagle.sample.validators;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\b"}, d2 = {"Lbr/com/zup/beagle/sample/validators/TextNotBlankValidator;", "Lbr/com/zup/beagle/android/components/form/core/Validator;", "", "()V", "isValid", "", "input", "widget", "sample_debug"})
@br.com.zup.beagle.android.annotation.RegisterValidator(name = "text-is-not-blank")
public final class TextNotBlankValidator implements br.com.zup.beagle.android.components.form.core.Validator<java.lang.String, java.lang.String> {
    
    public TextNotBlankValidator() {
        super();
    }
    
    @java.lang.Override()
    public boolean isValid(@org.jetbrains.annotations.NotNull()
    java.lang.String input, @org.jetbrains.annotations.NotNull()
    java.lang.String widget) {
        return false;
    }
}
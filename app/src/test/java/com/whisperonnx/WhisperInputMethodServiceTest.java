package com.whisperonnx;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WhisperInputMethodServiceTest {

    @Test
    public void sameLanguages_hidesButtons() {
        assertTrue(WhisperInputMethodService.shouldHideLanguageButtons("auto", "auto"));
        assertTrue(WhisperInputMethodService.shouldHideLanguageButtons("en", "en"));
    }

    @Test
    public void differentLanguages_showsButtons() {
        assertFalse(WhisperInputMethodService.shouldHideLanguageButtons("auto", "en"));
        assertFalse(WhisperInputMethodService.shouldHideLanguageButtons("en", "auto"));
    }

    @Test
    public void langSelected1_selectsFirst() {
        assertTrue(WhisperInputMethodService.isLang1Selected(1));
    }

    @Test
    public void langSelected2_selectsSecond() {
        assertFalse(WhisperInputMethodService.isLang1Selected(2));
    }
}

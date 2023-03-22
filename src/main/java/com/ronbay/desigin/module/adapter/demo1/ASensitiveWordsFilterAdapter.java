package com.ronbay.desigin.module.adapter.demo1;

/**
 * @Description:
 * @Author
 * @Date 2023/3/15
 * @Version 1.0
 */
public class ASensitiveWordsFilterAdapter implements ISensitiveWordsFilter{
    private ASensitiveWordsFilter aSensitiveWordsFilter;

    @Override
    public String filter(String text) {
       String maskedText = aSensitiveWordsFilter.filterSexyWords(text);
        maskedText =  aSensitiveWordsFilter.filterPoliticalWords(maskedText);
        return maskedText;
    }
}

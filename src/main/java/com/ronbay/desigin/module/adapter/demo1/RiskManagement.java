package com.ronbay.desigin.module.adapter.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: RiskManagement
 * @Description:
 * @Author
 * @Date 2023/3/15
 * @Version 1.0
 */
public class RiskManagement {
    private List<ISensitiveWordsFilter> filters = new ArrayList<>();

    public void addSensitiveWordsFilter(ISensitiveWordsFilter filter){
        filters.add(filter);
    }

    public String filterSentiveWords(String text){
        String maskedText = text;
        for (ISensitiveWordsFilter filter:filters){
            maskedText = filter.filter(maskedText);
        }
        return maskedText;
    }
}

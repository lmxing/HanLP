package com.hankcs.hanlp.summary;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.hankcs.hanlp.HanLP;

import  com.hankcs.hanlp.summary.TextRankKeyword;

public class TextRankWordTest {
    private static final String str = "我武生物(300357)股东东方富海减持公司1.2%股份同洲电子(002052):监事王红伟短线交易获利855元";
    private static final String separator = "[。?？!！]";

    @Test
    public void test()
    {
        String s1 = str;
        List<String> out = HanLP.extractKeyword(s1,4);
        System.out.println("in:" + s1);
        System.out.println("s2:" + out);
        TextRankKeyword textRankKeyword = new TextRankKeyword();
        Map<String, Float> s3 = textRankKeyword.getTermAndRank(s1, 10);
        System.out.println("s3:" + s3);

    }
}

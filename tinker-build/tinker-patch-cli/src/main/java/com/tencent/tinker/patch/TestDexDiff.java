/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.tencent.tinker.patch;

import com.tencent.tinker.build.dexpatcher.DexPatchGenerator;

import java.io.File;
import java.io.IOException;

/**
 * Created by sunpengfei on 2016/10/25.
 */

public class TestDexDiff {
    public static void main(String[] args) {
        File oldFile = new File("/Users/baidu/Downloads/classes_2.dex");
        File newFile = new File("/Users/baidu/Downloads/classes_4.dex");
        File saveFile = new File("/Users/baidu/Downloads/classes_patch_1.dex");
        try {
            DexPatchGenerator generator = new DexPatchGenerator(oldFile, newFile);
            generator.executeAndSaveTo(saveFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.zhangjie.compress;

import com.zhangjie.extension.SPI;

/**
 * @author wangtao .
 * @createTime on 2020/10/3
 */

@SPI
public interface Compress {

    byte[] compress(byte[] bytes);


    byte[] decompress(byte[] bytes);
}

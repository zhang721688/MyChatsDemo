package com.zxn.zchartslib.interfaces.ichart;

/**
 * 所有绘制的基础接口
 * Created by zxn on 2019/2/16.
 */
public interface IChart {


    /**
     * 坐标轴字符大小设置
     * @param axisTextSize 字符大小
     */
    void setAxisTextSize(float axisTextSize);

    /**
     * 坐标轴颜色设置
     * @param axisColor 颜色
     */
    void setAxisColor(int axisColor);

    /**
     * 坐标轴宽度设置
     * @param axisWidth 宽度
     */
    void setAxisWidth(float axisWidth);


}

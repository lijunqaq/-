package com.yizhu.lj.utils;

import java.math.BigDecimal;

/**
 * ????????
 * 
 * @author ruoyi
 */
public class Arith
{

    /** ???????? */
    private static final int DEF_DIV_SCALE = 10;

    /** ???????? */
    private Arith()
    {
    }

    /**
     * ??????????
     * @param v1 ???
     * @param v2 ??
     * @return ??????
     */
    public static double add(double v1, double v2)
    {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    /**
     * ??????????
     * @param v1 ???
     * @param v2 ??
     * @return ??????
     */
    public static double sub(double v1, double v2)
    {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * ??????????
     * @param v1 ???
     * @param v2 ??
     * @return ??????
     */
    public static double mul(double v1, double v2)
    {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }

    /**
     * ????????????????????????????
     * ?????10????????????
     * @param v1 ???
     * @param v2 ??
     * @return ??????
     */
    public static double div(double v1, double v2)
    {
        return div(v1, v2, DEF_DIV_SCALE);
    }

    /**
     * ??????????????????????????scale???
     * ??????????????
     * @param v1 ???
     * @param v2 ??
     * @param scale ?????????????????
     * @return ??????
     */
    public static double div(double v1, double v2, int scale)
    {
        if (scale < 0)
        {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        if (b1.compareTo(BigDecimal.ZERO) == 0)
        {
            return BigDecimal.ZERO.doubleValue();
        }
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * ???????????????
     * @param v ?????????
     * @param scale ????????
     * @return ????????
     */
    public static double round(double v, int scale)
    {
        if (scale < 0)
        {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b = new BigDecimal(Double.toString(v));
        BigDecimal one = new BigDecimal("1");
        return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}

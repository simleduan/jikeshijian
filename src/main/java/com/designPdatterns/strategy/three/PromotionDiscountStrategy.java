package com.designPdatterns.strategy.three;public class PromotionDiscountStrategy implements DiscountStrategy {    @Override    public double calDiscount(String order) {        System.out.println("PromotionDiscountStrategy");        return 0;    }}
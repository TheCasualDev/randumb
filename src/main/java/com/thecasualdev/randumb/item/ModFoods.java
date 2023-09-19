package com.thecasualdev.randumb.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties WEETBIC = new FoodProperties.Builder().nutrition(8).saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 3, false, false), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300, 5, false, false), 0.2f)
            .build();

    public static final FoodProperties BOWL_WEETBIX = new FoodProperties.Builder().nutrition(20).saturationMod(1f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 10000, 8, false, false), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10000, 4, false, false), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 10000, 8, false, false), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 10000, 3, false, false), 1f)
            .build();

    public static final FoodProperties SUPER_BOWL_WEETBIX = new FoodProperties.Builder().nutrition(100).saturationMod(2f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20000, 8, false, false), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20000, 8, false, false), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20000, 6, false, false), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 20000, 3, false, false), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 20000, 8, false, false), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 20000, 20, false, false), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 20000, 5, false, false), 1f)
            .build();

}

package com.jcirmodelsquad.tcjcir.examples;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;

public class ExampleRollingStock extends EntityRollingStock {
    public ExampleRollingStock(World world) {
        super(world);
    }

    public ExampleRollingStock(World world, double d, double d1, double d2) {
        super(world, d, d1, d2);
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 0; // Distance with coupling between cars
    }
}

package com.rae.crowns.init.client;

import com.jozufozu.flywheel.core.PartialModel;
import com.rae.crowns.CROWNS;


@SuppressWarnings("ALL")
public class PartialModelInit {
    public static final PartialModel TURBINE_STAGE = block("turbine/rotor");


    private static PartialModel block(String path) {
        return PartialModel.of(CROWNS.resource("block/" + path));
    }

    public static void init() {
        // init static fields
    }
}

package com.rae.crowns.config;

import com.rae.crowns.CROWNS;
import com.rae.formicapi.config.CROWNSUnits;
import com.simibubi.create.foundation.config.ConfigBase;
import org.jetbrains.annotations.NotNull;

public class CROWNSCfgClient extends ConfigBase {

    public final CROWNSUnits units = nested(0, CROWNSUnits::new, Comments.units);

    @Override
    public @NotNull String getName() {
        return CROWNS.MODID +".client";
    }

    private static class Comments {
        static String units = "Units used";

    }

}

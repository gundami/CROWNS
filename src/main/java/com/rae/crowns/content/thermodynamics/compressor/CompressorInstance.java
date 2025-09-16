package com.rae.crowns.content.thermodynamics.compressor;

import com.jozufozu.flywheel.api.Instancer;
import com.jozufozu.flywheel.api.MaterialManager;


import com.rae.crowns.init.client.PartialModelInit;
import com.simibubi.create.content.kinetics.base.SingleRotatingInstance;
import com.simibubi.create.content.kinetics.base.flwdata.RotatingData;

public class CompressorInstance  extends SingleRotatingInstance<CompressorBlockEntity> {
    public CompressorInstance(MaterialManager materialManager, CompressorBlockEntity blockEntity) {
        super(materialManager, blockEntity);
    }

    @Override
    protected Instancer<RotatingData> getModel() {
        return getRotatingMaterial().getModel(PartialModelInit.COMPRESSOR, blockState,blockState.getValue(CompressorBlock.FACING));
    }
}
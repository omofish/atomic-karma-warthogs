package com.example.xqlim.secondlife.RecyclablesFolder;

import com.example.xqlim.secondlife.R;

public class MetalTin extends Recyclable {
    public MetalTin(double quantity, String unit) {
        super(quantity, unit);
        name = "Metal Tins";
        imageAssetSmall = R.drawable.small_metal_tin;
        /*imageAssetLarge = R.drawable.large_metal_tin;*/
    }
}

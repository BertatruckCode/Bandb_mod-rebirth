package fr.bentur_and_bertatruck.bandb_mod.common.fluid;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidGet27 extends Fluid
{
    public FluidGet27()
    {
        super("FluidGet27");
        setDensity(10); // How tick the fluid is, affects movement inside the liquid.
        setViscosity(1000); // How fast the fluid flows.
        setUnlocalizedName("FluidGet27"); //setting the name
        FluidRegistry.registerFluid(this); // Registering inside it self, keeps things neat :)
        }
    

}

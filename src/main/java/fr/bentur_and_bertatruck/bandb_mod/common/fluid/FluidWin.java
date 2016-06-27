package fr.bentur_and_bertatruck.bandb_mod.common.fluid;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidWin extends Fluid
{
    public FluidWin()
    {
        super("FluidWin");
        setDensity(10); // How tick the fluid is, affects movement inside the liquid.
        setViscosity(1000); // How fast the fluid flows.
        setUnlocalizedName("FluidWin"); //setting the name
        FluidRegistry.registerFluid(this); // Registering inside it self, keeps things neat :)
        }
    

}

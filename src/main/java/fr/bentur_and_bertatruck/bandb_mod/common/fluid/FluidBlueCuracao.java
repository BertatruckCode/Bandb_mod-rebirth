package fr.bentur_and_bertatruck.bandb_mod.common.fluid;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidBlueCuracao extends Fluid
{
    public FluidBlueCuracao()
    {
        super("FluidBlueCuracao");
        setDensity(10); // How tick the fluid is, affects movement inside the liquid.
        setViscosity(1000); // How fast the fluid flows.
        setUnlocalizedName("FluidBlueCuracao"); //setting the name
        FluidRegistry.registerFluid(this); // Registering inside it self, keeps things neat :)
        }
    

}

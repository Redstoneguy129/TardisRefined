package whocraft.tardis_refined.client.renderer.entity;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.NoopRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import whocraft.tardis_refined.common.entity.ControlEntity;

public class ControlEntityRenderer extends NoopRenderer<ControlEntity> {

    public ControlEntityRenderer(EntityRendererProvider.Context context) {
        super(context);
    }



}

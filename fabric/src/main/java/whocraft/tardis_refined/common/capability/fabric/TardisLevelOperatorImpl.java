package whocraft.tardis_refined.common.capability.fabric;

import dev.onyxstudios.cca.api.v3.component.ComponentV3;
import dev.onyxstudios.cca.api.v3.component.sync.AutoSyncedComponent;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import whocraft.tardis_refined.common.capability.TardisLevelOperator;

import java.util.Objects;
import java.util.Optional;

public class TardisLevelOperatorImpl extends TardisLevelOperator implements ComponentV3, AutoSyncedComponent {

    public TardisLevelOperatorImpl(Level level) {
        super(level);
    }

    public static Optional<TardisLevelOperator> get(ServerLevel level) {
        try {
            return Optional.of(TRComponents.TARDIS_DATA.get(level));
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    @Override
    public void readFromNbt(CompoundTag tag) {
        this.deserializeNBT(tag);
    }

    @Override
    public void writeToNbt(CompoundTag tag) {
        CompoundTag nbt = this.serializeNBT();
        for (String key : nbt.getAllKeys()) {
            tag.put(key, Objects.requireNonNull(nbt.get(key)));
        }
    }
}

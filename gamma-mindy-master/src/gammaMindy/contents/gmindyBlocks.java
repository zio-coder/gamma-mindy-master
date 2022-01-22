package gammaMindy.contents;

import mindustry.ctype.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.entities.bullet.ContinuousLaserBulletType;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import mindustry.type.ItemStack;
import mindustry.world.consumers.ConsumeCoolant;
import mindustry.core.*;

import static mindustry.type.ItemStack.with;

@SuppressWarnings("deprecation")
class gMindyBlocks implements ContentList {
    private Object guang;
        @Override
        public void load() {
            guang = new LaserTurret("element:光"){{
                requirements(Category.turret, with(Items.copper, 2200, Items.lead, 540, Items.graphite, 300, Items.surgeAlloy, 325, Items.silicon, 325));
                shootEffect = Fx.shootBigSmoke2;
                shootCone = 40f;
                recoilAmount = 4f;
                size = 5;
                shootShake = 2f;
                range = 195f;
                reloadTime = 90f;
                firingMoveFract = 0.5f;
                shootDuration = 230f;
                powerUse = 17f;
                shootSound = Sounds.laserbig;
                loopSound = Sounds.beam;
                loopSoundVolume = 2f;

                shootType = new ContinuousLaserBulletType(1024){{
                    length = 400f;
                    hitEffect = Fx.hitMeltdown;
                    hitColor = Pal.meltdownHit;
                    status = StatusEffects.melting;
                    drawSize = 420f;

                    incendChance = 0.4f;
                    incendSpread = 5f;
                    incendAmount = 1;
                    ammoMultiplier = 1f;
                }};

                health = 200 * size * size;
            }};
        }
    }





package clickremapping;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ModifierlessKeybind;

import java.awt.event.KeyEvent;

@ConfigGroup("clickremapping")
public interface ClickRemappingConfig extends Config {

	@ConfigItem(
		keyName = "keybind",
		name = "Click key",
		description = "The key to remap to left click"
	)
	default ModifierlessKeybind keybind() {
		return new ModifierlessKeybind(KeyEvent.VK_SPACE, 0);
	}
}

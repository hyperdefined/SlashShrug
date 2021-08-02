/*
 * This file is part of SlashShrug.
 *
 * SlashShrug is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SlashShrug is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SlashShrug.  If not, see <https://www.gnu.org/licenses/>.
 */

package lol.hyper.slashshrug;

import org.bstats.bukkit.Metrics;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class SlashShrug extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        this.getCommand("shrug").setExecutor(this);
        Metrics metrics = new Metrics(this, 12314);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "You must be a player for this command.");
            return true;
        }
        ((Player) sender).chat("¯\\_(ツ)_/¯");
        return true;
    }
}

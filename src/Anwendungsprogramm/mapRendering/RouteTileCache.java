/*
 * BiKeIT - ein Routenplaner für Fahrradfahrer
 * Copyright (C) 2011-2012 Sven Esser, Manuel Fink, Thomas Keh,
 *                         Tilman Väth, Lukas Vojković, Fabian Winnen
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package mapRendering;

import dataTypes.Zoomlevel;

public class RouteTileCache extends TileCache{

	/**
	 * Creates a new LRU MapTile cache.
	 * @param cacheSize the maximum number of entries that will be kept in this cache.
	 */
	public RouteTileCache (int cacheSize) {
		super(cacheSize); 
	}

	/**
	 * Retrieves a MapTile from the cache.
	 */
	@Override public synchronized RouteTile getTile(Zoomlevel z, int x, int y) {
		return (RouteTile)super.getTile(z, x, y); 
	}

	/**
	 * Adds a MapTile to this cache.
	 * The new entry becomes the MRU (most recently used) entry.
	 */
	public synchronized void putTile(RouteTile tile) {
		super.putTile(tile);
	}
}
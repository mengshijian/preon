/**
 * Copyright (C) 2009 Wilfred Springer
 *
 * This file is part of Preon.
 *
 * Preon is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2, or (at your option) any later version.
 *
 * Preon is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Preon; see the file COPYING. If not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Linking this library statically or dynamically with other modules is making a
 * combined work based on this library. Thus, the terms and conditions of the
 * GNU General Public License cover the whole combination.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent modules, and
 * to copy and distribute the resulting executable under terms of your choice,
 * provided that you also meet, for each linked independent module, the terms
 * and conditions of the license of that module. An independent module is a
 * module which is not derived from or based on this library. If you modify this
 * library, you may extend this exception to your version of the library, but
 * you are not obligated to do so. If you do not wish to do so, delete this
 * exception statement from your version.
 */
package nl.flotsam.preon.sample.mpeg;

import nl.flotsam.preon.annotation.Bound;
import nl.flotsam.preon.annotation.BoundNumber;

public class MpegHeader {

    @BoundNumber(size="11", match="0b11111111111")
    private int frameSync;
    
    @BoundNumber(size="2")
    private int mpegAudioVersionId;
    
    @BoundNumber(size="2")
    private int layerDescription;
    
    @Bound
    private boolean crcProtected;
    
    @BoundNumber(size="4")
    private int bitRateIndex;
    
    @BoundNumber(size="2")
    private int sampleRateFrequencyIndex;
    
    @Bound
    private boolean padded;
    
    @Bound
    private boolean privateBit;
    
    @BoundNumber(size="2")
    private int channelMode;
    
    @BoundNumber(size="2")
    private int modeExtension;
    
    @Bound
    private boolean copyright;
    
    @Bound
    private boolean original;
    
    @BoundNumber(size="2")
    private int emphasis;
    
}
// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.nui.reflection.copy.strategy;

import org.terasology.nui.reflection.copy.CopyStrategy;
import org.joml.Vector2i;
import org.terasology.nui.reflection.copy.RegisterCopyStrategy;

/**
 */
@RegisterCopyStrategy
public class Vector2iCopyStrategy implements CopyStrategy<Vector2i> {
    @Override
    public Vector2i copy(Vector2i value) {
        return new Vector2i(value);
    }
}

/*
 * Copyright 2016 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.rendering.nui.layers.mainMenu.videoSettings;

import static java.lang.System.in;

/**
 */
public enum DisplayModeSetting {
    FULLSCREEN("${engine:menu#video-fullscreen}", true),
    WINDOWED_FULLSCREEN("${engine:menu#video-windowed-fullscreen}", false),
    WINDOWED("${engine:menu#video-windowed}", false);

    private String displayName;

    private boolean current;

    DisplayModeSetting(String displayName, boolean current) {
        this.displayName = displayName;
        this.current = current;
    }

    public DisplayModeSetting getCurrent() {
        for(DisplayModeSetting setting : values()) {
            if (setting.current) {
                return setting;
            }
        }
        return DisplayModeSetting.FULLSCREEN;
    }

    public boolean isCurrent() {
       return this.current;
    }

    public void setCurrent(boolean current) {
        for(DisplayModeSetting setting : values()) {
            setting.current = false;
        }
        this.current = current;
    }

    @Override
    public String toString() {
        return displayName;
    }
}

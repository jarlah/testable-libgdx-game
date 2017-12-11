package com.mygdx.game.assets;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class Textures {
    private final AssetManager manager;

    public Textures(AssetManager assetManager) {
        this.manager = assetManager;
    }

    public static final AssetDescriptor<Texture> someTexture =
            new AssetDescriptor<Texture>("images/badlogic.jpg", Texture.class);

    public void load() {
        manager.load(someTexture);
    }

    public void dispose() {
        manager.dispose();
    }

    public void finishLoading() {
        manager.finishLoading();
    }

    public Texture getTexture(AssetDescriptor<Texture> someTexture) {
        return manager.get(someTexture);
    }
}

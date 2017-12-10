/*******************************************************************************
 * Copyright 2015 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.mygdx.game;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import com.badlogic.gdx.graphics.GL20;
import com.mygdx.game.assets.Textures;
import com.mygdx.game.util.GdxTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.badlogic.gdx.Gdx;

@RunWith(GdxTestRunner.class)
public class TexturesTest {

	private Textures textures;

	@Before
	public void init() {
		Gdx.gl = mock(GL20.class);
		textures = new Textures();
		textures.load();
		textures.finishLoading();
	}

	@Test
	public void badlogicLogoFileExists() {
		assertNotNull("someTexture does not exists", textures.getTexture(Textures.someTexture));
	}
}
/*
 * Copyright (C) 2013 Simon Marquis (http://www.simon-marquis.fr)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package fr.simon.marquis.preferencesmanager.ui;

import android.app.Application;

import com.spazedog.lib.rootfw.RootFW;

public class App extends Application {
	private static RootFW root;

	@Override
	public void onCreate() {
		super.onCreate();
	}

	public static RootFW getRoot() {
		if (root == null)
			root = new RootFW();
		return root;
	}

	public static RootFW getRootForce() {
		if (root == null) {
			root = new RootFW();
			return root;
		} else {
			if (!root.connected()) {
				root = new RootFW();
			}
		}
		return root;
	}
}

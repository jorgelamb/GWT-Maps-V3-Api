package com.google.gwt.maps.client.overlays;

/*
 * #%L
 * GWT Maps API V3 - Core API
 * %%
 * Copyright (C) 2011 - 2012 GWT Maps API V3
 * %%
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
 * #L%
 */

import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;

public class MapPanesGwtTest extends AbstractMapsGWTTestHelper {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapPanes o = MapPanes.newInstance();
				finishTest();
			}
		});

	}

	public void testFloatPane() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapPanes o = MapPanes.newInstance();
				FlowPanel fp = new FlowPanel();
				fp.add(new HTML("test123"));
				Element left = fp.getElement();
				o.setFloatPane(left);
				Element right = o.getFloatPane();
				assertEquals(left.getInnerHTML(), right.getInnerHTML());
				finishTest();
			}
		});

	}

	public void testFloatShadow() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapPanes o = MapPanes.newInstance();
				FlowPanel fp = new FlowPanel();
				fp.add(new HTML("test123"));
				Element left = fp.getElement();
				o.setFloatShadow(left);
				Element right = o.getFloatShadow();
				assertEquals(left.getInnerHTML(), right.getInnerHTML());
				finishTest();
			}
		});

	}

	public void testMapPane() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapPanes o = MapPanes.newInstance();
				FlowPanel fp = new FlowPanel();
				fp.add(new HTML("test123"));
				Element left = fp.getElement();
				o.setMapPane(left);
				Element right = o.getMapPane();
				assertEquals(left.getInnerHTML(), right.getInnerHTML());
				finishTest();
			}
		});

	}

	public void testOverlayImage() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapPanes o = MapPanes.newInstance();
				FlowPanel fp = new FlowPanel();
				fp.add(new HTML("test123"));
				Element left = fp.getElement();
				o.setOverlayImage(left);
				Element right = o.getOverlayImage();
				assertEquals(left.getInnerHTML(), right.getInnerHTML());
				finishTest();
			}
		});

	}

	public void testOverlayLayer() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapPanes o = MapPanes.newInstance();
				FlowPanel fp = new FlowPanel();
				fp.add(new HTML("test123"));
				Element left = fp.getElement();
				o.setOverlayLayer(left);
				Element right = o.getOverlayLayer();
				assertEquals(left.getInnerHTML(), right.getInnerHTML());
				finishTest();
			}
		});

	}

	public void testOverlayMouseTarget() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapPanes o = MapPanes.newInstance();
				FlowPanel fp = new FlowPanel();
				fp.add(new HTML("test123"));
				Element left = fp.getElement();
				o.setOverlayMouseTarget(left);
				Element right = o.getOverlayMouseTarget();
				assertEquals(left.getInnerHTML(), right.getInnerHTML());
				finishTest();
			}
		});

	}

	public void testOverlayShadow() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapPanes o = MapPanes.newInstance();
				FlowPanel fp = new FlowPanel();
				fp.add(new HTML("test123"));
				Element left = fp.getElement();
				o.setOverlayShadow(left);
				Element right = o.getOverlayShadow();
				assertEquals(left.getInnerHTML(), right.getInnerHTML());
				finishTest();
			}
		});

	}

}

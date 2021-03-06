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

import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaOptions;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaWidget;
import com.google.gwt.maps.client.streetview.StreetViewPov;
import com.google.gwt.user.client.ui.RootPanel;

public class OverlayViewGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        OverlayView o = OverlayView.newInstance();
        finishTest();
      }
    });

  }

  public void testDraw() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapOptions options = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        OverlayView o = OverlayView.newInstance();
        o.setMap(mapWidget);

        // TODO - is prototype - not easily tested
        o.draw();

        finishTest();
      }
    });

  }

  public void testMapWidget() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        // no map - confirm null
        OverlayView o = OverlayView.newInstance();
        MapWidget actual = o.getMap();
        assertNull(actual);

        // set a map
        MapOptions options = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        o.setMap(mapWidget);
        actual = o.getMap();
        assertLatLngEquals(mapWidget.getCenter(), o.getMap().getCenter());

        finishTest();
      }
    });
  }

  public void testPanoMapWidget() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        // no map - confirm null
        OverlayView o = OverlayView.newInstance();
        MapWidget actual = o.getMap();
        assertNull(actual);

        LatLng position = LatLng.newInstance(21.271525, -157.822731);

        StreetViewPov pov = StreetViewPov.newInstance();
        pov.setHeading(250);
        pov.setZoom(1);
        pov.setPitch(10);

        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        options.setPosition(position);
        options.setStreeViewPov(pov);

        StreetViewPanoramaWidget wStreet = new StreetViewPanoramaWidget(options);
        // set a map
        RootPanel.get().add(wStreet);

        o.setMap(wStreet);
        // assertNotNull(o.getMap());
        // can't tests because a MapWidget is not being used

        finishTest();
      }
    });
  }

  public void testProjection() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        // set a map
        MapOptions options = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        // no map - confirm null
        OverlayView o = OverlayView.newInstance();
        o.setMap(mapWidget);

        MapCanvasProjection projection = o.getProjection();
        assertNotNull(projection);

        finishTest();
      }
    });
  }

  public void testGetPanes() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        // set a map
        MapOptions options = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        // no map - confirm null
        OverlayView o = OverlayView.newInstance();
        o.setMap(mapWidget);

        MapPanes panes = o.getPanes();
        assertNotNull(panes.getMapPane());

        finishTest();
      }
    });
  }

  public void testOnAdd() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        OverlayView o = OverlayView.newInstance();

        // TODO - is prototype - not easily tested
        o.onAdd();

        finishTest();
      }
    });

  }

  public void testOnRemove() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        OverlayView o = OverlayView.newInstance();

        // TODO - is prototype - not easily tested
        o.onRemove();

        finishTest();
      }
    });

  }

}

package com.google.gwt.maps.client.service;

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
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.MaxZoomResult;
import com.google.gwt.maps.client.services.MaxZoomService;
import com.google.gwt.maps.client.services.MaxZoomServiceHandler;
import com.google.gwt.maps.client.services.MaxZoomStatus;

public class MaxZoomServiceGwtTest extends AbstractMapsGWTTestHelper {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MaxZoomService o = MaxZoomService.newInstance();
				finishTest();
			}
		});
	}

	public void testGet() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MaxZoomService o = MaxZoomService.newInstance();
				LatLng latlng = LatLng.newInstance(25, 26);
				o.getMaxZoomAtLatLng(latlng, new MaxZoomServiceHandler() {
					@Override
					public void onCallback(MaxZoomResult result) {
						if (result == null) {
							fail();
						}

						if (result.getStatus() == MaxZoomStatus.OK) {
							System.out.println("result.zoom="
									+ result.getZoom());
							assertEquals(16, result.getZoom());

						} else if (result.getStatus() == MaxZoomStatus.ERROR) {
							fail();
						}
						finishTest();
					}
				});

			}
		});
	}

}

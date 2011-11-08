/*
 * Copyright 2010 Daniel Kurka
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
package com.googlecode.mgwt.examples.showcase.client.activities.progressindicator;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.FlowPanel;
import com.googlecode.mgwt.examples.showcase.client.DetailViewGwtImpl;
import com.googlecode.mgwt.ui.client.widget.ProgressIndicator;

/**
 * @author Daniel Kurka
 * 
 */
public class ProgressIndicatorViewImpl extends DetailViewGwtImpl implements ProgressIndicatorView {

	public ProgressIndicatorViewImpl() {

		FlowPanel content = new FlowPanel();

		ProgressIndicator progressIndicator = new ProgressIndicator();
		progressIndicator.getElement().getStyle().setMarginTop(100, Unit.PX);
		progressIndicator.getElement().getStyle().setMarginLeft(100, Unit.PX);
		content.add(progressIndicator);

		scrollPanel.setWidget(content);

	}

}

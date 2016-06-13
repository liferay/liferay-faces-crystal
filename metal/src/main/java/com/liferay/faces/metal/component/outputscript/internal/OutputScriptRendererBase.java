/**
 * Copyright (c) 2000-2016 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.metal.component.outputscript.internal;
//J-

import javax.annotation.Generated;

import com.liferay.faces.metal.component.outputscriptstylesheet.internal.OutputScriptStylesheetRendererBase;

import com.liferay.faces.metal.component.outputscript.OutputScript;


/**
 * @author	Bruno Basto
 * @author	Kyle Stiemann
 */
@Generated(value = "com.liferay.alloy.tools.builder.FacesBuilder")
public abstract class OutputScriptRendererBase extends OutputScriptStylesheetRendererBase {

	// Protected Constants
	protected static final String LIBRARY = "library";
	protected static final String NAME = "name";
	protected static final String TARGET = "target";

	@Override
	public String getDelegateComponentFamily() {
		return javax.faces.component.UIOutput.COMPONENT_FAMILY;
	}

	@Override
	public String getDelegateRendererType() {
		return "javax.faces.resource.Script";
	}
}
//J+

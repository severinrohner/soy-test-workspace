/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.clavisit.clavisit.poc.ddl.images.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ImageService}.
 *
 * @author Brian Wing Shun Chan
 * @see ImageService
 * @generated
 */
@ProviderType
public class ImageServiceWrapper implements ImageService,
	ServiceWrapper<ImageService> {
	public ImageServiceWrapper(ImageService imageService) {
		_imageService = imageService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _imageService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.clavisit.clavisit.poc.ddl.images.model.Image> findFileEntries(
		java.lang.String keyword) {
		return _imageService.findFileEntries(keyword);
	}

	@Override
	public ImageService getWrappedService() {
		return _imageService;
	}

	@Override
	public void setWrappedService(ImageService imageService) {
		_imageService = imageService;
	}

	private ImageService _imageService;
}
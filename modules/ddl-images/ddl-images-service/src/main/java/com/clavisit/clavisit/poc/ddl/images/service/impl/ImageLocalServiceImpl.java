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

package com.clavisit.clavisit.poc.ddl.images.service.impl;

import aQute.bnd.annotation.ProviderType;

import com.clavisit.clavisit.poc.ddl.images.model.Image;
import com.clavisit.clavisit.poc.ddl.images.model.impl.ImageImpl;
import com.clavisit.clavisit.poc.ddl.images.service.ImageLocalService;
import com.clavisit.clavisit.poc.ddl.images.service.ImageLocalServiceUtil;
import com.clavisit.clavisit.poc.ddl.images.service.base.ImageLocalServiceBaseImpl;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.service.DLFileEntryLocalService;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import org.osgi.service.component.annotations.Reference;

import java.util.ArrayList;
import java.util.List;

/**
 * The implementation of the image local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ImageLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ImageLocalServiceBaseImpl
 * @see ImageLocalServiceUtil
 */
@ProviderType
public class ImageLocalServiceImpl extends ImageLocalServiceBaseImpl {
    private DLFileEntryLocalService dlFileEntryLocalService;

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.clavisit.keystone.poc.tasks.service.FooLocalServiceUtil} to access the foo local service.
	 */

    public List<Image> findFileEntries(String keyword) {
        List<DLFileEntry> files = DLFileEntryLocalServiceUtil.getDLFileEntries(-1, -1);
        List<Image> images = new ArrayList<>();
        for (DLFileEntry file : files) {
            if (file.getMimeType().contains("image")
                    && (file.getDescription().toLowerCase().contains(keyword.toLowerCase())
                    || file.getFileName().toLowerCase().contains(keyword.toLowerCase()))) {
                Image image = new ImageImpl();
                image.setFileName(file.getFileName());
                image.setDescription(file.getDescription());
                image.setFileEnding(file.getExtension());
                image.setMimeType(file.getMimeType());
                image.setImageId(file.getFileEntryId());
                image.setImagePath("/documents/" + file.getGroupId() + "/" + file.getFolderId()
                    + "/" + file.getFileName());
                image.setThumbnailPath(image.getImagePath() + "?version=1.0&imageThumbnail=1");
                images.add(image);
            }
        }
        return images;
    }

    @Reference(unbind = "-")
    public void setDlFileEntryLocalService(DLFileEntryLocalService dlFileEntryLocalService) {
        this.dlFileEntryLocalService = dlFileEntryLocalService;
    }
}
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

package com.clavisit.clavisit.poc.ddl.images.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.clavisit.clavisit.poc.ddl.images.model.Image;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Image in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Image
 * @generated
 */
@ProviderType
public class ImageCacheModel implements CacheModel<Image>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ImageCacheModel)) {
			return false;
		}

		ImageCacheModel imageCacheModel = (ImageCacheModel)obj;

		if (imageId == imageCacheModel.imageId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, imageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", imageId=");
		sb.append(imageId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", fileName=");
		sb.append(fileName);
		sb.append(", description=");
		sb.append(description);
		sb.append(", imagePath=");
		sb.append(imagePath);
		sb.append(", thumbnailPath=");
		sb.append(thumbnailPath);
		sb.append(", fileEnding=");
		sb.append(fileEnding);
		sb.append(", mimeType=");
		sb.append(mimeType);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Image toEntityModel() {
		ImageImpl imageImpl = new ImageImpl();

		if (uuid == null) {
			imageImpl.setUuid(StringPool.BLANK);
		}
		else {
			imageImpl.setUuid(uuid);
		}

		imageImpl.setImageId(imageId);
		imageImpl.setGroupId(groupId);
		imageImpl.setCompanyId(companyId);
		imageImpl.setUserId(userId);

		if (userName == null) {
			imageImpl.setUserName(StringPool.BLANK);
		}
		else {
			imageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			imageImpl.setCreateDate(null);
		}
		else {
			imageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			imageImpl.setModifiedDate(null);
		}
		else {
			imageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (fileName == null) {
			imageImpl.setFileName(StringPool.BLANK);
		}
		else {
			imageImpl.setFileName(fileName);
		}

		if (description == null) {
			imageImpl.setDescription(StringPool.BLANK);
		}
		else {
			imageImpl.setDescription(description);
		}

		if (imagePath == null) {
			imageImpl.setImagePath(StringPool.BLANK);
		}
		else {
			imageImpl.setImagePath(imagePath);
		}

		if (thumbnailPath == null) {
			imageImpl.setThumbnailPath(StringPool.BLANK);
		}
		else {
			imageImpl.setThumbnailPath(thumbnailPath);
		}

		if (fileEnding == null) {
			imageImpl.setFileEnding(StringPool.BLANK);
		}
		else {
			imageImpl.setFileEnding(fileEnding);
		}

		if (mimeType == null) {
			imageImpl.setMimeType(StringPool.BLANK);
		}
		else {
			imageImpl.setMimeType(mimeType);
		}

		imageImpl.resetOriginalValues();

		return imageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		imageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		fileName = objectInput.readUTF();
		description = objectInput.readUTF();
		imagePath = objectInput.readUTF();
		thumbnailPath = objectInput.readUTF();
		fileEnding = objectInput.readUTF();
		mimeType = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(imageId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (fileName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fileName);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (imagePath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imagePath);
		}

		if (thumbnailPath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thumbnailPath);
		}

		if (fileEnding == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fileEnding);
		}

		if (mimeType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mimeType);
		}
	}

	public String uuid;
	public long imageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String fileName;
	public String description;
	public String imagePath;
	public String thumbnailPath;
	public String fileEnding;
	public String mimeType;
}
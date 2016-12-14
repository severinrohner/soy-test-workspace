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

package com.clavisit.clavisit.poc.ddl.images.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Image}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Image
 * @generated
 */
@ProviderType
public class ImageWrapper implements Image, ModelWrapper<Image> {
	public ImageWrapper(Image image) {
		_image = image;
	}

	@Override
	public Class<?> getModelClass() {
		return Image.class;
	}

	@Override
	public String getModelClassName() {
		return Image.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("imageId", getImageId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("fileName", getFileName());
		attributes.put("description", getDescription());
		attributes.put("imagePath", getImagePath());
		attributes.put("thumbnailPath", getThumbnailPath());
		attributes.put("fileEnding", getFileEnding());
		attributes.put("mimeType", getMimeType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long imageId = (Long)attributes.get("imageId");

		if (imageId != null) {
			setImageId(imageId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String fileName = (String)attributes.get("fileName");

		if (fileName != null) {
			setFileName(fileName);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String imagePath = (String)attributes.get("imagePath");

		if (imagePath != null) {
			setImagePath(imagePath);
		}

		String thumbnailPath = (String)attributes.get("thumbnailPath");

		if (thumbnailPath != null) {
			setThumbnailPath(thumbnailPath);
		}

		String fileEnding = (String)attributes.get("fileEnding");

		if (fileEnding != null) {
			setFileEnding(fileEnding);
		}

		String mimeType = (String)attributes.get("mimeType");

		if (mimeType != null) {
			setMimeType(mimeType);
		}
	}

	@Override
	public Image toEscapedModel() {
		return new ImageWrapper(_image.toEscapedModel());
	}

	@Override
	public Image toUnescapedModel() {
		return new ImageWrapper(_image.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _image.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _image.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _image.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _image.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Image> toCacheModel() {
		return _image.toCacheModel();
	}

	@Override
	public int compareTo(Image image) {
		return _image.compareTo(image);
	}

	@Override
	public int hashCode() {
		return _image.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _image.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ImageWrapper((Image)_image.clone());
	}

	/**
	* Returns the description of this image.
	*
	* @return the description of this image
	*/
	@Override
	public java.lang.String getDescription() {
		return _image.getDescription();
	}

	/**
	* Returns the file ending of this image.
	*
	* @return the file ending of this image
	*/
	@Override
	public java.lang.String getFileEnding() {
		return _image.getFileEnding();
	}

	/**
	* Returns the file name of this image.
	*
	* @return the file name of this image
	*/
	@Override
	public java.lang.String getFileName() {
		return _image.getFileName();
	}

	/**
	* Returns the image path of this image.
	*
	* @return the image path of this image
	*/
	@Override
	public java.lang.String getImagePath() {
		return _image.getImagePath();
	}

	/**
	* Returns the mime type of this image.
	*
	* @return the mime type of this image
	*/
	@Override
	public java.lang.String getMimeType() {
		return _image.getMimeType();
	}

	/**
	* Returns the thumbnail path of this image.
	*
	* @return the thumbnail path of this image
	*/
	@Override
	public java.lang.String getThumbnailPath() {
		return _image.getThumbnailPath();
	}

	/**
	* Returns the user name of this image.
	*
	* @return the user name of this image
	*/
	@Override
	public java.lang.String getUserName() {
		return _image.getUserName();
	}

	/**
	* Returns the user uuid of this image.
	*
	* @return the user uuid of this image
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _image.getUserUuid();
	}

	/**
	* Returns the uuid of this image.
	*
	* @return the uuid of this image
	*/
	@Override
	public java.lang.String getUuid() {
		return _image.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _image.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _image.toXmlString();
	}

	/**
	* Returns the create date of this image.
	*
	* @return the create date of this image
	*/
	@Override
	public Date getCreateDate() {
		return _image.getCreateDate();
	}

	/**
	* Returns the modified date of this image.
	*
	* @return the modified date of this image
	*/
	@Override
	public Date getModifiedDate() {
		return _image.getModifiedDate();
	}

	/**
	* Returns the company ID of this image.
	*
	* @return the company ID of this image
	*/
	@Override
	public long getCompanyId() {
		return _image.getCompanyId();
	}

	/**
	* Returns the group ID of this image.
	*
	* @return the group ID of this image
	*/
	@Override
	public long getGroupId() {
		return _image.getGroupId();
	}

	/**
	* Returns the image ID of this image.
	*
	* @return the image ID of this image
	*/
	@Override
	public long getImageId() {
		return _image.getImageId();
	}

	/**
	* Returns the primary key of this image.
	*
	* @return the primary key of this image
	*/
	@Override
	public long getPrimaryKey() {
		return _image.getPrimaryKey();
	}

	/**
	* Returns the user ID of this image.
	*
	* @return the user ID of this image
	*/
	@Override
	public long getUserId() {
		return _image.getUserId();
	}

	@Override
	public void persist() {
		_image.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_image.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this image.
	*
	* @param companyId the company ID of this image
	*/
	@Override
	public void setCompanyId(long companyId) {
		_image.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this image.
	*
	* @param createDate the create date of this image
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_image.setCreateDate(createDate);
	}

	/**
	* Sets the description of this image.
	*
	* @param description the description of this image
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_image.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_image.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_image.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_image.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the file ending of this image.
	*
	* @param fileEnding the file ending of this image
	*/
	@Override
	public void setFileEnding(java.lang.String fileEnding) {
		_image.setFileEnding(fileEnding);
	}

	/**
	* Sets the file name of this image.
	*
	* @param fileName the file name of this image
	*/
	@Override
	public void setFileName(java.lang.String fileName) {
		_image.setFileName(fileName);
	}

	/**
	* Sets the group ID of this image.
	*
	* @param groupId the group ID of this image
	*/
	@Override
	public void setGroupId(long groupId) {
		_image.setGroupId(groupId);
	}

	/**
	* Sets the image ID of this image.
	*
	* @param imageId the image ID of this image
	*/
	@Override
	public void setImageId(long imageId) {
		_image.setImageId(imageId);
	}

	/**
	* Sets the image path of this image.
	*
	* @param imagePath the image path of this image
	*/
	@Override
	public void setImagePath(java.lang.String imagePath) {
		_image.setImagePath(imagePath);
	}

	/**
	* Sets the mime type of this image.
	*
	* @param mimeType the mime type of this image
	*/
	@Override
	public void setMimeType(java.lang.String mimeType) {
		_image.setMimeType(mimeType);
	}

	/**
	* Sets the modified date of this image.
	*
	* @param modifiedDate the modified date of this image
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_image.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_image.setNew(n);
	}

	/**
	* Sets the primary key of this image.
	*
	* @param primaryKey the primary key of this image
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_image.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_image.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the thumbnail path of this image.
	*
	* @param thumbnailPath the thumbnail path of this image
	*/
	@Override
	public void setThumbnailPath(java.lang.String thumbnailPath) {
		_image.setThumbnailPath(thumbnailPath);
	}

	/**
	* Sets the user ID of this image.
	*
	* @param userId the user ID of this image
	*/
	@Override
	public void setUserId(long userId) {
		_image.setUserId(userId);
	}

	/**
	* Sets the user name of this image.
	*
	* @param userName the user name of this image
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_image.setUserName(userName);
	}

	/**
	* Sets the user uuid of this image.
	*
	* @param userUuid the user uuid of this image
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_image.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this image.
	*
	* @param uuid the uuid of this image
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_image.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ImageWrapper)) {
			return false;
		}

		ImageWrapper imageWrapper = (ImageWrapper)obj;

		if (Objects.equals(_image, imageWrapper._image)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _image.getStagedModelType();
	}

	@Override
	public Image getWrappedModel() {
		return _image;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _image.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _image.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_image.resetOriginalValues();
	}

	private final Image _image;
}
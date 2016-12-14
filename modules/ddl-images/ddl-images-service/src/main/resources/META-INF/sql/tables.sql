create table IMS_Image (
	uuid_ VARCHAR(75) null,
	imageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	fileName VARCHAR(75) null,
	description VARCHAR(75) null,
	imagePath VARCHAR(75) null,
	thumbnailPath VARCHAR(75) null,
	fileEnding VARCHAR(75) null,
	mimeType VARCHAR(75) null
);

create table KEY_Image (
	uuid_ VARCHAR(75) null,
	imageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	fileName VARCHAR(75) null,
	description VARCHAR(75) null,
	imagePath VARCHAR(75) null,
	thumbnailPath VARCHAR(75) null,
	fileEnding VARCHAR(75) null,
	mimeType VARCHAR(75) null
);
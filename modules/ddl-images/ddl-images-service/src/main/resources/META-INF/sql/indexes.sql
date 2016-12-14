create index IX_C05ED565 on IMS_Image (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_99F77127 on IMS_Image (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E45CC7F5 on KEY_Image (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_16F0C7B7 on KEY_Image (uuid_[$COLUMN_LENGTH:75$], groupId);
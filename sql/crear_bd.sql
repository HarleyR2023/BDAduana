
if exists (select * from sysdatabases where name='BDAduana')
	drop database BDAduana
go

create database BDAduana;

package com.app.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="doc")
public class DocumentUpload {

	@Id
	@Column(name="fid")
	private Integer fid;
	@Column(name="fname")
	private String fileName;
	@Column(name="fdata")
	@Lob
	private byte[] fileData;
	public DocumentUpload() {
		super();
	}
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public byte[] getFileData() {
		return fileData;
	}
	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}
	@Override
	public String toString() {
		return "DocumentUpload [fid=" + fid + ", fileName=" + fileName + ", fileData=" + Arrays.toString(fileData)
				+ "]";
	}
	
	
}

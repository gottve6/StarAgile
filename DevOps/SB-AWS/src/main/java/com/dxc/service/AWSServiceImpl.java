package com.dxc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.PutObjectRequest;

public class AWSServiceImpl implements AWSService {

	@Autowired
	private AmazonS3Client amazonS3Client;
	
	@Override
	public String uploadFile(MultipartFile file) {
		String fileName = System.currentTimeMillis()+"."+file.getOriginalFilename();
		amazonS3Client.putObject("sb-aws1", PutObjectRequest, null)
		
		return null;
	}

}

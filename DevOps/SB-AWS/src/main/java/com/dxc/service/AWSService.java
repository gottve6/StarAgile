package com.dxc.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface AWSService {

	String uploadFile(MultipartFile multipartFile);
}

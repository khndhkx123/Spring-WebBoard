package com.adullam.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adullam.service.QTorderService;

@Controller
@RequestMapping(value="/QTorder")
public class QTorderController {
	@Inject
	private QTorderService qtorderService;
	private static final Logger logger = LoggerFactory.getLogger(QTorderController.class);
	
	

}

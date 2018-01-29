/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.guce.siat.core.ct.dao.impl;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.core.ct.dao.SampleDao;
import org.guce.siat.core.ct.model.Sample;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author yenke
 */
@Repository("sampleDao")
@Transactional(propagation = Propagation.REQUIRED)
public class SampleDaoImpl extends AbstractJpaDaoImpl<Sample> implements SampleDao{

	public SampleDaoImpl() {
		super();
		setClasse(Sample.class);
	}
	
}

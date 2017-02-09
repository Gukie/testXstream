/**
 * hongshiwl.com Inc.
 * Copyright (c) 2015-2016 All Rights Reserved.
 */
package com.test.testXstream;

import java.sql.Timestamp;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * @author Gushu
 * @version $Id: ResponseTest.java, v 0.1 2016��10��24�� ����1:45:04 Gushu Exp $
 */
@XStreamAlias("Response")
public class ResponseTest {
    @XStreamAlias("returncode")
    private int       resultCode;

    @XStreamAlias("time")
    private Timestamp time;

    @XStreamAlias("returnmessage")
    private String    resultMessage;

    @XStreamAlias("status")
    private int       state;

    @Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);

    }
}

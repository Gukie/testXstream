/**
 * hongshiwl.com Inc.
 * Copyright (c) 2015-2016 All Rights Reserved.
 */
package com.test.testXstream;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * @author Gushu
 * @version $Id: RequestTest.java, v 0.1 2016��10��24�� ����1:44:45 Gushu Exp $
 */
@XStreamAlias("Response")
public class RequestTest {

    @XStreamAlias("returncode")
    private String returnCode;

    @XStreamAlias("returnmessage")
    private String returnMessage;

    @XStreamAlias("status")
    private int    status;

    @XStreamAlias("time")
    private String reqTime;

    public String getReturnCode() {

        return returnCode;

    }

    public void setReturnCode(String returnCode) {

        this.returnCode = returnCode;

    }

    public String getReturnMessage() {

        return returnMessage;

    }

    public void setReturnMessage(String returnMessage) {

        this.returnMessage = returnMessage;

    }

    public int getStatus() {

        return status;

    }

    public void setStatus(int status) {

        this.status = status;

    }

    public String getReqTime() {

        return reqTime;

    }

    public void setReqTime(String reqTime) {

        this.reqTime = reqTime;

    }

    @Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);

    }
}

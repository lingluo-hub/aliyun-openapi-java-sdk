/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dts.transform.v20200101.DescribeSubscriptionInstanceAlertResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSubscriptionInstanceAlertResponse extends AcsResponse {

	private String requestId;

	private String errorAlertStatus;

	private String errCode;

	private String success;

	private String errorAlertPhone;

	private String errMessage;

	private String delayAlertStatus;

	private String subscriptionInstanceName;

	private String delayAlertPhone;

	private String subscriptionInstanceID;

	private String delayOverSeconds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorAlertStatus() {
		return this.errorAlertStatus;
	}

	public void setErrorAlertStatus(String errorAlertStatus) {
		this.errorAlertStatus = errorAlertStatus;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getErrorAlertPhone() {
		return this.errorAlertPhone;
	}

	public void setErrorAlertPhone(String errorAlertPhone) {
		this.errorAlertPhone = errorAlertPhone;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public String getDelayAlertStatus() {
		return this.delayAlertStatus;
	}

	public void setDelayAlertStatus(String delayAlertStatus) {
		this.delayAlertStatus = delayAlertStatus;
	}

	public String getSubscriptionInstanceName() {
		return this.subscriptionInstanceName;
	}

	public void setSubscriptionInstanceName(String subscriptionInstanceName) {
		this.subscriptionInstanceName = subscriptionInstanceName;
	}

	public String getDelayAlertPhone() {
		return this.delayAlertPhone;
	}

	public void setDelayAlertPhone(String delayAlertPhone) {
		this.delayAlertPhone = delayAlertPhone;
	}

	public String getSubscriptionInstanceID() {
		return this.subscriptionInstanceID;
	}

	public void setSubscriptionInstanceID(String subscriptionInstanceID) {
		this.subscriptionInstanceID = subscriptionInstanceID;
	}

	public String getDelayOverSeconds() {
		return this.delayOverSeconds;
	}

	public void setDelayOverSeconds(String delayOverSeconds) {
		this.delayOverSeconds = delayOverSeconds;
	}

	@Override
	public DescribeSubscriptionInstanceAlertResponse getInstance(UnmarshallerContext context) {
		return	DescribeSubscriptionInstanceAlertResponseUnmarshaller.unmarshall(this, context);
	}
}

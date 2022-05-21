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

package com.aliyuncs.sgw.model.v20180511;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sgw.transform.v20180511.DescribeGatewayLoggingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGatewayLoggingResponse extends AcsResponse {

	private String slsProject;

	private String requestId;

	private String message;

	private String gatewayLoggingStatus;

	private String slsLogstore;

	private String code;

	private Boolean success;

	public String getSlsProject() {
		return this.slsProject;
	}

	public void setSlsProject(String slsProject) {
		this.slsProject = slsProject;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getGatewayLoggingStatus() {
		return this.gatewayLoggingStatus;
	}

	public void setGatewayLoggingStatus(String gatewayLoggingStatus) {
		this.gatewayLoggingStatus = gatewayLoggingStatus;
	}

	public String getSlsLogstore() {
		return this.slsLogstore;
	}

	public void setSlsLogstore(String slsLogstore) {
		this.slsLogstore = slsLogstore;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	@Override
	public DescribeGatewayLoggingResponse getInstance(UnmarshallerContext context) {
		return	DescribeGatewayLoggingResponseUnmarshaller.unmarshall(this, context);
	}
}

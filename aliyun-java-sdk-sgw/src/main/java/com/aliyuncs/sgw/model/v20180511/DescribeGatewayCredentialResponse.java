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
import com.aliyuncs.sgw.transform.v20180511.DescribeGatewayCredentialResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGatewayCredentialResponse extends AcsResponse {

	private String vpcId;

	private String requestId;

	private String message;

	private String consoleUsername;

	private String vSwitchId;

	private String ecsIp;

	private String consolePassword;

	private String ecsPassword;

	private String code;

	private Boolean success;

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
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

	public String getConsoleUsername() {
		return this.consoleUsername;
	}

	public void setConsoleUsername(String consoleUsername) {
		this.consoleUsername = consoleUsername;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public String getEcsIp() {
		return this.ecsIp;
	}

	public void setEcsIp(String ecsIp) {
		this.ecsIp = ecsIp;
	}

	public String getConsolePassword() {
		return this.consolePassword;
	}

	public void setConsolePassword(String consolePassword) {
		this.consolePassword = consolePassword;
	}

	public String getEcsPassword() {
		return this.ecsPassword;
	}

	public void setEcsPassword(String ecsPassword) {
		this.ecsPassword = ecsPassword;
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
	public DescribeGatewayCredentialResponse getInstance(UnmarshallerContext context) {
		return	DescribeGatewayCredentialResponseUnmarshaller.unmarshall(this, context);
	}
}

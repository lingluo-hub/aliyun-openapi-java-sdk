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

package com.aliyuncs.finance_rule.model.v20180808;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.finance_rule.transform.v20180808.RestartBpmsWithOutMatchTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RestartBpmsWithOutMatchTemplateResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String remark;

	private Boolean success;

	private String resultObj;

	private ExtendInfo extendInfo;

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getResultObj() {
		return this.resultObj;
	}

	public void setResultObj(String resultObj) {
		this.resultObj = resultObj;
	}

	public ExtendInfo getExtendInfo() {
		return this.extendInfo;
	}

	public void setExtendInfo(ExtendInfo extendInfo) {
		this.extendInfo = extendInfo;
	}

	public static class ExtendInfo {

		private String placeHolder1;

		public String getPlaceHolder1() {
			return this.placeHolder1;
		}

		public void setPlaceHolder1(String placeHolder1) {
			this.placeHolder1 = placeHolder1;
		}
	}

	@Override
	public RestartBpmsWithOutMatchTemplateResponse getInstance(UnmarshallerContext context) {
		return	RestartBpmsWithOutMatchTemplateResponseUnmarshaller.unmarshall(this, context);
	}
}

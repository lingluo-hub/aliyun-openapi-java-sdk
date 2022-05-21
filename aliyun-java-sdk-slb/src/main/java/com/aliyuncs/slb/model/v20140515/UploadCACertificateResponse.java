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

package com.aliyuncs.slb.model.v20140515;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.UploadCACertificateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UploadCACertificateResponse extends AcsResponse {

	private Long createTimeStamp;

	private String requestId;

	private String expireTime;

	private String fingerprint;

	private String createTime;

	private String commonName;

	private String resourceGroupId;

	private String cACertificateName;

	private Long expireTimeStamp;

	private String cACertificateId;

	public Long getCreateTimeStamp() {
		return this.createTimeStamp;
	}

	public void setCreateTimeStamp(Long createTimeStamp) {
		this.createTimeStamp = createTimeStamp;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getFingerprint() {
		return this.fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCommonName() {
		return this.commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getCACertificateName() {
		return this.cACertificateName;
	}

	public void setCACertificateName(String cACertificateName) {
		this.cACertificateName = cACertificateName;
	}

	public Long getExpireTimeStamp() {
		return this.expireTimeStamp;
	}

	public void setExpireTimeStamp(Long expireTimeStamp) {
		this.expireTimeStamp = expireTimeStamp;
	}

	public String getCACertificateId() {
		return this.cACertificateId;
	}

	public void setCACertificateId(String cACertificateId) {
		this.cACertificateId = cACertificateId;
	}

	@Override
	public UploadCACertificateResponse getInstance(UnmarshallerContext context) {
		return	UploadCACertificateResponseUnmarshaller.unmarshall(this, context);
	}
}

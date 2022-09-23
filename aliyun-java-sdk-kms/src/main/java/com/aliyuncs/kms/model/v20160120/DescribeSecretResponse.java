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

package com.aliyuncs.kms.model.v20160120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.kms.transform.v20160120.DescribeSecretResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecretResponse extends AcsResponse {

	private String updateTime;

	private String createTime;

	private String nextRotationDate;

	private String encryptionKeyId;

	private String rotationInterval;

	private String arn;

	private String extendedConfig;

	private String lastRotationDate;

	private String requestId;

	private String description;

	private String secretName;

	private String automaticRotation;

	private String secretType;

	private String plannedDeleteTime;

	private String dKMSInstanceId;

	private List<Tag> tags;

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getNextRotationDate() {
		return this.nextRotationDate;
	}

	public void setNextRotationDate(String nextRotationDate) {
		this.nextRotationDate = nextRotationDate;
	}

	public String getEncryptionKeyId() {
		return this.encryptionKeyId;
	}

	public void setEncryptionKeyId(String encryptionKeyId) {
		this.encryptionKeyId = encryptionKeyId;
	}

	public String getRotationInterval() {
		return this.rotationInterval;
	}

	public void setRotationInterval(String rotationInterval) {
		this.rotationInterval = rotationInterval;
	}

	public String getArn() {
		return this.arn;
	}

	public void setArn(String arn) {
		this.arn = arn;
	}

	public String getExtendedConfig() {
		return this.extendedConfig;
	}

	public void setExtendedConfig(String extendedConfig) {
		this.extendedConfig = extendedConfig;
	}

	public String getLastRotationDate() {
		return this.lastRotationDate;
	}

	public void setLastRotationDate(String lastRotationDate) {
		this.lastRotationDate = lastRotationDate;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSecretName() {
		return this.secretName;
	}

	public void setSecretName(String secretName) {
		this.secretName = secretName;
	}

	public String getAutomaticRotation() {
		return this.automaticRotation;
	}

	public void setAutomaticRotation(String automaticRotation) {
		this.automaticRotation = automaticRotation;
	}

	public String getSecretType() {
		return this.secretType;
	}

	public void setSecretType(String secretType) {
		this.secretType = secretType;
	}

	public String getPlannedDeleteTime() {
		return this.plannedDeleteTime;
	}

	public void setPlannedDeleteTime(String plannedDeleteTime) {
		this.plannedDeleteTime = plannedDeleteTime;
	}

	public String getDKMSInstanceId() {
		return this.dKMSInstanceId;
	}

	public void setDKMSInstanceId(String dKMSInstanceId) {
		this.dKMSInstanceId = dKMSInstanceId;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public static class Tag {

		private String tagValue;

		private String tagKey;

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}
	}

	@Override
	public DescribeSecretResponse getInstance(UnmarshallerContext context) {
		return	DescribeSecretResponseUnmarshaller.unmarshall(this, context);
	}
}

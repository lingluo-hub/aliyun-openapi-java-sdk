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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeServerCertificatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeServerCertificatesResponse extends AcsResponse {

	private String requestId;

	private List<ServerCertificate> serverCertificates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ServerCertificate> getServerCertificates() {
		return this.serverCertificates;
	}

	public void setServerCertificates(List<ServerCertificate> serverCertificates) {
		this.serverCertificates = serverCertificates;
	}

	public static class ServerCertificate {

		private Long createTimeStamp;

		private String aliCloudCertificateName;

		private String standardType;

		private String expireTime;

		private Integer encryptionKeyLength;

		private String createTime;

		private String serverCertificateId;

		private Long expireTimeStamp;

		private String regionId;

		private String encryptionAlgorithm;

		private String serverCertificateName;

		private String fingerprint;

		private String commonName;

		private String resourceGroupId;

		private String regionIdAlias;

		private Integer isAliCloudCertificate;

		private String aliCloudCertificateId;

		private List<Tag> tags;

		private List<String> subjectAlternativeNames;

		public Long getCreateTimeStamp() {
			return this.createTimeStamp;
		}

		public void setCreateTimeStamp(Long createTimeStamp) {
			this.createTimeStamp = createTimeStamp;
		}

		public String getAliCloudCertificateName() {
			return this.aliCloudCertificateName;
		}

		public void setAliCloudCertificateName(String aliCloudCertificateName) {
			this.aliCloudCertificateName = aliCloudCertificateName;
		}

		public String getStandardType() {
			return this.standardType;
		}

		public void setStandardType(String standardType) {
			this.standardType = standardType;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Integer getEncryptionKeyLength() {
			return this.encryptionKeyLength;
		}

		public void setEncryptionKeyLength(Integer encryptionKeyLength) {
			this.encryptionKeyLength = encryptionKeyLength;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getServerCertificateId() {
			return this.serverCertificateId;
		}

		public void setServerCertificateId(String serverCertificateId) {
			this.serverCertificateId = serverCertificateId;
		}

		public Long getExpireTimeStamp() {
			return this.expireTimeStamp;
		}

		public void setExpireTimeStamp(Long expireTimeStamp) {
			this.expireTimeStamp = expireTimeStamp;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getEncryptionAlgorithm() {
			return this.encryptionAlgorithm;
		}

		public void setEncryptionAlgorithm(String encryptionAlgorithm) {
			this.encryptionAlgorithm = encryptionAlgorithm;
		}

		public String getServerCertificateName() {
			return this.serverCertificateName;
		}

		public void setServerCertificateName(String serverCertificateName) {
			this.serverCertificateName = serverCertificateName;
		}

		public String getFingerprint() {
			return this.fingerprint;
		}

		public void setFingerprint(String fingerprint) {
			this.fingerprint = fingerprint;
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

		public String getRegionIdAlias() {
			return this.regionIdAlias;
		}

		public void setRegionIdAlias(String regionIdAlias) {
			this.regionIdAlias = regionIdAlias;
		}

		public Integer getIsAliCloudCertificate() {
			return this.isAliCloudCertificate;
		}

		public void setIsAliCloudCertificate(Integer isAliCloudCertificate) {
			this.isAliCloudCertificate = isAliCloudCertificate;
		}

		public String getAliCloudCertificateId() {
			return this.aliCloudCertificateId;
		}

		public void setAliCloudCertificateId(String aliCloudCertificateId) {
			this.aliCloudCertificateId = aliCloudCertificateId;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getSubjectAlternativeNames() {
			return this.subjectAlternativeNames;
		}

		public void setSubjectAlternativeNames(List<String> subjectAlternativeNames) {
			this.subjectAlternativeNames = subjectAlternativeNames;
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
	}

	@Override
	public DescribeServerCertificatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeServerCertificatesResponseUnmarshaller.unmarshall(this, context);
	}
}

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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeSignaturesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSignaturesResponse extends AcsResponse {

	private Integer pageNumber;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<SignatureInfo> signatureInfos;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<SignatureInfo> getSignatureInfos() {
		return this.signatureInfos;
	}

	public void setSignatureInfos(List<SignatureInfo> signatureInfos) {
		this.signatureInfos = signatureInfos;
	}

	public static class SignatureInfo {

		private String modifiedTime;

		private String signatureId;

		private String signatureSecret;

		private String signatureName;

		private String signatureKey;

		private String createdTime;

		private String regionId;

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getSignatureId() {
			return this.signatureId;
		}

		public void setSignatureId(String signatureId) {
			this.signatureId = signatureId;
		}

		public String getSignatureSecret() {
			return this.signatureSecret;
		}

		public void setSignatureSecret(String signatureSecret) {
			this.signatureSecret = signatureSecret;
		}

		public String getSignatureName() {
			return this.signatureName;
		}

		public void setSignatureName(String signatureName) {
			this.signatureName = signatureName;
		}

		public String getSignatureKey() {
			return this.signatureKey;
		}

		public void setSignatureKey(String signatureKey) {
			this.signatureKey = signatureKey;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public DescribeSignaturesResponse getInstance(UnmarshallerContext context) {
		return	DescribeSignaturesResponseUnmarshaller.unmarshall(this, context);
	}
}

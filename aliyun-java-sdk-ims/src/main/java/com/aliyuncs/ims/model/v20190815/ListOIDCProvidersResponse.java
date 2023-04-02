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

package com.aliyuncs.ims.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ims.transform.v20190815.ListOIDCProvidersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOIDCProvidersResponse extends AcsResponse {

	private String requestId;

	private Boolean isTruncated;

	private String marker;

	private List<OIDCProvider> oIDCProviders;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getIsTruncated() {
		return this.isTruncated;
	}

	public void setIsTruncated(Boolean isTruncated) {
		this.isTruncated = isTruncated;
	}

	public String getMarker() {
		return this.marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
	}

	public List<OIDCProvider> getOIDCProviders() {
		return this.oIDCProviders;
	}

	public void setOIDCProviders(List<OIDCProvider> oIDCProviders) {
		this.oIDCProviders = oIDCProviders;
	}

	public static class OIDCProvider {

		private String updateDate;

		private String description;

		private String oIDCProviderName;

		private String createDate;

		private String arn;

		private String issuerUrl;

		private String fingerprints;

		private String clientIds;

		private String gmtCreate;

		private String gmtModified;

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getOIDCProviderName() {
			return this.oIDCProviderName;
		}

		public void setOIDCProviderName(String oIDCProviderName) {
			this.oIDCProviderName = oIDCProviderName;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getArn() {
			return this.arn;
		}

		public void setArn(String arn) {
			this.arn = arn;
		}

		public String getIssuerUrl() {
			return this.issuerUrl;
		}

		public void setIssuerUrl(String issuerUrl) {
			this.issuerUrl = issuerUrl;
		}

		public String getFingerprints() {
			return this.fingerprints;
		}

		public void setFingerprints(String fingerprints) {
			this.fingerprints = fingerprints;
		}

		public String getClientIds() {
			return this.clientIds;
		}

		public void setClientIds(String clientIds) {
			this.clientIds = clientIds;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public ListOIDCProvidersResponse getInstance(UnmarshallerContext context) {
		return	ListOIDCProvidersResponseUnmarshaller.unmarshall(this, context);
	}
}

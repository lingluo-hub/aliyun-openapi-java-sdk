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

package com.aliyuncs.eflo.model.v20220530;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eflo.transform.v20220530.GetSubnetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSubnetResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Content content;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public static class Content {

		private String createTime;

		private String gmtModified;

		private String tenantId;

		private String regionId;

		private String zoneId;

		private String subnetId;

		private String subnetName;

		private String cidr;

		private String description;

		private String vpdId;

		private String type;

		private String status;

		private String message;

		private Long ncCount;

		private Long lbCount;

		private Integer availableIps;

		private String resourceGroupId;

		private List<Tag> tags;

		private VpdBaseInfo vpdBaseInfo;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getSubnetId() {
			return this.subnetId;
		}

		public void setSubnetId(String subnetId) {
			this.subnetId = subnetId;
		}

		public String getSubnetName() {
			return this.subnetName;
		}

		public void setSubnetName(String subnetName) {
			this.subnetName = subnetName;
		}

		public String getCidr() {
			return this.cidr;
		}

		public void setCidr(String cidr) {
			this.cidr = cidr;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getVpdId() {
			return this.vpdId;
		}

		public void setVpdId(String vpdId) {
			this.vpdId = vpdId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Long getNcCount() {
			return this.ncCount;
		}

		public void setNcCount(Long ncCount) {
			this.ncCount = ncCount;
		}

		public Long getLbCount() {
			return this.lbCount;
		}

		public void setLbCount(Long lbCount) {
			this.lbCount = lbCount;
		}

		public Integer getAvailableIps() {
			return this.availableIps;
		}

		public void setAvailableIps(Integer availableIps) {
			this.availableIps = availableIps;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public VpdBaseInfo getVpdBaseInfo() {
			return this.vpdBaseInfo;
		}

		public void setVpdBaseInfo(VpdBaseInfo vpdBaseInfo) {
			this.vpdBaseInfo = vpdBaseInfo;
		}

		public static class Tag {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}

		public static class VpdBaseInfo {

			private String vpdId;

			private String vpdName;

			private String cidr;

			private String createTime;

			public String getVpdId() {
				return this.vpdId;
			}

			public void setVpdId(String vpdId) {
				this.vpdId = vpdId;
			}

			public String getVpdName() {
				return this.vpdName;
			}

			public void setVpdName(String vpdName) {
				this.vpdName = vpdName;
			}

			public String getCidr() {
				return this.cidr;
			}

			public void setCidr(String cidr) {
				this.cidr = cidr;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}
		}
	}

	@Override
	public GetSubnetResponse getInstance(UnmarshallerContext context) {
		return	GetSubnetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

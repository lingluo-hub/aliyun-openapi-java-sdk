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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeGtmInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGtmInstancesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalPages;

	private Integer totalItems;

	private List<GtmInstance> gtmInstances;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public List<GtmInstance> getGtmInstances() {
		return this.gtmInstances;
	}

	public void setGtmInstances(List<GtmInstance> gtmInstances) {
		this.gtmInstances = gtmInstances;
	}

	public static class GtmInstance {

		private String expireTime;

		private Integer accessStrategyNum;

		private String createTime;

		private String cnameMode;

		private String instanceId;

		private Long expireTimestamp;

		private Integer ttl;

		private String alertGroup;

		private Integer addressPoolNum;

		private String instanceName;

		private String lbaStrategy;

		private String cname;

		private String versionCode;

		private String userDomainName;

		private Long createTimestamp;

		private String resourceGroupId;

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Integer getAccessStrategyNum() {
			return this.accessStrategyNum;
		}

		public void setAccessStrategyNum(Integer accessStrategyNum) {
			this.accessStrategyNum = accessStrategyNum;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getCnameMode() {
			return this.cnameMode;
		}

		public void setCnameMode(String cnameMode) {
			this.cnameMode = cnameMode;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getExpireTimestamp() {
			return this.expireTimestamp;
		}

		public void setExpireTimestamp(Long expireTimestamp) {
			this.expireTimestamp = expireTimestamp;
		}

		public Integer getTtl() {
			return this.ttl;
		}

		public void setTtl(Integer ttl) {
			this.ttl = ttl;
		}

		public String getAlertGroup() {
			return this.alertGroup;
		}

		public void setAlertGroup(String alertGroup) {
			this.alertGroup = alertGroup;
		}

		public Integer getAddressPoolNum() {
			return this.addressPoolNum;
		}

		public void setAddressPoolNum(Integer addressPoolNum) {
			this.addressPoolNum = addressPoolNum;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getLbaStrategy() {
			return this.lbaStrategy;
		}

		public void setLbaStrategy(String lbaStrategy) {
			this.lbaStrategy = lbaStrategy;
		}

		public String getCname() {
			return this.cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public String getVersionCode() {
			return this.versionCode;
		}

		public void setVersionCode(String versionCode) {
			this.versionCode = versionCode;
		}

		public String getUserDomainName() {
			return this.userDomainName;
		}

		public void setUserDomainName(String userDomainName) {
			this.userDomainName = userDomainName;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}
	}

	@Override
	public DescribeGtmInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeGtmInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}

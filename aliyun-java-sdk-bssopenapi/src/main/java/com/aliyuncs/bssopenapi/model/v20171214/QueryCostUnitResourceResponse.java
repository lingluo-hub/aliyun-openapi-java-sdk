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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QueryCostUnitResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCostUnitResourceResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNum;

		private Integer pageSize;

		private Integer totalCount;

		private List<ResourceInstanceList> resourceInstanceDtoList;

		private CostUnit costUnit;

		private CostUnitStatisInfo costUnitStatisInfo;

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
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

		public List<ResourceInstanceList> getResourceInstanceDtoList() {
			return this.resourceInstanceDtoList;
		}

		public void setResourceInstanceDtoList(List<ResourceInstanceList> resourceInstanceDtoList) {
			this.resourceInstanceDtoList = resourceInstanceDtoList;
		}

		public CostUnit getCostUnit() {
			return this.costUnit;
		}

		public void setCostUnit(CostUnit costUnit) {
			this.costUnit = costUnit;
		}

		public CostUnitStatisInfo getCostUnitStatisInfo() {
			return this.costUnitStatisInfo;
		}

		public void setCostUnitStatisInfo(CostUnitStatisInfo costUnitStatisInfo) {
			this.costUnitStatisInfo = costUnitStatisInfo;
		}

		public static class ResourceInstanceList {

			private String commodityCode;

			private String resourceUserName;

			private String commodityName;

			private Long resourceUserId;

			private String apportionName;

			private String apportionCode;

			private String resourceType;

			private String resourceNick;

			private String resourceTag;

			private String resourceId;

			private String resourceGroup;

			private String relatedResources;

			private String resourceStatus;

			public String getCommodityCode() {
				return this.commodityCode;
			}

			public void setCommodityCode(String commodityCode) {
				this.commodityCode = commodityCode;
			}

			public String getResourceUserName() {
				return this.resourceUserName;
			}

			public void setResourceUserName(String resourceUserName) {
				this.resourceUserName = resourceUserName;
			}

			public String getCommodityName() {
				return this.commodityName;
			}

			public void setCommodityName(String commodityName) {
				this.commodityName = commodityName;
			}

			public Long getResourceUserId() {
				return this.resourceUserId;
			}

			public void setResourceUserId(Long resourceUserId) {
				this.resourceUserId = resourceUserId;
			}

			public String getApportionName() {
				return this.apportionName;
			}

			public void setApportionName(String apportionName) {
				this.apportionName = apportionName;
			}

			public String getApportionCode() {
				return this.apportionCode;
			}

			public void setApportionCode(String apportionCode) {
				this.apportionCode = apportionCode;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getResourceNick() {
				return this.resourceNick;
			}

			public void setResourceNick(String resourceNick) {
				this.resourceNick = resourceNick;
			}

			public String getResourceTag() {
				return this.resourceTag;
			}

			public void setResourceTag(String resourceTag) {
				this.resourceTag = resourceTag;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public String getResourceGroup() {
				return this.resourceGroup;
			}

			public void setResourceGroup(String resourceGroup) {
				this.resourceGroup = resourceGroup;
			}

			public String getRelatedResources() {
				return this.relatedResources;
			}

			public void setRelatedResources(String relatedResources) {
				this.relatedResources = relatedResources;
			}

			public String getResourceStatus() {
				return this.resourceStatus;
			}

			public void setResourceStatus(String resourceStatus) {
				this.resourceStatus = resourceStatus;
			}
		}

		public static class CostUnit {

			private Long parentUnitId;

			private String unitName;

			private Long unitId;

			private Long ownerUid;

			public Long getParentUnitId() {
				return this.parentUnitId;
			}

			public void setParentUnitId(Long parentUnitId) {
				this.parentUnitId = parentUnitId;
			}

			public String getUnitName() {
				return this.unitName;
			}

			public void setUnitName(String unitName) {
				this.unitName = unitName;
			}

			public Long getUnitId() {
				return this.unitId;
			}

			public void setUnitId(Long unitId) {
				this.unitId = unitId;
			}

			public Long getOwnerUid() {
				return this.ownerUid;
			}

			public void setOwnerUid(Long ownerUid) {
				this.ownerUid = ownerUid;
			}
		}

		public static class CostUnitStatisInfo {

			private Long totalResourceCount;

			private Long resourceCount;

			private Long totalUserCount;

			private Long subUnitCount;

			private Long resourceGroupCount;

			private Long totalResourceGroupCount;

			private Long userCount;

			public Long getTotalResourceCount() {
				return this.totalResourceCount;
			}

			public void setTotalResourceCount(Long totalResourceCount) {
				this.totalResourceCount = totalResourceCount;
			}

			public Long getResourceCount() {
				return this.resourceCount;
			}

			public void setResourceCount(Long resourceCount) {
				this.resourceCount = resourceCount;
			}

			public Long getTotalUserCount() {
				return this.totalUserCount;
			}

			public void setTotalUserCount(Long totalUserCount) {
				this.totalUserCount = totalUserCount;
			}

			public Long getSubUnitCount() {
				return this.subUnitCount;
			}

			public void setSubUnitCount(Long subUnitCount) {
				this.subUnitCount = subUnitCount;
			}

			public Long getResourceGroupCount() {
				return this.resourceGroupCount;
			}

			public void setResourceGroupCount(Long resourceGroupCount) {
				this.resourceGroupCount = resourceGroupCount;
			}

			public Long getTotalResourceGroupCount() {
				return this.totalResourceGroupCount;
			}

			public void setTotalResourceGroupCount(Long totalResourceGroupCount) {
				this.totalResourceGroupCount = totalResourceGroupCount;
			}

			public Long getUserCount() {
				return this.userCount;
			}

			public void setUserCount(Long userCount) {
				this.userCount = userCount;
			}
		}
	}

	@Override
	public QueryCostUnitResourceResponse getInstance(UnmarshallerContext context) {
		return	QueryCostUnitResourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

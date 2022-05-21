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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeCapacityReservationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCapacityReservationsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private Integer maxResults;

	private List<CapacityReservationItem> capacityReservationSet;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<CapacityReservationItem> getCapacityReservationSet() {
		return this.capacityReservationSet;
	}

	public void setCapacityReservationSet(List<CapacityReservationItem> capacityReservationSet) {
		this.capacityReservationSet = capacityReservationSet;
	}

	public static class CapacityReservationItem {

		private String status;

		private String timeSlot;

		private String privatePoolOptionsMatchCriteria;

		private String privatePoolOptionsId;

		private String privatePoolOptionsName;

		private String regionId;

		private String instanceChargeType;

		private String endTime;

		private String startTime;

		private String description;

		private String endTimeType;

		private String resourceGroupId;

		private String platform;

		private String startTimeType;

		private List<AllocatedResource> allocatedResources;

		private List<Tag> tags;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTimeSlot() {
			return this.timeSlot;
		}

		public void setTimeSlot(String timeSlot) {
			this.timeSlot = timeSlot;
		}

		public String getPrivatePoolOptionsMatchCriteria() {
			return this.privatePoolOptionsMatchCriteria;
		}

		public void setPrivatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
			this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
		}

		public String getPrivatePoolOptionsId() {
			return this.privatePoolOptionsId;
		}

		public void setPrivatePoolOptionsId(String privatePoolOptionsId) {
			this.privatePoolOptionsId = privatePoolOptionsId;
		}

		public String getPrivatePoolOptionsName() {
			return this.privatePoolOptionsName;
		}

		public void setPrivatePoolOptionsName(String privatePoolOptionsName) {
			this.privatePoolOptionsName = privatePoolOptionsName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getEndTimeType() {
			return this.endTimeType;
		}

		public void setEndTimeType(String endTimeType) {
			this.endTimeType = endTimeType;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getStartTimeType() {
			return this.startTimeType;
		}

		public void setStartTimeType(String startTimeType) {
			this.startTimeType = startTimeType;
		}

		public List<AllocatedResource> getAllocatedResources() {
			return this.allocatedResources;
		}

		public void setAllocatedResources(List<AllocatedResource> allocatedResources) {
			this.allocatedResources = allocatedResources;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class AllocatedResource {

			private Integer usedAmount;

			private Integer totalAmount;

			private String zoneId;

			private String instanceType;

			public Integer getUsedAmount() {
				return this.usedAmount;
			}

			public void setUsedAmount(Integer usedAmount) {
				this.usedAmount = usedAmount;
			}

			public Integer getTotalAmount() {
				return this.totalAmount;
			}

			public void setTotalAmount(Integer totalAmount) {
				this.totalAmount = totalAmount;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}
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
	public DescribeCapacityReservationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCapacityReservationsResponseUnmarshaller.unmarshall(this, context);
	}
}

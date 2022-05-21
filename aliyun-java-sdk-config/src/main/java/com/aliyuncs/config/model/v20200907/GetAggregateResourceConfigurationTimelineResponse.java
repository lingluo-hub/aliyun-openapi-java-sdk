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

package com.aliyuncs.config.model.v20200907;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.GetAggregateResourceConfigurationTimelineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAggregateResourceConfigurationTimelineResponse extends AcsResponse {

	private String requestId;

	private ResourceConfigurationTimeline resourceConfigurationTimeline;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResourceConfigurationTimeline getResourceConfigurationTimeline() {
		return this.resourceConfigurationTimeline;
	}

	public void setResourceConfigurationTimeline(ResourceConfigurationTimeline resourceConfigurationTimeline) {
		this.resourceConfigurationTimeline = resourceConfigurationTimeline;
	}

	public static class ResourceConfigurationTimeline {

		private String nextToken;

		private Integer maxResults;

		private List<ConfigurationListItem> configurationList;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public Integer getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Integer maxResults) {
			this.maxResults = maxResults;
		}

		public List<ConfigurationListItem> getConfigurationList() {
			return this.configurationList;
		}

		public void setConfigurationList(List<ConfigurationListItem> configurationList) {
			this.configurationList = configurationList;
		}

		public static class ConfigurationListItem {

			private String relationship;

			private String tags;

			private Long accountId;

			private String resourceEventType;

			private String relationshipDiff;

			private String availabilityZone;

			private String resourceType;

			private String resourceCreateTime;

			private String region;

			private String captureTime;

			private String configurationDiff;

			private String resourceId;

			private String resourceName;

			public String getRelationship() {
				return this.relationship;
			}

			public void setRelationship(String relationship) {
				this.relationship = relationship;
			}

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}

			public Long getAccountId() {
				return this.accountId;
			}

			public void setAccountId(Long accountId) {
				this.accountId = accountId;
			}

			public String getResourceEventType() {
				return this.resourceEventType;
			}

			public void setResourceEventType(String resourceEventType) {
				this.resourceEventType = resourceEventType;
			}

			public String getRelationshipDiff() {
				return this.relationshipDiff;
			}

			public void setRelationshipDiff(String relationshipDiff) {
				this.relationshipDiff = relationshipDiff;
			}

			public String getAvailabilityZone() {
				return this.availabilityZone;
			}

			public void setAvailabilityZone(String availabilityZone) {
				this.availabilityZone = availabilityZone;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getResourceCreateTime() {
				return this.resourceCreateTime;
			}

			public void setResourceCreateTime(String resourceCreateTime) {
				this.resourceCreateTime = resourceCreateTime;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getCaptureTime() {
				return this.captureTime;
			}

			public void setCaptureTime(String captureTime) {
				this.captureTime = captureTime;
			}

			public String getConfigurationDiff() {
				return this.configurationDiff;
			}

			public void setConfigurationDiff(String configurationDiff) {
				this.configurationDiff = configurationDiff;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public String getResourceName() {
				return this.resourceName;
			}

			public void setResourceName(String resourceName) {
				this.resourceName = resourceName;
			}
		}
	}

	@Override
	public GetAggregateResourceConfigurationTimelineResponse getInstance(UnmarshallerContext context) {
		return	GetAggregateResourceConfigurationTimelineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

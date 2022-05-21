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
import com.aliyuncs.slb.transform.v20140515.DescribeVServerGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVServerGroupsResponse extends AcsResponse {

	private String requestId;

	private List<VServerGroup> vServerGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<VServerGroup> getVServerGroups() {
		return this.vServerGroups;
	}

	public void setVServerGroups(List<VServerGroup> vServerGroups) {
		this.vServerGroups = vServerGroups;
	}

	public static class VServerGroup {

		private String vServerGroupId;

		private String serviceManagedMode;

		private String vServerGroupName;

		private Long serverCount;

		private AssociatedObjects associatedObjects;

		public String getVServerGroupId() {
			return this.vServerGroupId;
		}

		public void setVServerGroupId(String vServerGroupId) {
			this.vServerGroupId = vServerGroupId;
		}

		public String getServiceManagedMode() {
			return this.serviceManagedMode;
		}

		public void setServiceManagedMode(String serviceManagedMode) {
			this.serviceManagedMode = serviceManagedMode;
		}

		public String getVServerGroupName() {
			return this.vServerGroupName;
		}

		public void setVServerGroupName(String vServerGroupName) {
			this.vServerGroupName = vServerGroupName;
		}

		public Long getServerCount() {
			return this.serverCount;
		}

		public void setServerCount(Long serverCount) {
			this.serverCount = serverCount;
		}

		public AssociatedObjects getAssociatedObjects() {
			return this.associatedObjects;
		}

		public void setAssociatedObjects(AssociatedObjects associatedObjects) {
			this.associatedObjects = associatedObjects;
		}

		public static class AssociatedObjects {

			private List<Listener> listeners;

			private List<Rule> rules;

			public List<Listener> getListeners() {
				return this.listeners;
			}

			public void setListeners(List<Listener> listeners) {
				this.listeners = listeners;
			}

			public List<Rule> getRules() {
				return this.rules;
			}

			public void setRules(List<Rule> rules) {
				this.rules = rules;
			}

			public static class Listener {

				private Integer port;

				private String protocol;

				public Integer getPort() {
					return this.port;
				}

				public void setPort(Integer port) {
					this.port = port;
				}

				public String getBizProtocol() {
					return this.protocol;
				}

				public void setBizProtocol(String protocol) {
					this.protocol = protocol;
				}
			}

			public static class Rule {

				private String url;

				private String domain;

				private String ruleName;

				private String ruleId;

				public String getUrl() {
					return this.url;
				}

				public void setUrl(String url) {
					this.url = url;
				}

				public String getDomain() {
					return this.domain;
				}

				public void setDomain(String domain) {
					this.domain = domain;
				}

				public String getRuleName() {
					return this.ruleName;
				}

				public void setRuleName(String ruleName) {
					this.ruleName = ruleName;
				}

				public String getRuleId() {
					return this.ruleId;
				}

				public void setRuleId(String ruleId) {
					this.ruleId = ruleId;
				}
			}
		}
	}

	@Override
	public DescribeVServerGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVServerGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}

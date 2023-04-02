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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeLogMetaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogMetaResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<LogMeta> logMetaList;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LogMeta> getLogMetaList() {
		return this.logMetaList;
	}

	public void setLogMetaList(List<LogMeta> logMetaList) {
		this.logMetaList = logMetaList;
	}

	public static class LogMeta {

		private String logDesc;

		private String status;

		private String logStore;

		private String userProject;

		private String category;

		private String project;

		private String userLogStore;

		private String userRegion;

		private Integer ttl;

		private Integer hotTtl;

		private String topic;

		private String configLogStore;

		private String configLogStoreDesc;

		public String getLogDesc() {
			return this.logDesc;
		}

		public void setLogDesc(String logDesc) {
			this.logDesc = logDesc;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getLogStore() {
			return this.logStore;
		}

		public void setLogStore(String logStore) {
			this.logStore = logStore;
		}

		public String getUserProject() {
			return this.userProject;
		}

		public void setUserProject(String userProject) {
			this.userProject = userProject;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getProject() {
			return this.project;
		}

		public void setProject(String project) {
			this.project = project;
		}

		public String getUserLogStore() {
			return this.userLogStore;
		}

		public void setUserLogStore(String userLogStore) {
			this.userLogStore = userLogStore;
		}

		public String getUserRegion() {
			return this.userRegion;
		}

		public void setUserRegion(String userRegion) {
			this.userRegion = userRegion;
		}

		public Integer getTtl() {
			return this.ttl;
		}

		public void setTtl(Integer ttl) {
			this.ttl = ttl;
		}

		public Integer getHotTtl() {
			return this.hotTtl;
		}

		public void setHotTtl(Integer hotTtl) {
			this.hotTtl = hotTtl;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public String getConfigLogStore() {
			return this.configLogStore;
		}

		public void setConfigLogStore(String configLogStore) {
			this.configLogStore = configLogStore;
		}

		public String getConfigLogStoreDesc() {
			return this.configLogStoreDesc;
		}

		public void setConfigLogStoreDesc(String configLogStoreDesc) {
			this.configLogStoreDesc = configLogStoreDesc;
		}
	}

	@Override
	public DescribeLogMetaResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogMetaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

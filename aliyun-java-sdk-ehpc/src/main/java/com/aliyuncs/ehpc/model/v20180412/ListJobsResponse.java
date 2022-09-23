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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.ListJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobsResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<JobInfo> jobs;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<JobInfo> getJobs() {
		return this.jobs;
	}

	public void setJobs(List<JobInfo> jobs) {
		this.jobs = jobs;
	}

	public static class JobInfo {

		private String owner;

		private String comment;

		private String state;

		private String stderr;

		private String priority;

		private String shellPath;

		private String stdout;

		private String arrayRequest;

		private String startTime;

		private String lastModifyTime;

		private String nodeList;

		private String name;

		private String id;

		private String submitTime;

		private Resources resources;

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getStderr() {
			return this.stderr;
		}

		public void setStderr(String stderr) {
			this.stderr = stderr;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getShellPath() {
			return this.shellPath;
		}

		public void setShellPath(String shellPath) {
			this.shellPath = shellPath;
		}

		public String getStdout() {
			return this.stdout;
		}

		public void setStdout(String stdout) {
			this.stdout = stdout;
		}

		public String getArrayRequest() {
			return this.arrayRequest;
		}

		public void setArrayRequest(String arrayRequest) {
			this.arrayRequest = arrayRequest;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getLastModifyTime() {
			return this.lastModifyTime;
		}

		public void setLastModifyTime(String lastModifyTime) {
			this.lastModifyTime = lastModifyTime;
		}

		public String getNodeList() {
			return this.nodeList;
		}

		public void setNodeList(String nodeList) {
			this.nodeList = nodeList;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getSubmitTime() {
			return this.submitTime;
		}

		public void setSubmitTime(String submitTime) {
			this.submitTime = submitTime;
		}

		public Resources getResources() {
			return this.resources;
		}

		public void setResources(Resources resources) {
			this.resources = resources;
		}

		public static class Resources {

			private Integer nodes;

			private Integer cores;

			public Integer getNodes() {
				return this.nodes;
			}

			public void setNodes(Integer nodes) {
				this.nodes = nodes;
			}

			public Integer getCores() {
				return this.cores;
			}

			public void setCores(Integer cores) {
				this.cores = cores;
			}
		}
	}

	@Override
	public ListJobsResponse getInstance(UnmarshallerContext context) {
		return	ListJobsResponseUnmarshaller.unmarshall(this, context);
	}
}

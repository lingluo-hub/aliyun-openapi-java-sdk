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

package com.aliyuncs.codeup.model.v20200414;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.codeup.transform.v20200414.AddWebhookResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddWebhookResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private Boolean success;

	private String errorMessage;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long id;

		private String url;

		private String createdAt;

		private Long projectId;

		private Boolean pushEvents;

		private Boolean issuesEvents;

		private Boolean mergeRequestsEvents;

		private Boolean tagPushEvents;

		private Boolean buildEvents;

		private Boolean noteEvents;

		private Boolean enableSslVerification;

		private String lastTestResult;

		private String description;

		private String secretToken;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public Boolean getPushEvents() {
			return this.pushEvents;
		}

		public void setPushEvents(Boolean pushEvents) {
			this.pushEvents = pushEvents;
		}

		public Boolean getIssuesEvents() {
			return this.issuesEvents;
		}

		public void setIssuesEvents(Boolean issuesEvents) {
			this.issuesEvents = issuesEvents;
		}

		public Boolean getMergeRequestsEvents() {
			return this.mergeRequestsEvents;
		}

		public void setMergeRequestsEvents(Boolean mergeRequestsEvents) {
			this.mergeRequestsEvents = mergeRequestsEvents;
		}

		public Boolean getTagPushEvents() {
			return this.tagPushEvents;
		}

		public void setTagPushEvents(Boolean tagPushEvents) {
			this.tagPushEvents = tagPushEvents;
		}

		public Boolean getBuildEvents() {
			return this.buildEvents;
		}

		public void setBuildEvents(Boolean buildEvents) {
			this.buildEvents = buildEvents;
		}

		public Boolean getNoteEvents() {
			return this.noteEvents;
		}

		public void setNoteEvents(Boolean noteEvents) {
			this.noteEvents = noteEvents;
		}

		public Boolean getEnableSslVerification() {
			return this.enableSslVerification;
		}

		public void setEnableSslVerification(Boolean enableSslVerification) {
			this.enableSslVerification = enableSslVerification;
		}

		public String getLastTestResult() {
			return this.lastTestResult;
		}

		public void setLastTestResult(String lastTestResult) {
			this.lastTestResult = lastTestResult;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSecretToken() {
			return this.secretToken;
		}

		public void setSecretToken(String secretToken) {
			this.secretToken = secretToken;
		}
	}

	@Override
	public AddWebhookResponse getInstance(UnmarshallerContext context) {
		return	AddWebhookResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

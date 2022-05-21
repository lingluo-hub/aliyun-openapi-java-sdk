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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.oos.transform.v20190601.GetPatchBaselineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPatchBaselineResponse extends AcsResponse {

	private String requestId;

	private PatchBaseline patchBaseline;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PatchBaseline getPatchBaseline() {
		return this.patchBaseline;
	}

	public void setPatchBaseline(PatchBaseline patchBaseline) {
		this.patchBaseline = patchBaseline;
	}

	public static class PatchBaseline {

		private String id;

		private String name;

		private String createdDate;

		private String createdBy;

		private String updatedDate;

		private String updatedBy;

		private String description;

		private String shareType;

		private String operationSystem;

		private String approvalRules;

		private Boolean isDefault;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCreatedDate() {
			return this.createdDate;
		}

		public void setCreatedDate(String createdDate) {
			this.createdDate = createdDate;
		}

		public String getCreatedBy() {
			return this.createdBy;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}

		public String getUpdatedDate() {
			return this.updatedDate;
		}

		public void setUpdatedDate(String updatedDate) {
			this.updatedDate = updatedDate;
		}

		public String getUpdatedBy() {
			return this.updatedBy;
		}

		public void setUpdatedBy(String updatedBy) {
			this.updatedBy = updatedBy;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getShareType() {
			return this.shareType;
		}

		public void setShareType(String shareType) {
			this.shareType = shareType;
		}

		public String getOperationSystem() {
			return this.operationSystem;
		}

		public void setOperationSystem(String operationSystem) {
			this.operationSystem = operationSystem;
		}

		public String getApprovalRules() {
			return this.approvalRules;
		}

		public void setApprovalRules(String approvalRules) {
			this.approvalRules = approvalRules;
		}

		public Boolean getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(Boolean isDefault) {
			this.isDefault = isDefault;
		}
	}

	@Override
	public GetPatchBaselineResponse getInstance(UnmarshallerContext context) {
		return	GetPatchBaselineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

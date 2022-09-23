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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.ListSnapshotReposByInstanceIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSnapshotReposByInstanceIdResponse extends AcsResponse {

	private String requestId;

	private List<Repo> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Repo> getResult() {
		return this.result;
	}

	public void setResult(List<Repo> result) {
		this.result = result;
	}

	public static class Repo {

		private String snapWarehouse;

		private String repoPath;

		private String status;

		private String instanceId;

		public String getSnapWarehouse() {
			return this.snapWarehouse;
		}

		public void setSnapWarehouse(String snapWarehouse) {
			this.snapWarehouse = snapWarehouse;
		}

		public String getRepoPath() {
			return this.repoPath;
		}

		public void setRepoPath(String repoPath) {
			this.repoPath = repoPath;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	@Override
	public ListSnapshotReposByInstanceIdResponse getInstance(UnmarshallerContext context) {
		return	ListSnapshotReposByInstanceIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

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

package com.aliyuncs.sgw.model.v20180511;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sgw.transform.v20180511.DescribeBlockVolumeSnapshotsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBlockVolumeSnapshotsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private String message;

	private Integer pageSize;

	private Integer pageNumber;

	private String code;

	private Boolean success;

	private List<Snapshot> snapshots;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Snapshot> getSnapshots() {
		return this.snapshots;
	}

	public void setSnapshots(List<Snapshot> snapshots) {
		this.snapshots = snapshots;
	}

	public static class Snapshot {

		private String snapshotName;

		private Long createTime;

		private Long size;

		public String getSnapshotName() {
			return this.snapshotName;
		}

		public void setSnapshotName(String snapshotName) {
			this.snapshotName = snapshotName;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}
	}

	@Override
	public DescribeBlockVolumeSnapshotsResponse getInstance(UnmarshallerContext context) {
		return	DescribeBlockVolumeSnapshotsResponseUnmarshaller.unmarshall(this, context);
	}
}

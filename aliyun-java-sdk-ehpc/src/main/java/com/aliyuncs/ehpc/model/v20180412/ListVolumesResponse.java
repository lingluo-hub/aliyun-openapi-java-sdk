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
import com.aliyuncs.ehpc.transform.v20180412.ListVolumesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVolumesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<VolumeInfo> volumes;

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

	public List<VolumeInfo> getVolumes() {
		return this.volumes;
	}

	public void setVolumes(List<VolumeInfo> volumes) {
		this.volumes = volumes;
	}

	public static class VolumeInfo {

		private String volumeId;

		private String clusterName;

		private String remoteDirectory;

		private String volumeMountpoint;

		private String volumeType;

		private String volumeProtocol;

		private String regionId;

		private String clusterId;

		private List<VolumeInfo1> additionalVolumes;

		public String getVolumeId() {
			return this.volumeId;
		}

		public void setVolumeId(String volumeId) {
			this.volumeId = volumeId;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getRemoteDirectory() {
			return this.remoteDirectory;
		}

		public void setRemoteDirectory(String remoteDirectory) {
			this.remoteDirectory = remoteDirectory;
		}

		public String getVolumeMountpoint() {
			return this.volumeMountpoint;
		}

		public void setVolumeMountpoint(String volumeMountpoint) {
			this.volumeMountpoint = volumeMountpoint;
		}

		public String getVolumeType() {
			return this.volumeType;
		}

		public void setVolumeType(String volumeType) {
			this.volumeType = volumeType;
		}

		public String getVolumeProtocol() {
			return this.volumeProtocol;
		}

		public void setVolumeProtocol(String volumeProtocol) {
			this.volumeProtocol = volumeProtocol;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public List<VolumeInfo1> getAdditionalVolumes() {
			return this.additionalVolumes;
		}

		public void setAdditionalVolumes(List<VolumeInfo1> additionalVolumes) {
			this.additionalVolumes = additionalVolumes;
		}

		public static class VolumeInfo1 {

			private String jobQueue;

			private String volumeId;

			private String remoteDirectory;

			private String volumeMountpoint;

			private String role;

			private String localDirectory;

			private String volumeType;

			private String location;

			private String volumeProtocol;

			public String getJobQueue() {
				return this.jobQueue;
			}

			public void setJobQueue(String jobQueue) {
				this.jobQueue = jobQueue;
			}

			public String getVolumeId() {
				return this.volumeId;
			}

			public void setVolumeId(String volumeId) {
				this.volumeId = volumeId;
			}

			public String getRemoteDirectory() {
				return this.remoteDirectory;
			}

			public void setRemoteDirectory(String remoteDirectory) {
				this.remoteDirectory = remoteDirectory;
			}

			public String getVolumeMountpoint() {
				return this.volumeMountpoint;
			}

			public void setVolumeMountpoint(String volumeMountpoint) {
				this.volumeMountpoint = volumeMountpoint;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getLocalDirectory() {
				return this.localDirectory;
			}

			public void setLocalDirectory(String localDirectory) {
				this.localDirectory = localDirectory;
			}

			public String getVolumeType() {
				return this.volumeType;
			}

			public void setVolumeType(String volumeType) {
				this.volumeType = volumeType;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getVolumeProtocol() {
				return this.volumeProtocol;
			}

			public void setVolumeProtocol(String volumeProtocol) {
				this.volumeProtocol = volumeProtocol;
			}
		}
	}

	@Override
	public ListVolumesResponse getInstance(UnmarshallerContext context) {
		return	ListVolumesResponseUnmarshaller.unmarshall(this, context);
	}
}

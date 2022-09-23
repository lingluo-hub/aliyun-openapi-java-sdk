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
import com.aliyuncs.ehpc.transform.v20180412.GetClusterVolumesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClusterVolumesResponse extends AcsResponse {

	private String regionId;

	private String requestId;

	private List<VolumeInfo> volumes;

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<VolumeInfo> getVolumes() {
		return this.volumes;
	}

	public void setVolumes(List<VolumeInfo> volumes) {
		this.volumes = volumes;
	}

	public static class VolumeInfo {

		private String jobQueue;

		private String volumeId;

		private String remoteDirectory;

		private String volumeMountpoint;

		private String localDirectory;

		private String volumeType;

		private Boolean mustKeep;

		private String location;

		private String volumeProtocol;

		private List<RoleInfo> roles;

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

		public Boolean getMustKeep() {
			return this.mustKeep;
		}

		public void setMustKeep(Boolean mustKeep) {
			this.mustKeep = mustKeep;
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

		public List<RoleInfo> getRoles() {
			return this.roles;
		}

		public void setRoles(List<RoleInfo> roles) {
			this.roles = roles;
		}

		public static class RoleInfo {

			private String name;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public GetClusterVolumesResponse getInstance(UnmarshallerContext context) {
		return	GetClusterVolumesResponseUnmarshaller.unmarshall(this, context);
	}
}

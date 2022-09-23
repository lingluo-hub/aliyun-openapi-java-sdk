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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.GetClusterVolumesResponse;
import com.aliyuncs.ehpc.model.v20180412.GetClusterVolumesResponse.VolumeInfo;
import com.aliyuncs.ehpc.model.v20180412.GetClusterVolumesResponse.VolumeInfo.RoleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClusterVolumesResponseUnmarshaller {

	public static GetClusterVolumesResponse unmarshall(GetClusterVolumesResponse getClusterVolumesResponse, UnmarshallerContext _ctx) {
		
		getClusterVolumesResponse.setRequestId(_ctx.stringValue("GetClusterVolumesResponse.RequestId"));
		getClusterVolumesResponse.setRegionId(_ctx.stringValue("GetClusterVolumesResponse.RegionId"));

		List<VolumeInfo> volumes = new ArrayList<VolumeInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetClusterVolumesResponse.Volumes.Length"); i++) {
			VolumeInfo volumeInfo = new VolumeInfo();
			volumeInfo.setJobQueue(_ctx.stringValue("GetClusterVolumesResponse.Volumes["+ i +"].JobQueue"));
			volumeInfo.setVolumeId(_ctx.stringValue("GetClusterVolumesResponse.Volumes["+ i +"].VolumeId"));
			volumeInfo.setRemoteDirectory(_ctx.stringValue("GetClusterVolumesResponse.Volumes["+ i +"].RemoteDirectory"));
			volumeInfo.setVolumeMountpoint(_ctx.stringValue("GetClusterVolumesResponse.Volumes["+ i +"].VolumeMountpoint"));
			volumeInfo.setLocalDirectory(_ctx.stringValue("GetClusterVolumesResponse.Volumes["+ i +"].LocalDirectory"));
			volumeInfo.setVolumeType(_ctx.stringValue("GetClusterVolumesResponse.Volumes["+ i +"].VolumeType"));
			volumeInfo.setMustKeep(_ctx.booleanValue("GetClusterVolumesResponse.Volumes["+ i +"].MustKeep"));
			volumeInfo.setLocation(_ctx.stringValue("GetClusterVolumesResponse.Volumes["+ i +"].Location"));
			volumeInfo.setVolumeProtocol(_ctx.stringValue("GetClusterVolumesResponse.Volumes["+ i +"].VolumeProtocol"));

			List<RoleInfo> roles = new ArrayList<RoleInfo>();
			for (int j = 0; j < _ctx.lengthValue("GetClusterVolumesResponse.Volumes["+ i +"].Roles.Length"); j++) {
				RoleInfo roleInfo = new RoleInfo();
				roleInfo.setName(_ctx.stringValue("GetClusterVolumesResponse.Volumes["+ i +"].Roles["+ j +"].Name"));

				roles.add(roleInfo);
			}
			volumeInfo.setRoles(roles);

			volumes.add(volumeInfo);
		}
		getClusterVolumesResponse.setVolumes(volumes);
	 
	 	return getClusterVolumesResponse;
	}
}
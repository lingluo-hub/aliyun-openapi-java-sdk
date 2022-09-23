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

import com.aliyuncs.ehpc.model.v20180412.ListVolumesResponse;
import com.aliyuncs.ehpc.model.v20180412.ListVolumesResponse.VolumeInfo;
import com.aliyuncs.ehpc.model.v20180412.ListVolumesResponse.VolumeInfo.VolumeInfo1;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVolumesResponseUnmarshaller {

	public static ListVolumesResponse unmarshall(ListVolumesResponse listVolumesResponse, UnmarshallerContext _ctx) {
		
		listVolumesResponse.setRequestId(_ctx.stringValue("ListVolumesResponse.RequestId"));
		listVolumesResponse.setPageSize(_ctx.integerValue("ListVolumesResponse.PageSize"));
		listVolumesResponse.setPageNumber(_ctx.integerValue("ListVolumesResponse.PageNumber"));
		listVolumesResponse.setTotalCount(_ctx.integerValue("ListVolumesResponse.TotalCount"));

		List<VolumeInfo> volumes = new ArrayList<VolumeInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListVolumesResponse.Volumes.Length"); i++) {
			VolumeInfo volumeInfo = new VolumeInfo();
			volumeInfo.setVolumeId(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].VolumeId"));
			volumeInfo.setClusterName(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].ClusterName"));
			volumeInfo.setRemoteDirectory(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].RemoteDirectory"));
			volumeInfo.setVolumeMountpoint(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].VolumeMountpoint"));
			volumeInfo.setVolumeType(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].VolumeType"));
			volumeInfo.setVolumeProtocol(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].VolumeProtocol"));
			volumeInfo.setRegionId(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].RegionId"));
			volumeInfo.setClusterId(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].ClusterId"));

			List<VolumeInfo1> additionalVolumes = new ArrayList<VolumeInfo1>();
			for (int j = 0; j < _ctx.lengthValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes.Length"); j++) {
				VolumeInfo1 volumeInfo1 = new VolumeInfo1();
				volumeInfo1.setJobQueue(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes["+ j +"].JobQueue"));
				volumeInfo1.setVolumeId(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes["+ j +"].VolumeId"));
				volumeInfo1.setRemoteDirectory(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes["+ j +"].RemoteDirectory"));
				volumeInfo1.setVolumeMountpoint(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes["+ j +"].VolumeMountpoint"));
				volumeInfo1.setRole(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes["+ j +"].Role"));
				volumeInfo1.setLocalDirectory(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes["+ j +"].LocalDirectory"));
				volumeInfo1.setVolumeType(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes["+ j +"].VolumeType"));
				volumeInfo1.setLocation(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes["+ j +"].Location"));
				volumeInfo1.setVolumeProtocol(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes["+ j +"].VolumeProtocol"));

				additionalVolumes.add(volumeInfo1);
			}
			volumeInfo.setAdditionalVolumes(additionalVolumes);

			volumes.add(volumeInfo);
		}
		listVolumesResponse.setVolumes(volumes);
	 
	 	return listVolumesResponse;
	}
}
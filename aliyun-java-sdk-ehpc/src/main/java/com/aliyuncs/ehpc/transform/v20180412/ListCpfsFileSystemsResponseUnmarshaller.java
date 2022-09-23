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

import com.aliyuncs.ehpc.model.v20180412.ListCpfsFileSystemsResponse;
import com.aliyuncs.ehpc.model.v20180412.ListCpfsFileSystemsResponse.FileSystems;
import com.aliyuncs.ehpc.model.v20180412.ListCpfsFileSystemsResponse.FileSystems.MountTargets;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCpfsFileSystemsResponseUnmarshaller {

	public static ListCpfsFileSystemsResponse unmarshall(ListCpfsFileSystemsResponse listCpfsFileSystemsResponse, UnmarshallerContext _ctx) {
		
		listCpfsFileSystemsResponse.setRequestId(_ctx.stringValue("ListCpfsFileSystemsResponse.RequestId"));
		listCpfsFileSystemsResponse.setPageSize(_ctx.integerValue("ListCpfsFileSystemsResponse.PageSize"));
		listCpfsFileSystemsResponse.setPageNumber(_ctx.integerValue("ListCpfsFileSystemsResponse.PageNumber"));
		listCpfsFileSystemsResponse.setTotalCount(_ctx.integerValue("ListCpfsFileSystemsResponse.TotalCount"));

		List<FileSystems> fileSystemList = new ArrayList<FileSystems>();
		for (int i = 0; i < _ctx.lengthValue("ListCpfsFileSystemsResponse.FileSystemList.Length"); i++) {
			FileSystems fileSystems = new FileSystems();
			fileSystems.setFileSystemId(_ctx.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].FileSystemId"));
			fileSystems.setCapacity(_ctx.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].Capacity"));
			fileSystems.setCreateTime(_ctx.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].CreateTime"));
			fileSystems.setZoneId(_ctx.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].ZoneId"));
			fileSystems.setProtocolType(_ctx.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].ProtocolType"));
			fileSystems.setDestription(_ctx.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].Destription"));
			fileSystems.setRegionId(_ctx.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].RegionId"));

			List<MountTargets> mountTargetList = new ArrayList<MountTargets>();
			for (int j = 0; j < _ctx.lengthValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].MountTargetList.Length"); j++) {
				MountTargets mountTargets = new MountTargets();
				mountTargets.setVpcId(_ctx.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].VpcId"));
				mountTargets.setStatus(_ctx.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].Status"));
				mountTargets.setVswId(_ctx.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].VswId"));
				mountTargets.setNetworkType(_ctx.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].NetworkType"));
				mountTargets.setMountTargetDomain(_ctx.stringValue("ListCpfsFileSystemsResponse.FileSystemList["+ i +"].MountTargetList["+ j +"].MountTargetDomain"));

				mountTargetList.add(mountTargets);
			}
			fileSystems.setMountTargetList(mountTargetList);

			fileSystemList.add(fileSystems);
		}
		listCpfsFileSystemsResponse.setFileSystemList(fileSystemList);
	 
	 	return listCpfsFileSystemsResponse;
	}
}
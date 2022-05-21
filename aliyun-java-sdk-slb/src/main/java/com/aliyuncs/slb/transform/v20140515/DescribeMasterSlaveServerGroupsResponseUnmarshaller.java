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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeMasterSlaveServerGroupsResponse;
import com.aliyuncs.slb.model.v20140515.DescribeMasterSlaveServerGroupsResponse.MasterSlaveServerGroup;
import com.aliyuncs.slb.model.v20140515.DescribeMasterSlaveServerGroupsResponse.MasterSlaveServerGroup.AssociatedObjects;
import com.aliyuncs.slb.model.v20140515.DescribeMasterSlaveServerGroupsResponse.MasterSlaveServerGroup.AssociatedObjects.Listener;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMasterSlaveServerGroupsResponseUnmarshaller {

	public static DescribeMasterSlaveServerGroupsResponse unmarshall(DescribeMasterSlaveServerGroupsResponse describeMasterSlaveServerGroupsResponse, UnmarshallerContext _ctx) {
		
		describeMasterSlaveServerGroupsResponse.setRequestId(_ctx.stringValue("DescribeMasterSlaveServerGroupsResponse.RequestId"));

		List<MasterSlaveServerGroup> masterSlaveServerGroups = new ArrayList<MasterSlaveServerGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMasterSlaveServerGroupsResponse.MasterSlaveServerGroups.Length"); i++) {
			MasterSlaveServerGroup masterSlaveServerGroup = new MasterSlaveServerGroup();
			masterSlaveServerGroup.setServiceManagedMode(_ctx.stringValue("DescribeMasterSlaveServerGroupsResponse.MasterSlaveServerGroups["+ i +"].ServiceManagedMode"));
			masterSlaveServerGroup.setMasterSlaveServerGroupId(_ctx.stringValue("DescribeMasterSlaveServerGroupsResponse.MasterSlaveServerGroups["+ i +"].MasterSlaveServerGroupId"));
			masterSlaveServerGroup.setMasterSlaveServerGroupName(_ctx.stringValue("DescribeMasterSlaveServerGroupsResponse.MasterSlaveServerGroups["+ i +"].MasterSlaveServerGroupName"));

			AssociatedObjects associatedObjects = new AssociatedObjects();

			List<Listener> listeners = new ArrayList<Listener>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMasterSlaveServerGroupsResponse.MasterSlaveServerGroups["+ i +"].AssociatedObjects.Listeners.Length"); j++) {
				Listener listener = new Listener();
				listener.setPort(_ctx.integerValue("DescribeMasterSlaveServerGroupsResponse.MasterSlaveServerGroups["+ i +"].AssociatedObjects.Listeners["+ j +"].Port"));
				listener.setBizProtocol(_ctx.stringValue("DescribeMasterSlaveServerGroupsResponse.MasterSlaveServerGroups["+ i +"].AssociatedObjects.Listeners["+ j +"].Protocol"));

				listeners.add(listener);
			}
			associatedObjects.setListeners(listeners);
			masterSlaveServerGroup.setAssociatedObjects(associatedObjects);

			masterSlaveServerGroups.add(masterSlaveServerGroup);
		}
		describeMasterSlaveServerGroupsResponse.setMasterSlaveServerGroups(masterSlaveServerGroups);
	 
	 	return describeMasterSlaveServerGroupsResponse;
	}
}
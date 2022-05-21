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

import com.aliyuncs.slb.model.v20140515.AddVServerGroupBackendServersResponse;
import com.aliyuncs.slb.model.v20140515.AddVServerGroupBackendServersResponse.BackendServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddVServerGroupBackendServersResponseUnmarshaller {

	public static AddVServerGroupBackendServersResponse unmarshall(AddVServerGroupBackendServersResponse addVServerGroupBackendServersResponse, UnmarshallerContext _ctx) {
		
		addVServerGroupBackendServersResponse.setRequestId(_ctx.stringValue("AddVServerGroupBackendServersResponse.RequestId"));
		addVServerGroupBackendServersResponse.setVServerGroupId(_ctx.stringValue("AddVServerGroupBackendServersResponse.VServerGroupId"));

		List<BackendServer> backendServers = new ArrayList<BackendServer>();
		for (int i = 0; i < _ctx.lengthValue("AddVServerGroupBackendServersResponse.BackendServers.Length"); i++) {
			BackendServer backendServer = new BackendServer();
			backendServer.setVpcId(_ctx.stringValue("AddVServerGroupBackendServersResponse.BackendServers["+ i +"].VpcId"));
			backendServer.setType(_ctx.stringValue("AddVServerGroupBackendServersResponse.BackendServers["+ i +"].Type"));
			backendServer.setWeight(_ctx.integerValue("AddVServerGroupBackendServersResponse.BackendServers["+ i +"].Weight"));
			backendServer.setDescription(_ctx.stringValue("AddVServerGroupBackendServersResponse.BackendServers["+ i +"].Description"));
			backendServer.setServerRegionId(_ctx.stringValue("AddVServerGroupBackendServersResponse.BackendServers["+ i +"].ServerRegionId"));
			backendServer.setServerIp(_ctx.stringValue("AddVServerGroupBackendServersResponse.BackendServers["+ i +"].ServerIp"));
			backendServer.setPort(_ctx.integerValue("AddVServerGroupBackendServersResponse.BackendServers["+ i +"].Port"));
			backendServer.setVbrId(_ctx.stringValue("AddVServerGroupBackendServersResponse.BackendServers["+ i +"].VbrId"));
			backendServer.setServerId(_ctx.stringValue("AddVServerGroupBackendServersResponse.BackendServers["+ i +"].ServerId"));

			backendServers.add(backendServer);
		}
		addVServerGroupBackendServersResponse.setBackendServers(backendServers);
	 
	 	return addVServerGroupBackendServersResponse;
	}
}
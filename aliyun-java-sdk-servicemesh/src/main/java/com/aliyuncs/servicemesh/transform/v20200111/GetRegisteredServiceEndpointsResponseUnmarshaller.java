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

package com.aliyuncs.servicemesh.transform.v20200111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.servicemesh.model.v20200111.GetRegisteredServiceEndpointsResponse;
import com.aliyuncs.servicemesh.model.v20200111.GetRegisteredServiceEndpointsResponse.ServiceEndpoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRegisteredServiceEndpointsResponseUnmarshaller {

	public static GetRegisteredServiceEndpointsResponse unmarshall(GetRegisteredServiceEndpointsResponse getRegisteredServiceEndpointsResponse, UnmarshallerContext _ctx) {
		
		getRegisteredServiceEndpointsResponse.setRequestId(_ctx.stringValue("GetRegisteredServiceEndpointsResponse.RequestId"));

		List<ServiceEndpoint> serviceEndpoints = new ArrayList<ServiceEndpoint>();
		for (int i = 0; i < _ctx.lengthValue("GetRegisteredServiceEndpointsResponse.ServiceEndpoints.Length"); i++) {
			ServiceEndpoint serviceEndpoint = new ServiceEndpoint();
			serviceEndpoint.setAddress(_ctx.stringValue("GetRegisteredServiceEndpointsResponse.ServiceEndpoints["+ i +"].Address"));
			serviceEndpoint.setClusterId(_ctx.stringValue("GetRegisteredServiceEndpointsResponse.ServiceEndpoints["+ i +"].ClusterId"));

			serviceEndpoints.add(serviceEndpoint);
		}
		getRegisteredServiceEndpointsResponse.setServiceEndpoints(serviceEndpoints);
	 
	 	return getRegisteredServiceEndpointsResponse;
	}
}
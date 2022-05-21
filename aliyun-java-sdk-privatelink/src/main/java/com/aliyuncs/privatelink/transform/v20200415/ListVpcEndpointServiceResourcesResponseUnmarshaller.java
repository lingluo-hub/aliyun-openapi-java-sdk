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

package com.aliyuncs.privatelink.transform.v20200415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointServiceResourcesResponse;
import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointServiceResourcesResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpcEndpointServiceResourcesResponseUnmarshaller {

	public static ListVpcEndpointServiceResourcesResponse unmarshall(ListVpcEndpointServiceResourcesResponse listVpcEndpointServiceResourcesResponse, UnmarshallerContext _ctx) {
		
		listVpcEndpointServiceResourcesResponse.setRequestId(_ctx.stringValue("ListVpcEndpointServiceResourcesResponse.RequestId"));
		listVpcEndpointServiceResourcesResponse.setNextToken(_ctx.stringValue("ListVpcEndpointServiceResourcesResponse.NextToken"));
		listVpcEndpointServiceResourcesResponse.setMaxResults(_ctx.stringValue("ListVpcEndpointServiceResourcesResponse.MaxResults"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("ListVpcEndpointServiceResourcesResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setVpcId(_ctx.stringValue("ListVpcEndpointServiceResourcesResponse.Resources["+ i +"].VpcId"));
			resource.setVSwitchId(_ctx.stringValue("ListVpcEndpointServiceResourcesResponse.Resources["+ i +"].VSwitchId"));
			resource.setResourceType(_ctx.stringValue("ListVpcEndpointServiceResourcesResponse.Resources["+ i +"].ResourceType"));
			resource.setZoneId(_ctx.stringValue("ListVpcEndpointServiceResourcesResponse.Resources["+ i +"].ZoneId"));
			resource.setIp(_ctx.stringValue("ListVpcEndpointServiceResourcesResponse.Resources["+ i +"].Ip"));
			resource.setResourceId(_ctx.stringValue("ListVpcEndpointServiceResourcesResponse.Resources["+ i +"].ResourceId"));
			resource.setRegionId(_ctx.stringValue("ListVpcEndpointServiceResourcesResponse.Resources["+ i +"].RegionId"));
			resource.setRelatedEndpointCount(_ctx.longValue("ListVpcEndpointServiceResourcesResponse.Resources["+ i +"].RelatedEndpointCount"));
			resource.setRelatedDeprecatedEndpointCount(_ctx.longValue("ListVpcEndpointServiceResourcesResponse.Resources["+ i +"].RelatedDeprecatedEndpointCount"));
			resource.setAutoAllocatedEnabled(_ctx.booleanValue("ListVpcEndpointServiceResourcesResponse.Resources["+ i +"].AutoAllocatedEnabled"));
			resource.setStatusInfo(_ctx.stringValue("ListVpcEndpointServiceResourcesResponse.Resources["+ i +"].StatusInfo"));

			resources.add(resource);
		}
		listVpcEndpointServiceResourcesResponse.setResources(resources);
	 
	 	return listVpcEndpointServiceResourcesResponse;
	}
}
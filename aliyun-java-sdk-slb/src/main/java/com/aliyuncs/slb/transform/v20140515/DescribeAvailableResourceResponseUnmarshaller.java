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

import com.aliyuncs.slb.model.v20140515.DescribeAvailableResourceResponse;
import com.aliyuncs.slb.model.v20140515.DescribeAvailableResourceResponse.AvailableResource;
import com.aliyuncs.slb.model.v20140515.DescribeAvailableResourceResponse.AvailableResource.SupportResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableResourceResponseUnmarshaller {

	public static DescribeAvailableResourceResponse unmarshall(DescribeAvailableResourceResponse describeAvailableResourceResponse, UnmarshallerContext _ctx) {
		
		describeAvailableResourceResponse.setRequestId(_ctx.stringValue("DescribeAvailableResourceResponse.RequestId"));

		List<AvailableResource> availableResources = new ArrayList<AvailableResource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableResources.Length"); i++) {
			AvailableResource availableResource = new AvailableResource();
			availableResource.setSlaveZoneId(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableResources["+ i +"].SlaveZoneId"));
			availableResource.setMasterZoneId(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableResources["+ i +"].MasterZoneId"));

			List<SupportResource> supportResources = new ArrayList<SupportResource>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableResources["+ i +"].SupportResources.Length"); j++) {
				SupportResource supportResource = new SupportResource();
				supportResource.setAddressType(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableResources["+ i +"].SupportResources["+ j +"].AddressType"));
				supportResource.setAddressIPVersion(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableResources["+ i +"].SupportResources["+ j +"].AddressIPVersion"));

				supportResources.add(supportResource);
			}
			availableResource.setSupportResources(supportResources);

			availableResources.add(availableResource);
		}
		describeAvailableResourceResponse.setAvailableResources(availableResources);
	 
	 	return describeAvailableResourceResponse;
	}
}
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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.ListInstancesResponse;
import com.aliyuncs.swas_open.model.v20200601.ListInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setTotalCount(_ctx.integerValue("ListInstancesResponse.TotalCount"));
		listInstancesResponse.setPageSize(_ctx.integerValue("ListInstancesResponse.PageSize"));
		listInstancesResponse.setPageNumber(_ctx.integerValue("ListInstancesResponse.PageNumber"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Status"));
			instance.setCreationTime(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].CreationTime"));
			instance.setInnerIpAddress(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InnerIpAddress"));
			instance.setChargeType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ChargeType"));
			instance.setInstanceId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setPlanId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].PlanId"));
			instance.setPublicIpAddress(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].PublicIpAddress"));
			instance.setRegionId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setExpiredTime(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ExpiredTime"));
			instance.setInstanceName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setBusinessStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].BusinessStatus"));
			instance.setDdosStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].DdosStatus"));
			instance.setImageId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ImageId"));

			instances.add(instance);
		}
		listInstancesResponse.setInstances(instances);
	 
	 	return listInstancesResponse;
	}
}
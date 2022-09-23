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

import com.aliyuncs.ehpc.model.v20180412.ListAvailableEcsTypesResponse;
import com.aliyuncs.ehpc.model.v20180412.ListAvailableEcsTypesResponse.InstanceTypeFamilyInfo;
import com.aliyuncs.ehpc.model.v20180412.ListAvailableEcsTypesResponse.InstanceTypeFamilyInfo.TypesInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAvailableEcsTypesResponseUnmarshaller {

	public static ListAvailableEcsTypesResponse unmarshall(ListAvailableEcsTypesResponse listAvailableEcsTypesResponse, UnmarshallerContext _ctx) {
		
		listAvailableEcsTypesResponse.setRequestId(_ctx.stringValue("ListAvailableEcsTypesResponse.RequestId"));
		listAvailableEcsTypesResponse.setSupportSpotInstance(_ctx.booleanValue("ListAvailableEcsTypesResponse.SupportSpotInstance"));

		List<InstanceTypeFamilyInfo> instanceTypeFamilies = new ArrayList<InstanceTypeFamilyInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListAvailableEcsTypesResponse.InstanceTypeFamilies.Length"); i++) {
			InstanceTypeFamilyInfo instanceTypeFamilyInfo = new InstanceTypeFamilyInfo();
			instanceTypeFamilyInfo.setGeneration(_ctx.stringValue("ListAvailableEcsTypesResponse.InstanceTypeFamilies["+ i +"].Generation"));
			instanceTypeFamilyInfo.setInstanceTypeFamilyId(_ctx.stringValue("ListAvailableEcsTypesResponse.InstanceTypeFamilies["+ i +"].InstanceTypeFamilyId"));

			List<TypesInfo> types = new ArrayList<TypesInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListAvailableEcsTypesResponse.InstanceTypeFamilies["+ i +"].Types.Length"); j++) {
				TypesInfo typesInfo = new TypesInfo();
				typesInfo.setStatus(_ctx.stringValue("ListAvailableEcsTypesResponse.InstanceTypeFamilies["+ i +"].Types["+ j +"].Status"));
				typesInfo.setInstanceTypeId(_ctx.stringValue("ListAvailableEcsTypesResponse.InstanceTypeFamilies["+ i +"].Types["+ j +"].InstanceTypeId"));
				typesInfo.setInstanceBandwidthRx(_ctx.integerValue("ListAvailableEcsTypesResponse.InstanceTypeFamilies["+ i +"].Types["+ j +"].InstanceBandwidthRx"));
				typesInfo.setGPUSpec(_ctx.stringValue("ListAvailableEcsTypesResponse.InstanceTypeFamilies["+ i +"].Types["+ j +"].GPUSpec"));
				typesInfo.setInstanceBandwidthTx(_ctx.integerValue("ListAvailableEcsTypesResponse.InstanceTypeFamilies["+ i +"].Types["+ j +"].InstanceBandwidthTx"));
				typesInfo.setInstancePpsRx(_ctx.integerValue("ListAvailableEcsTypesResponse.InstanceTypeFamilies["+ i +"].Types["+ j +"].InstancePpsRx"));
				typesInfo.setInstancePpsTx(_ctx.integerValue("ListAvailableEcsTypesResponse.InstanceTypeFamilies["+ i +"].Types["+ j +"].InstancePpsTx"));
				typesInfo.setGPUAmount(_ctx.integerValue("ListAvailableEcsTypesResponse.InstanceTypeFamilies["+ i +"].Types["+ j +"].GPUAmount"));
				typesInfo.setCpuCoreCount(_ctx.integerValue("ListAvailableEcsTypesResponse.InstanceTypeFamilies["+ i +"].Types["+ j +"].CpuCoreCount"));
				typesInfo.setMemorySize(_ctx.integerValue("ListAvailableEcsTypesResponse.InstanceTypeFamilies["+ i +"].Types["+ j +"].MemorySize"));
				typesInfo.setEniQuantity(_ctx.integerValue("ListAvailableEcsTypesResponse.InstanceTypeFamilies["+ i +"].Types["+ j +"].EniQuantity"));

				List<String> zoneIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListAvailableEcsTypesResponse.InstanceTypeFamilies["+ i +"].Types["+ j +"].ZoneIds.Length"); k++) {
					zoneIds.add(_ctx.stringValue("ListAvailableEcsTypesResponse.InstanceTypeFamilies["+ i +"].Types["+ j +"].ZoneIds["+ k +"]"));
				}
				typesInfo.setZoneIds(zoneIds);

				types.add(typesInfo);
			}
			instanceTypeFamilyInfo.setTypes(types);

			instanceTypeFamilies.add(instanceTypeFamilyInfo);
		}
		listAvailableEcsTypesResponse.setInstanceTypeFamilies(instanceTypeFamilies);
	 
	 	return listAvailableEcsTypesResponse;
	}
}
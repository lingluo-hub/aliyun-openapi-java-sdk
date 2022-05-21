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

package com.aliyuncs.ots.transform.v20160620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ots.model.v20160620.ListVpcInfoByInstanceResponse;
import com.aliyuncs.ots.model.v20160620.ListVpcInfoByInstanceResponse.VpcInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpcInfoByInstanceResponseUnmarshaller {

	public static ListVpcInfoByInstanceResponse unmarshall(ListVpcInfoByInstanceResponse listVpcInfoByInstanceResponse, UnmarshallerContext _ctx) {
		
		listVpcInfoByInstanceResponse.setRequestId(_ctx.stringValue("ListVpcInfoByInstanceResponse.RequestId"));
		listVpcInfoByInstanceResponse.setPageNum(_ctx.longValue("ListVpcInfoByInstanceResponse.PageNum"));
		listVpcInfoByInstanceResponse.setPageSize(_ctx.longValue("ListVpcInfoByInstanceResponse.PageSize"));
		listVpcInfoByInstanceResponse.setTotalCount(_ctx.longValue("ListVpcInfoByInstanceResponse.TotalCount"));
		listVpcInfoByInstanceResponse.setInstanceName(_ctx.stringValue("ListVpcInfoByInstanceResponse.InstanceName"));

		List<VpcInfo> vpcInfos = new ArrayList<VpcInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListVpcInfoByInstanceResponse.VpcInfos.Length"); i++) {
			VpcInfo vpcInfo = new VpcInfo();
			vpcInfo.setVpcId(_ctx.stringValue("ListVpcInfoByInstanceResponse.VpcInfos["+ i +"].VpcId"));
			vpcInfo.setDomain(_ctx.stringValue("ListVpcInfoByInstanceResponse.VpcInfos["+ i +"].Domain"));
			vpcInfo.setInstanceVpcName(_ctx.stringValue("ListVpcInfoByInstanceResponse.VpcInfos["+ i +"].InstanceVpcName"));
			vpcInfo.setRegionNo(_ctx.stringValue("ListVpcInfoByInstanceResponse.VpcInfos["+ i +"].RegionNo"));
			vpcInfo.setEndpoint(_ctx.stringValue("ListVpcInfoByInstanceResponse.VpcInfos["+ i +"].Endpoint"));

			vpcInfos.add(vpcInfo);
		}
		listVpcInfoByInstanceResponse.setVpcInfos(vpcInfos);
	 
	 	return listVpcInfoByInstanceResponse;
	}
}
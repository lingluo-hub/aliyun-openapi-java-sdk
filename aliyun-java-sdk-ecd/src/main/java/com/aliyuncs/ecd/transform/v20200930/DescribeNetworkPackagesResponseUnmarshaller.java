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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeNetworkPackagesResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeNetworkPackagesResponse.NetworkPackage;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkPackagesResponseUnmarshaller {

	public static DescribeNetworkPackagesResponse unmarshall(DescribeNetworkPackagesResponse describeNetworkPackagesResponse, UnmarshallerContext _ctx) {
		
		describeNetworkPackagesResponse.setRequestId(_ctx.stringValue("DescribeNetworkPackagesResponse.RequestId"));
		describeNetworkPackagesResponse.setNextToken(_ctx.stringValue("DescribeNetworkPackagesResponse.NextToken"));

		List<NetworkPackage> networkPackages = new ArrayList<NetworkPackage>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkPackagesResponse.NetworkPackages.Length"); i++) {
			NetworkPackage networkPackage = new NetworkPackage();
			networkPackage.setNetworkPackageId(_ctx.stringValue("DescribeNetworkPackagesResponse.NetworkPackages["+ i +"].NetworkPackageId"));
			networkPackage.setBandwidth(_ctx.integerValue("DescribeNetworkPackagesResponse.NetworkPackages["+ i +"].Bandwidth"));
			networkPackage.setExpiredTime(_ctx.stringValue("DescribeNetworkPackagesResponse.NetworkPackages["+ i +"].ExpiredTime"));
			networkPackage.setCreateTime(_ctx.stringValue("DescribeNetworkPackagesResponse.NetworkPackages["+ i +"].CreateTime"));
			networkPackage.setOfficeSiteId(_ctx.stringValue("DescribeNetworkPackagesResponse.NetworkPackages["+ i +"].OfficeSiteId"));
			networkPackage.setInternetChargeType(_ctx.stringValue("DescribeNetworkPackagesResponse.NetworkPackages["+ i +"].InternetChargeType"));
			networkPackage.setNetworkPackageStatus(_ctx.stringValue("DescribeNetworkPackagesResponse.NetworkPackages["+ i +"].NetworkPackageStatus"));
			networkPackage.setOfficeSiteName(_ctx.stringValue("DescribeNetworkPackagesResponse.NetworkPackages["+ i +"].OfficeSiteName"));
			networkPackage.setOfficeSiteVpcType(_ctx.stringValue("DescribeNetworkPackagesResponse.NetworkPackages["+ i +"].OfficeSiteVpcType"));
			networkPackage.setVpcSnatPolicy(_ctx.stringValue("DescribeNetworkPackagesResponse.NetworkPackages["+ i +"].VpcSnatPolicy"));
			networkPackage.setQosType(_ctx.stringValue("DescribeNetworkPackagesResponse.NetworkPackages["+ i +"].QosType"));

			List<String> eipAddresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkPackagesResponse.NetworkPackages["+ i +"].EipAddresses.Length"); j++) {
				eipAddresses.add(_ctx.stringValue("DescribeNetworkPackagesResponse.NetworkPackages["+ i +"].EipAddresses["+ j +"]"));
			}
			networkPackage.setEipAddresses(eipAddresses);

			networkPackages.add(networkPackage);
		}
		describeNetworkPackagesResponse.setNetworkPackages(networkPackages);
	 
	 	return describeNetworkPackagesResponse;
	}
}
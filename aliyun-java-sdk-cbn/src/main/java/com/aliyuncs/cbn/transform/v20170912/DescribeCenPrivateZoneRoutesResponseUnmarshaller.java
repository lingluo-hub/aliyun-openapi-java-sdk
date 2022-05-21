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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.DescribeCenPrivateZoneRoutesResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeCenPrivateZoneRoutesResponse.PrivateZoneInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCenPrivateZoneRoutesResponseUnmarshaller {

	public static DescribeCenPrivateZoneRoutesResponse unmarshall(DescribeCenPrivateZoneRoutesResponse describeCenPrivateZoneRoutesResponse, UnmarshallerContext _ctx) {
		
		describeCenPrivateZoneRoutesResponse.setRequestId(_ctx.stringValue("DescribeCenPrivateZoneRoutesResponse.RequestId"));
		describeCenPrivateZoneRoutesResponse.setPrivateZoneDnsServers(_ctx.stringValue("DescribeCenPrivateZoneRoutesResponse.PrivateZoneDnsServers"));
		describeCenPrivateZoneRoutesResponse.setCenId(_ctx.stringValue("DescribeCenPrivateZoneRoutesResponse.CenId"));
		describeCenPrivateZoneRoutesResponse.setPageNumber(_ctx.integerValue("DescribeCenPrivateZoneRoutesResponse.PageNumber"));
		describeCenPrivateZoneRoutesResponse.setPageSize(_ctx.integerValue("DescribeCenPrivateZoneRoutesResponse.PageSize"));
		describeCenPrivateZoneRoutesResponse.setTotalCount(_ctx.integerValue("DescribeCenPrivateZoneRoutesResponse.TotalCount"));

		List<PrivateZoneInfo> privateZoneInfos = new ArrayList<PrivateZoneInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCenPrivateZoneRoutesResponse.PrivateZoneInfos.Length"); i++) {
			PrivateZoneInfo privateZoneInfo = new PrivateZoneInfo();
			privateZoneInfo.setStatus(_ctx.stringValue("DescribeCenPrivateZoneRoutesResponse.PrivateZoneInfos["+ i +"].Status"));
			privateZoneInfo.setAccessRegionId(_ctx.stringValue("DescribeCenPrivateZoneRoutesResponse.PrivateZoneInfos["+ i +"].AccessRegionId"));
			privateZoneInfo.setHostRegionId(_ctx.stringValue("DescribeCenPrivateZoneRoutesResponse.PrivateZoneInfos["+ i +"].HostRegionId"));
			privateZoneInfo.setHostVpcId(_ctx.stringValue("DescribeCenPrivateZoneRoutesResponse.PrivateZoneInfos["+ i +"].HostVpcId"));

			privateZoneInfos.add(privateZoneInfo);
		}
		describeCenPrivateZoneRoutesResponse.setPrivateZoneInfos(privateZoneInfos);
	 
	 	return describeCenPrivateZoneRoutesResponse;
	}
}
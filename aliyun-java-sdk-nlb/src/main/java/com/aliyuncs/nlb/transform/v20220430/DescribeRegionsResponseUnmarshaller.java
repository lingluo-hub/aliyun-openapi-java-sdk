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

package com.aliyuncs.nlb.transform.v20220430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nlb.model.v20220430.DescribeRegionsResponse;
import com.aliyuncs.nlb.model.v20220430.DescribeRegionsResponse.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionsResponseUnmarshaller {

	public static DescribeRegionsResponse unmarshall(DescribeRegionsResponse describeRegionsResponse, UnmarshallerContext _ctx) {
		
		describeRegionsResponse.setRequestId(_ctx.stringValue("DescribeRegionsResponse.RequestId"));
		describeRegionsResponse.setSuccess(_ctx.booleanValue("DescribeRegionsResponse.Success"));
		describeRegionsResponse.setCode(_ctx.stringValue("DescribeRegionsResponse.Code"));
		describeRegionsResponse.setMessage(_ctx.stringValue("DescribeRegionsResponse.Message"));
		describeRegionsResponse.setHttpStatusCode(_ctx.integerValue("DescribeRegionsResponse.HttpStatusCode"));
		describeRegionsResponse.setDynamicCode(_ctx.stringValue("DescribeRegionsResponse.DynamicCode"));
		describeRegionsResponse.setDynamicMessage(_ctx.stringValue("DescribeRegionsResponse.DynamicMessage"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionsResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setLocalName(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].LocalName"));
			region.setRegionEndpoint(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].RegionEndpoint"));
			region.setRegionId(_ctx.stringValue("DescribeRegionsResponse.Regions["+ i +"].RegionId"));

			regions.add(region);
		}
		describeRegionsResponse.setRegions(regions);
	 
	 	return describeRegionsResponse;
	}
}
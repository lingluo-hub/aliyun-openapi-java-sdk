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

package com.aliyuncs.cc5g.transform.v20220314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cc5g.model.v20220314.ListRegionsResponse;
import com.aliyuncs.cc5g.model.v20220314.ListRegionsResponse.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRegionsResponseUnmarshaller {

	public static ListRegionsResponse unmarshall(ListRegionsResponse listRegionsResponse, UnmarshallerContext _ctx) {
		
		listRegionsResponse.setRequestId(_ctx.stringValue("ListRegionsResponse.RequestId"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("ListRegionsResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setRegionId(_ctx.stringValue("ListRegionsResponse.Regions["+ i +"].RegionId"));
			region.setLocalName(_ctx.stringValue("ListRegionsResponse.Regions["+ i +"].LocalName"));

			regions.add(region);
		}
		listRegionsResponse.setRegions(regions);
	 
	 	return listRegionsResponse;
	}
}
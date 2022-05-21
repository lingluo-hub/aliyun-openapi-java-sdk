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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeRegionIspsResponse;
import com.aliyuncs.ens.model.v20171110.DescribeRegionIspsResponse.Isp;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionIspsResponseUnmarshaller {

	public static DescribeRegionIspsResponse unmarshall(DescribeRegionIspsResponse describeRegionIspsResponse, UnmarshallerContext _ctx) {
		
		describeRegionIspsResponse.setRequestId(_ctx.stringValue("DescribeRegionIspsResponse.RequestId"));

		List<Isp> isps = new ArrayList<Isp>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionIspsResponse.Isps.Length"); i++) {
			Isp isp = new Isp();
			isp.setCode(_ctx.stringValue("DescribeRegionIspsResponse.Isps["+ i +"].Code"));
			isp.setName(_ctx.stringValue("DescribeRegionIspsResponse.Isps["+ i +"].Name"));

			isps.add(isp);
		}
		describeRegionIspsResponse.setIsps(isps);
	 
	 	return describeRegionIspsResponse;
	}
}
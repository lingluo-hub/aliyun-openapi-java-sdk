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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeVSwitchesResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeVSwitchesResponse.VSwitch;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVSwitchesResponseUnmarshaller {

	public static DescribeVSwitchesResponse unmarshall(DescribeVSwitchesResponse describeVSwitchesResponse, UnmarshallerContext _ctx) {
		
		describeVSwitchesResponse.setRequestId(_ctx.stringValue("DescribeVSwitchesResponse.RequestId"));
		describeVSwitchesResponse.setTotalCount(_ctx.integerValue("DescribeVSwitchesResponse.TotalCount"));
		describeVSwitchesResponse.setMessage(_ctx.stringValue("DescribeVSwitchesResponse.Message"));
		describeVSwitchesResponse.setPageSize(_ctx.integerValue("DescribeVSwitchesResponse.PageSize"));
		describeVSwitchesResponse.setPageNumber(_ctx.integerValue("DescribeVSwitchesResponse.PageNumber"));
		describeVSwitchesResponse.setCode(_ctx.stringValue("DescribeVSwitchesResponse.Code"));
		describeVSwitchesResponse.setSuccess(_ctx.booleanValue("DescribeVSwitchesResponse.Success"));

		List<VSwitch> vSwitches = new ArrayList<VSwitch>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVSwitchesResponse.VSwitches.Length"); i++) {
			VSwitch vSwitch = new VSwitch();
			vSwitch.setIsDefault(_ctx.booleanValue("DescribeVSwitchesResponse.VSwitches["+ i +"].IsDefault"));
			vSwitch.setAvailableSelectionInfo(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].AvailableSelectionInfo"));
			vSwitch.setZoneId(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].ZoneId"));
			vSwitch.setName(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].Name"));
			vSwitch.setId(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].Id"));

			vSwitches.add(vSwitch);
		}
		describeVSwitchesResponse.setVSwitches(vSwitches);
	 
	 	return describeVSwitchesResponse;
	}
}
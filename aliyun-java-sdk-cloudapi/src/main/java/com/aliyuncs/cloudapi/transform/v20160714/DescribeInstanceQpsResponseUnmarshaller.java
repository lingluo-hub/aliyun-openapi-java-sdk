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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeInstanceQpsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeInstanceQpsResponse.MonitorItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceQpsResponseUnmarshaller {

	public static DescribeInstanceQpsResponse unmarshall(DescribeInstanceQpsResponse describeInstanceQpsResponse, UnmarshallerContext _ctx) {
		
		describeInstanceQpsResponse.setRequestId(_ctx.stringValue("DescribeInstanceQpsResponse.RequestId"));

		List<MonitorItem> instanceQps = new ArrayList<MonitorItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceQpsResponse.InstanceQps.Length"); i++) {
			MonitorItem monitorItem = new MonitorItem();
			monitorItem.setItemValue(_ctx.stringValue("DescribeInstanceQpsResponse.InstanceQps["+ i +"].ItemValue"));
			monitorItem.setItemTime(_ctx.stringValue("DescribeInstanceQpsResponse.InstanceQps["+ i +"].ItemTime"));

			instanceQps.add(monitorItem);
		}
		describeInstanceQpsResponse.setInstanceQps(instanceQps);
	 
	 	return describeInstanceQpsResponse;
	}
}
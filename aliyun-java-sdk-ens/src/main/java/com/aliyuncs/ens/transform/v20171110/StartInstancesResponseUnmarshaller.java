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

import com.aliyuncs.ens.model.v20171110.StartInstancesResponse;
import com.aliyuncs.ens.model.v20171110.StartInstancesResponse.InstanceResponsesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartInstancesResponseUnmarshaller {

	public static StartInstancesResponse unmarshall(StartInstancesResponse startInstancesResponse, UnmarshallerContext _ctx) {
		
		startInstancesResponse.setRequestId(_ctx.stringValue("StartInstancesResponse.RequestId"));

		List<InstanceResponsesItem> instanceResponses = new ArrayList<InstanceResponsesItem>();
		for (int i = 0; i < _ctx.lengthValue("StartInstancesResponse.InstanceResponses.Length"); i++) {
			InstanceResponsesItem instanceResponsesItem = new InstanceResponsesItem();
			instanceResponsesItem.setCode(_ctx.longValue("StartInstancesResponse.InstanceResponses["+ i +"].Code"));
			instanceResponsesItem.setMessage(_ctx.stringValue("StartInstancesResponse.InstanceResponses["+ i +"].Message"));
			instanceResponsesItem.setInstanceId(_ctx.stringValue("StartInstancesResponse.InstanceResponses["+ i +"].InstanceId"));

			instanceResponses.add(instanceResponsesItem);
		}
		startInstancesResponse.setInstanceResponses(instanceResponses);
	 
	 	return startInstancesResponse;
	}
}
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

import com.aliyuncs.ehpc.model.v20180412.CreateHybridClusterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateHybridClusterResponseUnmarshaller {

	public static CreateHybridClusterResponse unmarshall(CreateHybridClusterResponse createHybridClusterResponse, UnmarshallerContext _ctx) {
		
		createHybridClusterResponse.setRequestId(_ctx.stringValue("CreateHybridClusterResponse.RequestId"));
		createHybridClusterResponse.setClusterId(_ctx.stringValue("CreateHybridClusterResponse.ClusterId"));
		createHybridClusterResponse.setTaskId(_ctx.stringValue("CreateHybridClusterResponse.TaskId"));
	 
	 	return createHybridClusterResponse;
	}
}
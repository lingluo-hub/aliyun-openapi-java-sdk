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

package com.aliyuncs.pts.transform.v20201020;

import com.aliyuncs.pts.model.v20201020.StartDebugPtsSceneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartDebugPtsSceneResponseUnmarshaller {

	public static StartDebugPtsSceneResponse unmarshall(StartDebugPtsSceneResponse startDebugPtsSceneResponse, UnmarshallerContext _ctx) {
		
		startDebugPtsSceneResponse.setRequestId(_ctx.stringValue("StartDebugPtsSceneResponse.RequestId"));
		startDebugPtsSceneResponse.setMessage(_ctx.stringValue("StartDebugPtsSceneResponse.Message"));
		startDebugPtsSceneResponse.setPlanId(_ctx.stringValue("StartDebugPtsSceneResponse.PlanId"));
		startDebugPtsSceneResponse.setHttpStatusCode(_ctx.integerValue("StartDebugPtsSceneResponse.HttpStatusCode"));
		startDebugPtsSceneResponse.setCode(_ctx.stringValue("StartDebugPtsSceneResponse.Code"));
		startDebugPtsSceneResponse.setSuccess(_ctx.booleanValue("StartDebugPtsSceneResponse.Success"));
	 
	 	return startDebugPtsSceneResponse;
	}
}
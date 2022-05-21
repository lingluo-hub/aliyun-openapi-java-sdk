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

package com.aliyuncs.workbench_ide.transform.v20210121;

import com.aliyuncs.workbench_ide.model.v20210121.PublishSolutionResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class PublishSolutionResponseUnmarshaller {

	public static PublishSolutionResponse unmarshall(PublishSolutionResponse publishSolutionResponse, UnmarshallerContext _ctx) {
		
		publishSolutionResponse.setRequestId(_ctx.stringValue("PublishSolutionResponse.RequestId"));
		publishSolutionResponse.setCode(_ctx.stringValue("PublishSolutionResponse.Code"));
		publishSolutionResponse.setMessage(_ctx.stringValue("PublishSolutionResponse.Message"));
		publishSolutionResponse.setData(_ctx.mapValue("PublishSolutionResponse.Data"));
	 
	 	return publishSolutionResponse;
	}
}
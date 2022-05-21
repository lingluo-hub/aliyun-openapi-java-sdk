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

import com.aliyuncs.workbench_ide.model.v20210121.AddAppResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddAppResponseUnmarshaller {

	public static AddAppResponse unmarshall(AddAppResponse addAppResponse, UnmarshallerContext _ctx) {
		
		addAppResponse.setRequestId(_ctx.stringValue("AddAppResponse.RequestId"));
		addAppResponse.setCode(_ctx.stringValue("AddAppResponse.Code"));
		addAppResponse.setMessage(_ctx.stringValue("AddAppResponse.Message"));
		addAppResponse.setData(_ctx.mapValue("AddAppResponse.Data"));
	 
	 	return addAppResponse;
	}
}
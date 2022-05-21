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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DeleteRenderingDevicesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRenderingDevicesResponseUnmarshaller {

	public static DeleteRenderingDevicesResponse unmarshall(DeleteRenderingDevicesResponse deleteRenderingDevicesResponse, UnmarshallerContext _ctx) {
		
		deleteRenderingDevicesResponse.setRequestId(_ctx.stringValue("DeleteRenderingDevicesResponse.RequestId"));

		List<String> failedIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteRenderingDevicesResponse.FailedIds.Length"); i++) {
			failedIds.add(_ctx.stringValue("DeleteRenderingDevicesResponse.FailedIds["+ i +"]"));
		}
		deleteRenderingDevicesResponse.setFailedIds(failedIds);
	 
	 	return deleteRenderingDevicesResponse;
	}
}
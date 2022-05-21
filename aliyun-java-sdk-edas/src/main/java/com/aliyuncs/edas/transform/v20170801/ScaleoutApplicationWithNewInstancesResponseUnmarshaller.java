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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ScaleoutApplicationWithNewInstancesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ScaleoutApplicationWithNewInstancesResponseUnmarshaller {

	public static ScaleoutApplicationWithNewInstancesResponse unmarshall(ScaleoutApplicationWithNewInstancesResponse scaleoutApplicationWithNewInstancesResponse, UnmarshallerContext _ctx) {
		
		scaleoutApplicationWithNewInstancesResponse.setRequestId(_ctx.stringValue("ScaleoutApplicationWithNewInstancesResponse.RequestId"));
		scaleoutApplicationWithNewInstancesResponse.setChangeOrderId(_ctx.stringValue("ScaleoutApplicationWithNewInstancesResponse.ChangeOrderId"));
		scaleoutApplicationWithNewInstancesResponse.setCode(_ctx.integerValue("ScaleoutApplicationWithNewInstancesResponse.Code"));
		scaleoutApplicationWithNewInstancesResponse.setMessage(_ctx.stringValue("ScaleoutApplicationWithNewInstancesResponse.Message"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ScaleoutApplicationWithNewInstancesResponse.InstanceIds.Length"); i++) {
			instanceIds.add(_ctx.stringValue("ScaleoutApplicationWithNewInstancesResponse.InstanceIds["+ i +"]"));
		}
		scaleoutApplicationWithNewInstancesResponse.setInstanceIds(instanceIds);
	 
	 	return scaleoutApplicationWithNewInstancesResponse;
	}
}
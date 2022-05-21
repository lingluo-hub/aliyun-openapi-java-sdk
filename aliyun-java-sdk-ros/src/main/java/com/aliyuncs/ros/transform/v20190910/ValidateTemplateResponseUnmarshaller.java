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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.ValidateTemplateResponse;
import com.aliyuncs.ros.model.v20190910.ValidateTemplateResponse.Output;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ValidateTemplateResponseUnmarshaller {

	public static ValidateTemplateResponse unmarshall(ValidateTemplateResponse validateTemplateResponse, UnmarshallerContext _ctx) {
		
		validateTemplateResponse.setRequestId(_ctx.stringValue("ValidateTemplateResponse.RequestId"));
		validateTemplateResponse.setDescription(_ctx.stringValue("ValidateTemplateResponse.Description"));

		List<Map<Object, Object>> parameters = _ctx.listMapValue("ValidateTemplateResponse.Parameters");
		validateTemplateResponse.setParameters(parameters);

		List<Output> outputs = new ArrayList<Output>();
		for (int i = 0; i < _ctx.lengthValue("ValidateTemplateResponse.Outputs.Length"); i++) {
			Output output = new Output();
			output.setOutputKey(_ctx.stringValue("ValidateTemplateResponse.Outputs["+ i +"].OutputKey"));
			output.setDescription(_ctx.stringValue("ValidateTemplateResponse.Outputs["+ i +"].Description"));

			outputs.add(output);
		}
		validateTemplateResponse.setOutputs(outputs);
	 
	 	return validateTemplateResponse;
	}
}
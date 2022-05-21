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

package com.aliyuncs.facebody.transform.v20191230;

import com.aliyuncs.facebody.model.v20191230.RetouchBodyResponse;
import com.aliyuncs.facebody.model.v20191230.RetouchBodyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RetouchBodyResponseUnmarshaller {

	public static RetouchBodyResponse unmarshall(RetouchBodyResponse retouchBodyResponse, UnmarshallerContext _ctx) {
		
		retouchBodyResponse.setRequestId(_ctx.stringValue("RetouchBodyResponse.RequestId"));
		retouchBodyResponse.setCode(_ctx.stringValue("RetouchBodyResponse.Code"));
		retouchBodyResponse.setMessage(_ctx.stringValue("RetouchBodyResponse.Message"));

		Data data = new Data();
		data.setImageURL(_ctx.stringValue("RetouchBodyResponse.Data.ImageURL"));
		retouchBodyResponse.setData(data);
	 
	 	return retouchBodyResponse;
	}
}
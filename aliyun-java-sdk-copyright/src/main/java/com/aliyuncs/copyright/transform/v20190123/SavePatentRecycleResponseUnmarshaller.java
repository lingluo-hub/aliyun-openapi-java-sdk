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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.SavePatentRecycleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SavePatentRecycleResponseUnmarshaller {

	public static SavePatentRecycleResponse unmarshall(SavePatentRecycleResponse savePatentRecycleResponse, UnmarshallerContext _ctx) {
		
		savePatentRecycleResponse.setRequestId(_ctx.stringValue("SavePatentRecycleResponse.RequestId"));

		List<String> id = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SavePatentRecycleResponse.Id.Length"); i++) {
			id.add(_ctx.stringValue("SavePatentRecycleResponse.Id["+ i +"]"));
		}
		savePatentRecycleResponse.setId(id);
	 
	 	return savePatentRecycleResponse;
	}
}
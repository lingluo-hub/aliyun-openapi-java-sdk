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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.ListIspTypesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIspTypesResponseUnmarshaller {

	public static ListIspTypesResponse unmarshall(ListIspTypesResponse listIspTypesResponse, UnmarshallerContext _ctx) {
		
		listIspTypesResponse.setRequestId(_ctx.stringValue("ListIspTypesResponse.RequestId"));

		List<String> ispTypeList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListIspTypesResponse.IspTypeList.Length"); i++) {
			ispTypeList.add(_ctx.stringValue("ListIspTypesResponse.IspTypeList["+ i +"]"));
		}
		listIspTypesResponse.setIspTypeList(ispTypeList);
	 
	 	return listIspTypesResponse;
	}
}